public class DbConfig {
    private String host;
    private int port;
    private String username;
    private String password;
    private String type;

    public DbConfig() { }

    public DbConfig(String host, int port, String username, String password, String type) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public static DbConfigBuilderV1 builder() {
        return new DbConfigBuilderV1();
    }

    public static DbConfigBuilderV2 builderV2() {
        return new DbConfigBuilderV2();
    }

    public static class DbConfigBuilderV1 {
        private String host;
        private int port;
        private String username;
        private String password;
        private String type;

        public DbConfigBuilderV1 host(String host) {
            this.host = host;
            return this;
        }

        public DbConfigBuilderV1 port(int port) {
            this.port = port;
            return this;
        }

        public DbConfigBuilderV1 username(String username) {
            this.username = username;
            return this;
        }

        public DbConfigBuilderV1 password(String password) {
            this.password = password;
            return this;
        }

        public DbConfigBuilderV1 type(String type) {
            this.type = type;
            return this;
        }

        public DbConfig build() {
            return new DbConfig(host, port, username, password, type);
        }
    }

    public static class DbConfigBuilderV2 {
        private DbConfig instance = new DbConfig();

        public DbConfigBuilderV2 host(String host) {
            this.instance.host = host;
            return this;
        }

        public DbConfigBuilderV2 port(int port) {
            this.instance.port = port;
            return this;
        }

        public DbConfigBuilderV2 username(String username) {
            this.instance.username = username;
            return this;
        }

        public DbConfigBuilderV2 password(String password) {
            this.instance.password = password;
            return this;
        }

        public DbConfigBuilderV2 type(String type) {
            this.instance.type = type;
            return this;
        }

        public DbConfig build() {
            return this.instance;
        }
    }
}
