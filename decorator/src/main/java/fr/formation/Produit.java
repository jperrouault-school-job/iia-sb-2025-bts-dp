package fr.formation;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class Produit {
    private String id;
    private String nom;
    private BigDecimal prix;
    private LocalDate date;
}
