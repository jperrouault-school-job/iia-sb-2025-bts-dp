public class AppSingleton {
    public static void main(String[] args) {
        DbContext ctx1 = DbContext.getInstance();
        DbContext ctx2 = DbContext.getInstance();

        ctx1.setConnectionString("mysql://localhost/madb");

        System.out.println(ctx2.getConnectionString());

        if (ctx1 == ctx2) {
            System.out.println("SINGLETON !");
        }

        else {
            System.out.println("PAS SINGLETON !");
        }

    }
}
