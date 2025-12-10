package fr.formation;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CacheProxy extends ProduitRepository {
    private final ProduitRepository repository;
    private List<Produit> cached;

    @Override
    public List<Produit> findAll() {
        if (cached == null) {
            this.cached = this.repository.findAll();
            System.out.println("-> Mise en cache");
            return this.cached;
        }

        System.out.println("-> Utilisation du cache");
        return this.cached;
    }
}
