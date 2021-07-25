package sprint_3_Inner_outer_class_Enum.task_6;


import java.util.Arrays;

public class Main_6 {
    public static void main(String[] args){

        System.out.println("createTest_1():   " + createTest_1());
        System.out.println("createTest_2():   " + createTest_2());
        System.out.println("createTest_3():   " + createTest_3());
        System.out.println("createTest_4():   " + createTest_4());
        System.out.println("readTest_1():     " + readTest_1());
        System.out.println("readTest_2():     " + readTest_2());
        System.out.println("updateTest_1():   " + updateTest_1());
        System.out.println("updateTest_2():   " + updateTest_2());
        System.out.println("deleteTest_1():   " + deleteTest_1());
        System.out.println("deleteTest_2():   " + deleteTest_2());
        System.out.println("sizeTest_1():     " + sizeTest_1());
        System.out.println("sizeTest_2():     " + sizeTest_2());
        System.out.println("sizeTest_3():     " + sizeTest_3());
        System.out.println("iteratorTest():   " + iteratorTest());
        System.out.println("sortedByTest_1(): " + sortedByTest_1());

    }


    /* Creating the address book any size */
    private static boolean createTest_1(){
        AddressBook addressBook = new AddressBook(100);
        return addressBook != null;
    }


    /* Creating the address book size 4 and add 3 records with different key */
    private static boolean createTest_2(){
        int counter = 0;
        AddressBook addressBook = new AddressBook(4);
        counter += addressBook.create("John", "Brown", "Address #1") ? 1 : 0;
        counter += addressBook.create("Karen", "Davis", "Address #2") ? 1 : 0;
        counter += addressBook.create("Steven", "Taylor", "Address #1") ? 1 : 0;
        return counter == 3;
    }

    /* Creating the address book size 4 and add 3 records with same key */
    private static boolean createTest_3(){
        int counter = 0;
        AddressBook addressBook = new AddressBook(4);
        counter += addressBook.create("John", "Brown", "Address #1") ? 1 : 0;
        counter += addressBook.create("John", "Brown", "Address #2") ? 1 : 0;
        counter += addressBook.create("John", "Brown", "Address #1") ? 1 : 0;
        return counter == 1;
    }


    /* Creating the address book size 2 and add 3 records with different key */
    private static boolean createTest_4(){
        int counter = 0;
        AddressBook addressBook = new AddressBook(2);
        counter += addressBook.create("John", "Brown", "Address #1") ? 1 : 0;
        counter += addressBook.create("Karen", "Davis", "Address #2") ? 1 : 0;
        counter += addressBook.create("Steven", "Taylor", "Address #1") ? 1 : 0;
        return counter == 3;
    }


    /* Reading record from the address book using existing key */
    private static boolean readTest_1(){
        AddressBook addressBook = new AddressBook(4);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");
        String record = addressBook.read("Karen", "Davis");
        return record.equals("Address #2");
    }


    /* Reading record from the address book using not existing key */
    private static boolean readTest_2(){
        AddressBook addressBook = new AddressBook(4);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");
        return addressBook.read("Susan", "Brown") == null;
    }


    /* Updating record from the address book using existing key */
    private static boolean updateTest_1(){
        boolean status = false;
        AddressBook addressBook = new AddressBook(4);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");
        status = addressBook.update("Steven", "Taylor", "Address #3");
        return status && addressBook.read("Steven", "Taylor").equals("Address #3");
    }


    /* Updating record from the address book using not existing key */
    private static boolean updateTest_2(){
        AddressBook addressBook = new AddressBook(4);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");
        return !addressBook.update("Susan", "Brown", "Address #3");
    }


    /* Deleting record from the address book using existing key */
    private static boolean deleteTest_1(){
        boolean status = false;
        AddressBook addressBook = new AddressBook(4);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");
        status = addressBook.delete("Steven", "Taylor");
        return status && addressBook.read("Steven", "Taylor") == null;
    }


    /* Deleting record from the address book using not existing key */
    private static boolean deleteTest_2(){
        AddressBook addressBook = new AddressBook(4);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");
        return !addressBook.delete("Susan", "Brown");
    }


    /* Checking size the empty address book */
    private static boolean sizeTest_1(){
        AddressBook addressBook = new AddressBook(4);
        return addressBook.size() == 0;
    }


    /* Changing size the address book when added new record */
    private static boolean sizeTest_2(){
        AddressBook addressBook = new AddressBook(4);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");
        return addressBook.size() == 3;
    }


    /* Changing size the address book when record removed */
    private static boolean sizeTest_3(){
        AddressBook addressBook = new AddressBook(4);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");
        addressBook.delete("John", "Brown");
        addressBook.delete("Karen", "Davis");
        return addressBook.size() == 1;
    }


    /* Iterate across records inside the address book using "for-each" loop */
    private static boolean iteratorTest(){
        String[] expected = {"First name: Karen, Last name: Davis, Address: Address #2",
                "First name: Steven, Last name: Taylor, Address: Address #3",
                "First name: Susan, Last name: Brown, Address: Address #4"};
        String[] actual = new String[3];
        AddressBook addressBook = new AddressBook(4);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("Steven", "Taylor", "Address #1");
        addressBook.create("Susan", "Brown", "Address #4");
        addressBook.update("Steven", "Taylor", "Address #3");
        addressBook.delete("John", "Brown");
        int counter = 0;
        for (Object record : addressBook)
            actual[counter++] = record.toString();
        return Arrays.equals(expected, actual);
    }


    /* Sorting records inside the address book by ASC */
    private static boolean sortedByTest_1(){
        String[] expected = { "First name: John, Last name: Brown, Address: Address #1",
                "First name: John, Last name: Taylor, Address: Address #1",
                "First name: Karen, Last name: Davis, Address: Address #2",
                "First name: Susan, Last name: Brown, Address: Address #4" };
        String[] actual = new String[4];
        AddressBook addressBook = new AddressBook(4);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Susan", "Brown", "Address #4");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("John", "Taylor", "Address #1");
        addressBook.sortedBy(SortOrder.ASC);
        int counter = 0;
        for (Object record : addressBook)
            actual[counter++] = record.toString();
        return Arrays.equals(expected, actual);
    }
}
