package fr.formation;

public class Main {
    public static void main(String[] args) {
        DbConfig config = DbConfig.builder()
            .host("localhost")
            .username("root")
            .password("pass123")
            .type("mysql")
            .port(3306)
            .build()
        ;

        System.out.println(config);

    }
}