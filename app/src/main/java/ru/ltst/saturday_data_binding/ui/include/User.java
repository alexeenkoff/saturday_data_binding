package ru.ltst.saturday_data_binding.ui.include;

public class User {

    private String firstName;
    private String lastName;
    private String phone;
    private int age;
    private String email;

    public User(String firstName, String lastName, String phone, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
