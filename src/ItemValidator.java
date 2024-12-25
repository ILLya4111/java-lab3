/**
 * Class that validates the fields of an element instance based on constraints.
 */
public class ItemValidator {

    /**
     * Validates the fields of the Item instance based on the constraints.
     *
     * @param item the Item instance to validate
     * @throws IllegalArgumentException if any validation constraint is violated
     */
    public static void validate(Item item) {
        if (item.getName() == null) {
            throw new IllegalArgumentException("Field 'name' in class Item cannot be null.");
        }
        if (item.getDescription().length() < 3 || item.getDescription().length() > 50) {
            throw new IllegalArgumentException("Field 'description' in class Item must have length between 3 and 50.");
        }
    }
}
