package fr.formation;

public class KafkaSubscriber implements Subscriber {
    @Override
    public void update(Publisher pub) {
        System.out.println("Un évènement pour KAFKA !");
    }
}
