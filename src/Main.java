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
      long startTime = System.currentTimeMillis();

      try {
        User user = new User(null, 25);
        Validator.validate(user);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }

      try {
        Item item = new Item("Table", "A");
        Validator.validate(item);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }

      long endTime = System.currentTimeMillis();
      long reflectionTime = endTime - startTime;
      System.out.println("Reflection completion time: " + reflectionTime + "ms");

      startTime = System.currentTimeMillis();

      try {
        Vehicle vehicle = new Vehicle("Ford", 1800);
        vehicle.customValidate();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }

      try {
        Vehicle vehicle = new Vehicle("A", 2023);
        vehicle.customValidate();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }

      endTime = System.currentTimeMillis();
      long noReflectionTime = endTime - startTime;
      System.out.println("No reflection completion time: " + noReflectionTime + "ms");
    }
  }

