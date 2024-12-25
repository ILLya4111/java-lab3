import annotations.*;

/**
 * The Item class represents an item with a name and description.
 * It uses custom annotations to enforce validation constraints.
 */

public class Item {

  @NotNull
  private String name;

  @StringLength(min = 5, max = 50)
  private String description;

  public Item(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


}
