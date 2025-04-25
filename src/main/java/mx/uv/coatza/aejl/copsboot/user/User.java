package mx.uv.coatza.aejl.copsboot.user;

import java.util.Set;
import java.util.UUID;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import mx.uv.coatza.aejl.copsboot.orm.jpa.AbstractEntity;

@Entity
@Table(name = "user")
public class User extends AbstractEntity<UserId> {

    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @NotNull
    private Set<UserRole> roles;

    protected User() {
    }

    public User(UserId id, String email, String password, Set<UserRole> roles) {
        super(id);
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public Set<UserRole> getRoles() {
        return roles;
    }
}
