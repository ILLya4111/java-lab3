public class ItemSQLGenerator {
    public static String generateInsertSQL(Item item) {
        return String.format("INSERT INTO items (name, description) VALUES ('%s', '%s');",
                item.name, item.description);
    }
}
