import annotations.*;

/**
 * The User class represents a user with a username and age.
 * It uses custom annotations to enforce validation constraints.
 */

public class User {

  @NotNull
  private String username;

  @MinValue(18)
  @MaxValue(65)
  private int age;

  public User(String username, int age) {
    this.username = username;
    this.age = age;
  }

  public String getUsername() { return username; }

  public void setUsername(String username) {
    this.username = username;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) { this.age = age; }

}

