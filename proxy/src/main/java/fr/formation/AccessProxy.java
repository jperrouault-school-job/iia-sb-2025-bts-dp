package fr.formation;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccessProxy extends ProduitRepository {
    private final ProduitRepository repository;

    @Override
    public List<Produit> findAll() {
        if (Application.access) {
            return this.repository.findAll();
        }

        return new ArrayList<>();
    }
}
