package mx.uv.coatza.aejl.copsboot.user;

public record CreateUserParameters(AuthServerId authServerId, String email,
       String mobileToken) {
}
