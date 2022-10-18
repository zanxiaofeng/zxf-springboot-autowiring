package zxf.springboot.autowiring.multiple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

//默认的Bean name为fooService，如果不处理就有冲突
@Component("multiple.FooService")
public class FooService {
    @Autowired
    private List<Formatter> formatters;
}
