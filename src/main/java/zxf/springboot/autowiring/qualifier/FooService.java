package zxf.springboot.autowiring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//默认的Bean name为fooService，如果不处理就有冲突
@Component("qualifier.FooService")
public class FooService {
    @Autowired
    @Qualifier("qualifier.FooFormatter")
    private Formatter fooFormatter;

    @Autowired
    @Qualifier("qualifier.BarFormatter")
    private Formatter barFormatter;
}
