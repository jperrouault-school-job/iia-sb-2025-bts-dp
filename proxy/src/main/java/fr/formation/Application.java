package fr.formation;

public class Application {
    public static void main(String[] args) {
        ProduitRepository repository = new ProduitRepository();

        repository.findAll();
    }
}