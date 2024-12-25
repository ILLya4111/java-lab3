import annotations.Validator;

public class Main2 {
    public static void main(String[] args) {
        // Reflection-based validation
        try {
            User user = new User("JohnDoe", 25);
            Validator.validate(user);
            System.out.println(UserSQLGenerator.generateInsertSQL(user));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Item item = new Item("Table", "A great wooden table");
            Validator.validate(item);
            System.out.println(ItemSQLGenerator.generateInsertSQL(item));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Vehicle vehicle = new Vehicle("Ford", 2000);
            vehicle.customValidate();
            System.out.println(VehicleSQLGenerator.generateInsertSQL(vehicle));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}