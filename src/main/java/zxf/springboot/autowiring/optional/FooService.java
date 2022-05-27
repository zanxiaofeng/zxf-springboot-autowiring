package zxf.springboot.autowiring.optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//默认的Bean name为fooService，如果不处理就有冲突
@Component("optional.FooService")
public class FooService {
    @Autowired(required = false)
    private FooFormatter fooFormatter;
}
