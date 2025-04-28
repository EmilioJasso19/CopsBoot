package mx.uv.coatza.aejl.copsboot.user;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(UserId userId) {
        super("User not found with ID: " + userId);
    }

    public UserNotFoundException(AuthServerId userId) {
        super("User not found with ID: " + userId);
    }
}
