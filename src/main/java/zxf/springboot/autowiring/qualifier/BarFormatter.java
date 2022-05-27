package zxf.springboot.autowiring.qualifier;

import org.springframework.stereotype.Component;

@Component("qualifier.BarFormatter")
public class BarFormatter implements Formatter {
    public String format() {
        return "Bar";
    }
}
