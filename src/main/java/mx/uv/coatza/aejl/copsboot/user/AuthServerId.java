package mx.uv.coatza.aejl.copsboot.user;

import jakarta.persistence.Embeddable;
import org.springframework.util.Assert;
import java.util.UUID;

@Embeddable
public record AuthServerId(UUID value) {
    public AuthServerId {
        Assert.notNull(value, "The AuthServerId value should not be null");
    }
}
