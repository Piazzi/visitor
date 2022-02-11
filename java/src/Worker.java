public class Worker implements Person {

    private int id;
    private String name;
    private Company company;

    public Worker(int id, String name, Company company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return this.company.getName();
    }

    public String accept(Visitor visitor) {
        return visitor.visitWorker(this);
    }

}
