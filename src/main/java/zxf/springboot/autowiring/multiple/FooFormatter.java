package zxf.springboot.autowiring.multiple;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("multiple.FooFormatter")
@Order(1)
public class FooFormatter implements Formatter {
    public String format() {
        return "Foo";
    }
}
