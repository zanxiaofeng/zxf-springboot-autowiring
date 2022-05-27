package zxf.springboot.autowiring.qualifier.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    @MoveQualifier(format = MoveQualifier.Format.VHS, genre = "Action")
    public MovieCatalog actionVhsCatalog() {
        return new MovieCatalog("Action with VHS");
    }

    @Bean
    @MoveQualifier(format = MoveQualifier.Format.VHS, genre = "Comedy")
    public MovieCatalog comedyVhsCatalog() {
        return new MovieCatalog("Comedy with VHS");
    }

    @Bean
    @MoveQualifier(format = MoveQualifier.Format.DVD, genre = "Action")
    public MovieCatalog actionDvdCatalog() {
        return new MovieCatalog("Action with DVD");
    }

    @Bean
    @MoveQualifier(format = MoveQualifier.Format.DVD, genre = "Comedy")
    public MovieCatalog comedyDvdCatalog() {
        return new MovieCatalog("Comedy with DVD");
    }
}
