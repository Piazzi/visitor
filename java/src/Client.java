public class Client implements Person {

    private String name;
    private String job;

    public Client(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String accept(Visitor visitor) {
        return visitor.visitClient(this);
    }

}
