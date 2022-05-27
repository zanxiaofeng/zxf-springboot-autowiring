package zxf.springboot.autowiring.onsetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//默认的Bean name为fooService，如果不处理就有冲突
@Component("onsetter.FooService")
public class FooService {
    private FooFormatter fooFormatter;

    @Autowired
    public void setFooFormatter(FooFormatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }
}
