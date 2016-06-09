package ru.ltst.saturday_data_binding.ui.datachanging;

public enum LastNames {

    PETROV("Petrov"),
    IVANOV("Ivanov"),
    VLADIMIROV("Vladimirov");

    private String lastName;

    LastNames(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
