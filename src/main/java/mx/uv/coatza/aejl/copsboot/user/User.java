package mx.uv.coatza.aejl.copsboot.user;

import java.util.Set;
import java.util.UUID;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "copsboot_user")
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    private String email;
    private String password;
    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @NotNull
    private Set<UserRole> roles;
    protected User() {
    }
    public User(String email, String password, Set<UserRole> roles) {
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
