package zxf.springboot.autowiring.qualifier.custom;

public class MovieCatalog {
    private final String type;

    public MovieCatalog(String type) {
        this.type = type;
    }

    public String test() {
        return type;
    }
}
