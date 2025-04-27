package mx.uv.coatza.aejl.copsboot.user.web;

import mx.uv.coatza.aejl.copsboot.user.AuthServerId;
import mx.uv.coatza.aejl.copsboot.user.CreateUserParameters;
import org.springframework.security.oauth2.jwt.Jwt;
import java.util.UUID;

public record CreateUserRequest(String mobileToken) {

    public CreateUserParameters toParameters(Jwt jwt) {
        AuthServerId authServerId = new AuthServerId(UUID.fromString(jwt.getSubject()));
        String email = jwt.getClaimAsString("email");
        return new CreateUserParameters(authServerId, email, mobileToken);
    }
}

