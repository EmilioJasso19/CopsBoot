package mx.uv.coatza.aejl.copsboot.user;

import java.util.Set;
import java.util.UUID;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import mx.uv.coatza.aejl.copsboot.orm.jpa.AbstractEntity;

@Entity
@Table(name = "copsboot_user")
public class User extends AbstractEntity<UserId> {

    private String email;

    @Convert(converter = AuthServerIdAttributeConverter.class)
    private AuthServerId authServerId;

    private String mobileToken;

    protected User() {
    }

    public User(UserId id, String email, AuthServerId authServerId, String mobileToken) {
        super(id);
        this.email = email;
        this.authServerId = authServerId;
        this.mobileToken = mobileToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AuthServerId getAuthServerId() {
        return authServerId;
    }

    public void setAuthServerId(AuthServerId authServerId) {
        this.authServerId = authServerId;
    }

    public String getMobileToken() {
        return mobileToken;
    }
}
