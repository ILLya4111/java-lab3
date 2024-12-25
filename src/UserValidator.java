/**
 * Class that validates the fields of a User instance based on the constraints.
 */
public class UserValidator {

    /**
     * Validates the fields of the User instance based on the constraints.
     *
     * @param user the User instance to validate
     * @throws IllegalArgumentException if any validation constraint is violated
     */
    public static void validate(User user) {
        if (user.getUsername() == null) {
            throw new IllegalArgumentException("Field 'username' in class User cannot be null.");
        }
        if (user.getAge() < 18 || user.getAge() > 65) {
            throw new IllegalArgumentException("Field 'age' in class User must be between 18 and 65.");
        }
    }
}
