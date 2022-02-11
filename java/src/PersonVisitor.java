public class PersonVisitor implements Visitor {

    public String visit(Person pessoa) {
        return pessoa.accept(this);
    }

    @Override
    public String visitWorker(Worker worker) {
        return "Worker{" +
                "id=" + worker.getId() +
                ", name='" + worker.getName() + '\'' +
                ", company=" + worker.getCompanyName() +
                '}';
    }

    @Override
    public String visitClient(Client client) {
        return "Client{" +
                "job='" + client.getJob() +'\'' +
                ", name='" + client.getName() + '\'' +
                '}';
    }


}