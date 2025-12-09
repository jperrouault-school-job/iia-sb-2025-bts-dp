import java.util.List;

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

        Query query = Query.builder()
            .from("user")
            .order("col3")
            .select("col1")
            .select("col2")
            .select(List.of("col3", "col4"))
            .select("col5", "col6", "col7")
            .build()
        ;

        query.execute();
    }
}
