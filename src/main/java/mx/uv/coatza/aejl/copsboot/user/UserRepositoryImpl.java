package mx.uv.coatza.aejl.copsboot.user;

import mx.uv.coatza.aejl.copsboot.orm.jpa.UniqueIdGenerator;

import java.util.UUID;

public class UserRepositoryImpl implements UserRepositoryCustom {
    private final UniqueIdGenerator<UUID> generator;

    public UserRepositoryImpl(UniqueIdGenerator<UUID> generator) {
        this.generator = generator;
    }

    @Override
    public UserId nextId() {
        return new UserId(generator.getNextUniqueId());
    }
}
