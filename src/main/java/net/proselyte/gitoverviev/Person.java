package net.proselyte.gitoverviev;

public class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + super.getId() + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
