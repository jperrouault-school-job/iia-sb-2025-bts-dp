package fr.formation;

public class RepositoryFactory {
    public static ProduitRepository createRepositoryProduit() {
        ProduitRepository repository = new ProduitRepository();

        repository = new CacheProxy(repository);
        repository = new AccessProxy(repository);

        return repository;
    }
}
