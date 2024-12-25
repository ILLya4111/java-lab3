import annotations.Validator;

/**
 * The Main class demonstrates the usage of the Validator class
 * to validate objects of different classes using custom annotations.
 */
public class Main {

  /**
   * The main method is the entry point of the application.
   * It creates instances of User, Item, and Vehicle classes and validates them.
   */
  public static void main(String[] args) {
    User user = new User(null, 25);
    Item item = new Item("Table", "A");
    Vehicle vehicle1 = new Vehicle("Ford", 1800);
    Vehicle vehicle2 = new Vehicle("A", 2023);

    long startTime = System.currentTimeMillis();
    try {
      Validator.validate(user);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      Validator.validate(item);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      Validator.validate(vehicle1);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      Validator.validate(vehicle2);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    long endTime = System.currentTimeMillis();
    long reflectionTime = endTime - startTime;
    System.out.println("Reflection completion time: " + reflectionTime + "ms");

    startTime = System.currentTimeMillis();
    try {
      UserValidator.validate(user);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      ItemValidator.validate(item);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      VehicleValidator.validate(vehicle1);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      VehicleValidator.validate(vehicle2);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    endTime = System.currentTimeMillis();
    long noReflectionTime = endTime - startTime;
    System.out.println("No reflection completion time: " + noReflectionTime + "ms");
  }
}



