package micronaut.type.converters;

class FooBar {

    private final Foo foo;
    private final Bar bar;

    FooBar(Foo foo, Bar bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public Foo getFoo() {
        return foo;
    }

    public Bar getBar() {
        return bar;
    }
}
