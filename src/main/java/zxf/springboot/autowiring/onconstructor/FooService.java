package zxf.springboot.autowiring.onconstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//默认的Bean name为fooService，如果不处理就有冲突
@Component("onconstructor.FooService")
public class FooService {
    private FooFormatter fooFormatter;

    @Autowired
    public FooService(FooFormatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }
}
