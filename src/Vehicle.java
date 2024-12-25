import annotations.MaxValue;
import annotations.MinValue;
import annotations.NotNull;
import annotations.StringLength;

/**
 * The Vehicle class represents a vehicle with a brand and year.
 * It validates its fields without using reflection.
 */

public class Vehicle {

  @NotNull
  @StringLength(min = 3, max = 80)
  private String brand;

  @MinValue(1900)
  @MaxValue(2022)
  private int year;

  public Vehicle(String brand, int year) {
    this.brand = brand;
    this.year = year;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}

