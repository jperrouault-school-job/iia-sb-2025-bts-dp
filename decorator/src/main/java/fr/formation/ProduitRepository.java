package fr.formation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProduitRepository {
    public List<Produit> findAll() {
        System.out.println("CHARGEMENT DES PRODUITS EN BASE ...");

        List<Produit> produits = new ArrayList<>();

        produits.add(Produit.builder()
            .id("123")
            .nom("Parachute")
            .prix(new BigDecimal("5999.5"))
            .date(LocalDate.of(2025, 12, 14))
            .build()
        );

        produits.add(Produit.builder()
            .id("968")
            .nom("Casque de moto")
            .prix(new BigDecimal("499.9"))
            .date(LocalDate.of(2025, 7, 21))
            .build()
        );

        return produits;
    }
}
