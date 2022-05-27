package zxf.springboot.autowiring.qualifier;

import org.springframework.stereotype.Component;

@Component("qualifier.FooFormatter")
public class FooFormatter implements Formatter {
    public String format() {
        return "Foo";
    }
}
