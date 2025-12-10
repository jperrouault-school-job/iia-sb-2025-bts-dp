package fr.formation;

public class Application {
    public static void main(String[] args) {
        ProduitRepository repository = new ProduitRepository();
        repository = new ObserverDecorator(repository);

        KafkaSubscriber kafkaSubscriber = new KafkaSubscriber();
        LogSubscriber logSubscriber = new LogSubscriber();

        ((ObserverDecorator)repository).subscribe(kafkaSubscriber);
        ((ObserverDecorator)repository).subscribe(logSubscriber);

        repository.findAll();
    }
}