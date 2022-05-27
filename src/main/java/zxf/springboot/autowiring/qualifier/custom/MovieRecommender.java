package zxf.springboot.autowiring.qualifier.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {
    @Autowired
    @MoveQualifier(format = MoveQualifier.Format.VHS, genre = "Action")
    private MovieCatalog actionVhsCatalog;

    @Autowired
    @MoveQualifier(format = MoveQualifier.Format.VHS, genre = "Comedy")
    private MovieCatalog comedyVhsCatalog;

    @Autowired
    @MoveQualifier(format = MoveQualifier.Format.DVD, genre = "Action")
    private MovieCatalog actionDvdCatalog;

    @Autowired
    @MoveQualifier(format = MoveQualifier.Format.DVD, genre = "Comedy")
    private MovieCatalog comedyDvdCatalog;

    public void test() {
        System.out.println("Type 1: " + actionVhsCatalog.test());
        System.out.println("Type 2: " + comedyVhsCatalog.test());
        System.out.println("Type 3: " + actionDvdCatalog.test());
        System.out.println("Type 4: " + comedyDvdCatalog.test());
    }
}
