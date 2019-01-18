package micronaut.type.converters;

class Foo {

    private final String value;

    Foo(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}