package fr.formation;

public class Application {
    public static boolean access = true;

    public static void main(String[] args) {
        ProduitRepository repository = new ProduitRepository();

        repository = new CacheProxy(repository);
        repository = new AccessProxy(repository);

        System.out.println(repository.findAll().size());
        System.out.println(repository.findAll().size());

        Application.access = false;
        System.out.println(repository.findAll().size());
    }
}