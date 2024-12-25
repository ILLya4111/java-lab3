/**
 * Class that validates the fields of a Vehicle instance based on the constraints.
 */

public class VehicleValidator {

    /**
     * Validates the fields of the Vehicle instance based on the constraints.
     *
     * @param vehicle the Vehicle instance to validate
     * @throws IllegalArgumentException if any validation constraint is violated
     */

    public static void validate(Vehicle vehicle) {
        if (vehicle.getBrand() == null) {
            throw new IllegalArgumentException("Field 'brand' in class Vehicle cannot be null.");
        }
        if (vehicle.getBrand().length() < 3 || vehicle.getBrand().length() > 80) {
            throw new IllegalArgumentException("Field 'brand' in class Vehicle must have length between 3 and 80.");
        }
        if (vehicle.getYear() < 1900 || vehicle.getYear() > 2022) {
            throw new IllegalArgumentException("Field 'year' in class Vehicle must be between 1900 and 2022.");
        }
    }
}
