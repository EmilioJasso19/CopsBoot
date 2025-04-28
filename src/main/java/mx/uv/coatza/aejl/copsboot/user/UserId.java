package mx.uv.coatza.aejl.copsboot.user;

import mx.uv.coatza.aejl.copsboot.orm.jpa.AbstractEntityId;
import java.util.UUID;

public class UserId extends AbstractEntityId<UUID> {
    protected UserId() {}

    public UserId(UUID id) {
        super(id);
    }

    // metodo necesario para buscar a un usuario por su id en
    // UserService y asi poder relacionarlo con los reportes
    public UUID getUuid() {
        return getId();
    }
}