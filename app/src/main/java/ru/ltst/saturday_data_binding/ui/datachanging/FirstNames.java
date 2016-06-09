package ru.ltst.saturday_data_binding.ui.datachanging;

public enum FirstNames {

    IVAN("Ivan"),
    PETR("Petr"),
    VLADIMIR("Vladimir");

    private String name;

    FirstNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
