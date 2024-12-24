import annotations.*;

/**
 * The Item class represents an item with a title and description.
 * It uses custom annotations to enforce validation constraints.
 */

public class Item {

  @NotNull
  String name;

  @StringLength(min = 5, max = 50)
  String description;

  public Item(String name, String description) {
    this.name = name;
    this.description = description;
  }
}
