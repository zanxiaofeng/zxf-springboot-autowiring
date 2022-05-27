package zxf.springboot.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zxf.springboot.autowiring.qualifier.custom.MovieRecommender;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {
    @Autowired
    private MovieRecommender movieRecommender;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void setup() {
        movieRecommender.test();
    }
}
