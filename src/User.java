import annotations.*;

/**
 * The User class represents a user with a username and age.
 * It uses custom annotations to enforce validation constraints.
 */

public class User {

  @NotNull
  String username;

  @MinValue(18)
  @MaxValue(65)
  int age;

  public User(String username, int age) {
    this.username = username;
    this.age = age;
  }
}

