public class DbContext {
    private static DbContext instance;
    private String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    private DbContext() { }

    public static DbContext getInstance() {
        if (instance == null) {
            instance = new DbContext();
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connexion vers la base de données ...");
    }
}
