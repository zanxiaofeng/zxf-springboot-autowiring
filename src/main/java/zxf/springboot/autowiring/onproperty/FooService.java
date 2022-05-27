package zxf.springboot.autowiring.onproperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//默认的Bean name为fooService，如果不处理就有冲突
@Component("onproperty.FooService")
public class FooService {
    @Autowired
    private FooFormatter fooFormatter;
}
