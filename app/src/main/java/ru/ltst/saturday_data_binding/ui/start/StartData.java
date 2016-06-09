package ru.ltst.saturday_data_binding.ui.start;

public class StartData {
    private final String someString;
    private final int someInt;
    private final char someChar;

    public StartData(String someString, int someInt, char someChar) {
        this.someString = someString;
        this.someInt = someInt;
        this.someChar = someChar;
    }

    public String getSomeString() {
        return someString;
    }

    public int getSomeInt() {
        return someInt;
    }

    public char getSomeChar() {
        return someChar;
    }
}
