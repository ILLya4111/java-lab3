public class VehicleSQLGenerator {
    public static String generateInsertSQL(Vehicle vehicle) {
        return String.format("INSERT INTO vehicles (brand, year) VALUES ('%s', %d);",
                vehicle.brand, vehicle.year);
    }
}