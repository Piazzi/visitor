public interface Visitor {

    String visitWorker(Worker worker);
    String visitClient(Client client);

}
