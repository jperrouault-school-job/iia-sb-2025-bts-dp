import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Query {
    private String from;
    private List<String> select = new ArrayList<>();
    private String orderBy;

    public Query(String from, List<String> select, String orderBy) {
        this.from = from;
        this.select = select;
        this.orderBy = orderBy;
    }

    public void execute() {
        String query = "SELECT " + String.join(", ", select)
            + " FROM " + from
        ;

        if (orderBy != null && !orderBy.isBlank()) {
            query += " ORDER BY " + orderBy;

        }

        System.out.println(query);
    }

    public static QueryBuilder builder() {
        return new QueryBuilder();
    }

    public static class QueryBuilder {
        private String from;
        private List<String> select = new ArrayList<>();
        private String orderBy;

        public QueryBuilder from(String from) {
            this.from = from;
            return this;
        }

        public QueryBuilder select(String colonne) {
            this.select.add(colonne);
            return this;
        }

        public QueryBuilder select(List<String> colonnes) {
            this.select.addAll(colonnes);
            return this;
        }

        public QueryBuilder select(String... colonnes) {
            this.select.addAll(Arrays.asList(colonnes));

            return this;
        }

        public QueryBuilder order(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Query build() {
            return new Query(from, select, orderBy);
        }
    }
}
