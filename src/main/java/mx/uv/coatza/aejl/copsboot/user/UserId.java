package mx.uv.coatza.aejl.copsboot.user;

import mx.uv.coatza.aejl.copsboot.orm.jpa.AbstractEntityId;
import java.util.UUID;

public class UserId extends AbstractEntityId<UUID> {
    protected UserId() {}

    public UserId(UUID id) {
        super(id);
    }
}