package fr.formation;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;

// @AllArgsConstructor
@RequiredArgsConstructor
public class ObserverDecorator extends ProduitRepository implements Publisher {
    private final ProduitRepository repository;
    private List<Subscriber> subscribers = new ArrayList<>();

    // public ObserverDecorator(ProduitRepository repository) {
    //     this.repository = repository;
    // }

    @Override
    public List<Produit> findAll() {
        // TODO décoration
        this.publish();

        return this.repository.findAll();
    }

    @Override
    public void subscribe(Subscriber sub) {
        this.subscribers.add(sub);
    }

    @Override
    public void unsubscribe(Subscriber sub) {
        this.subscribers.add(sub);
    }

    @Override
    public void publish() {
        for (Subscriber sub : this.subscribers) {
            sub.update(this);
        }
    }
}
