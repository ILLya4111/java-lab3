public class UserSQLGenerator {
    public static String generateInsertSQL(User user) {
        return String.format("INSERT INTO users (username, age) VALUES ('%s', %d);",
                user.username, user.age);
    }
}
