package micronaut.type.converters;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller
public class FooBarController {

    @Get("/foo/{foo}")
    public Foo foo(@PathVariable(name = "foo") Foo foo) {
        return foo;
    }

    @Get("/bar/{bar}")
    public Bar bar(@PathVariable(name = "bar") Bar bar) {
        return bar;
    }

    @Get("/foobar/{foo}/{bar}")
    public FooBar fooBar(
        @PathVariable(name = "foo") Foo foo,
        @PathVariable(name = "bar") Bar bar
    ) {
        return new FooBar(foo, bar);
    }

}
