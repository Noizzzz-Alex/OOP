import java.util.List;

abstract class JobAgency{
    protected String name;
    public JobAgency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
