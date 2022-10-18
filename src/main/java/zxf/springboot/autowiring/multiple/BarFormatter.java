package zxf.springboot.autowiring.multiple;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("multiple.BarFormatter")
@Order(2)
public class BarFormatter implements Formatter {
    public String format() {
        return "Bar";
    }
}
