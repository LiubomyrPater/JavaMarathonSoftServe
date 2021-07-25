package sprint_5_Exceptions.task_4;

import java.util.regex.Pattern;

public class Person {
    private String firstName;
    private String lastName;
    private String idCode;

    private static String nameEx = "Incorrect value %s for %s " +
            "(should start from upper case and contains only alphabetic characters and symbols -, _)";

    public Person() {}

    public void setFirstName(String firstName) throws NameException{
        if (!firstName.matches("[A-Z][a-z]*"))
            throw new NameException(String.format(nameEx, firstName, "firstName"));
        this.firstName = firstName;
    }
    public void setFirstName2(String firstName) throws NameException{
        if (!Pattern.matches("[A-Z][a-z]*", firstName))
            throw new NameException(String.format(nameEx, firstName, "firstName"));
        this.firstName = firstName;
    }

    public void setLastName(String lastName) throws NameException{
        if (!lastName.matches("[A-Z][a-z]*"))
            throw new NameException(String.format(nameEx, lastName, "lastName"));
        this.lastName = lastName;
    }

    public void setIdCode(String idCode) throws CodeException{
        if (!idCode.matches("\\d{10}"))
            throw new CodeException("Incorrect value " + idCode + " for code (should contains exactly 10 digits)");
        this.idCode = idCode;
    }

    public static Person buildPerson(String firstName, String lastName, String idCode)throws IllegalArgumentException{
        Person person = new Person();
        StringBuilder message = new StringBuilder();
        boolean hasPreviousMessage = false;

        try{
            person.setFirstName(firstName);
        }catch (NameException e){
            message.append(e.getMessage());
            hasPreviousMessage = true;
        }

        try{
            person.setLastName(lastName);
        }catch (NameException e){
            if (hasPreviousMessage)
                message.append("; ");
            message.append(e.getMessage());
            hasPreviousMessage = true;
        }

        try{
            person.setIdCode(idCode);
        }catch (CodeException e){
            if (hasPreviousMessage)
                message.append("; ");
            message.append(e.getMessage());
            hasPreviousMessage = true;
        }

        if (hasPreviousMessage)
            throw new IllegalArgumentException(message.toString());
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        return idCode != null ? idCode.equals(person.idCode) : person.idCode == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (idCode != null ? idCode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %s", firstName, lastName, idCode);
    }
}
