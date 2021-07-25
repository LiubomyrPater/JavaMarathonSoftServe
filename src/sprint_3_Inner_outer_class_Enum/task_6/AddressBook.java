package sprint_3_Inner_outer_class_Enum.task_6;

import java.util.*;

public class AddressBook implements Iterable<String>{
    private NameAddressPair[] addressBook;
    private int counter = 0;

    public AddressBook(int capacity){
        addressBook = new NameAddressPair[capacity];
    }

    public boolean create(String firstName, String lastName, String address){
        for (String s : this) {
            if (s.contains(String.format("First name: %s, Last name: %s", firstName, lastName))) {
                return false;
            }
        }
        if ((addressBook.length - counter) == 1){
            addressBook = Arrays.copyOf(addressBook, addressBook.length*2);
        }
        addressBook[counter++] = new NameAddressPair(new NameAddressPair.Person(firstName, lastName), address);
        return true;
    }

    public String read(String firstName, String lastName){
        String fulName = String.format("First name: %s, Last name: %s, Address: ", firstName, lastName);
        for (String s : this) {
            if (s.contains(fulName)) {
                return s.substring(fulName.length());
            }
        }
        return null;
    }

    public boolean update(String firstName, String lastName, String address){
        int number = 0;
        for (String s : this) {
            if (s.contains(String.format("First name: %s, Last name: %s", firstName, lastName))) {
                addressBook[number].address = address;
                return true;
            }
            number++;
        }
        return false;
    }

    public boolean delete(String firstName, String lastName){
        int count = 0;
        for (String s : this) {
            if (s.contains(String.format("First name: %s, Last name: %s", firstName, lastName))) {
                while (count < counter - 1) {
                    addressBook[count] = addressBook[++count];
                }
                addressBook[counter-1] = null;
                counter--;
                return true;
            }
            count++;
        }
        return false;
    }

    public int size(){
        return counter;
    }

    public void sortedBy(SortOrder sortOrder){
        Arrays.sort(addressBook, 0, counter, new Comparator<NameAddressPair>() {
            @Override
            public int compare(NameAddressPair o1, NameAddressPair o2) {
                return o1.person.firstName.equals(o2.person.firstName)
                        ? o1.person.lastName.compareTo(o2.person.lastName)
                        : o1.person.firstName.compareTo(o2.person.firstName);
            }
        });
        if (sortOrder.equals(SortOrder.DESC))
            Arrays.sort(addressBook, Collections.reverseOrder());
    }

    @Override
    public AddressBookIterator iterator() {
        return new AddressBookIterator();
    }


    private class AddressBookIterator implements Iterator<String>{
        private int counter = 0;

        @Override
        public boolean hasNext() {
            return this.counter < size();
        }

        @Override
        public String next() {
            return addressBook[this.counter].person + ", Address: " + addressBook[this.counter++].address;
        }
    }


    private static class NameAddressPair {
        private final Person person;
        private String address;

        private NameAddressPair(Person person, String address){
            this.person = person;
            this.address = address;
        }

        private final static class Person {
            private final String firstName;
            private final String lastName;

            private Person(String firstName, String lastName){
                this.firstName = firstName;
                this.lastName = lastName;
            }

            @Override
            public boolean equals(Object object) {
                if (this == object) return true;
                if (object == null || getClass() != object.getClass()) return false;
                Person person = (Person) object;
                return Objects.equals(firstName, person.firstName) &&
                        Objects.equals(lastName, person.lastName);
            }

            @Override
            public String toString() {
                return "First name: " + firstName + ", Last name: " + lastName;
            }
        }
    }
}

enum SortOrder{
    ASC, DESC
}