/**
 * The Vehicle class represents a vehicle with a brand and year.
 * It validates its fields without using reflection.
 */

public class Vehicle {

  String brand;
  int year;

  public Vehicle(String brand, int year) {
    this.brand = brand;
    this.year = year;
  }

  /**
   * Validates the fields of the Vehicle instance based on the constraints.
   *
   * @throws IllegalArgumentException if any validation constraint is violated
   */

  public void customValidate() {
    if (brand == null) {
      throw new IllegalArgumentException("Field 'brand' cannot be null.");
    }
    if (brand.length() < 3 || brand.length() > 30) {
      throw new IllegalArgumentException("Field 'brand' must have length between 3 and 30.");
    }
    if (year < 1900 || year > 2022) {
      throw new IllegalArgumentException("Field 'year' must be between 1900 and 2022.");
    }
  }
}

