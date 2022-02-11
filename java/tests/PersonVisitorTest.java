import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonVisitorTest {

    @Test
    void shouldVisitWorker() {
        Worker worker = new Worker(1, "Ana", new Company("Nubank"));

        PersonVisitor visitor = new PersonVisitor();
        assertEquals("Worker{id=1, name='Ana', company=Nubank}", visitor.visit(worker));
    }

    @Test
    void ShouldVisitClient() {
        Client client = new Client("Lucas", "Teacher");

        PersonVisitor visitor = new PersonVisitor();
        assertEquals("Client{job='Teacher', name='Lucas'}", visitor.visit(client));
    }



}