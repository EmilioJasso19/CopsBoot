package mx.uv.coatza.aejl.copsboot.user.web;

import mx.uv.coatza.aejl.copsboot.user.User;

public class UserDto {
    private final String userId;
    private final String email;
    private final String authServerId;
    private final String mobileToken;

    private UserDto(String userId, String email, String authServerId, String mobileToken) {
        this.userId = userId;
        this.email = email;
        this.authServerId = authServerId;
        this.mobileToken = mobileToken;
    }

    public static UserDto fromUser(User user) {
        return new UserDto(
                user.getId().asString(),
                user.getEmail(),
                user.getAuthServerId().value().toString(),
                user.getMobileToken()
        );
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getAuthServerId() {
        return authServerId;
    }

    public String getMobileToken() {
        return mobileToken;
    }
}
