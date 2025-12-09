public class AppBuilder {
    public static void main(String[] args) {
        // DbConfig config = new DbConfig.DbConfigBuilderV1()
        DbConfig config = DbConfig.builder()
            .type("mysql")
            .host("localhost")
            .port(3306)
            .username("root")
            .password("pass123")
            .build()
        ;
    }
}
