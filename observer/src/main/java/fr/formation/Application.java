package fr.formation;

public class Application {
    public static void main(String[] args) {
        ProduitRepository repository = new ProduitRepository();

        KafkaSubscriber kafkaSubscriber = new KafkaSubscriber();
        LogSubscriber logSubscriber = new LogSubscriber();

        repository.findAll();

        repository.subscribe(kafkaSubscriber);
        repository.subscribe(logSubscriber);

        repository.findAll();
    }
}