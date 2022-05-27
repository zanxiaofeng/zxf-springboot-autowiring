package zxf.springboot.autowiring.onconstructor;

import org.springframework.stereotype.Component;

//默认的Bean name为fooFormatter，如果不处理就有冲突
@Component("onconstructor.FooFormatter")
public class FooFormatter {
    public String format(){
        return "Foo";
    }
}
