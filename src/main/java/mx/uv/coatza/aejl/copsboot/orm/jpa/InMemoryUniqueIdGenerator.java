package mx.uv.coatza.aejl.copsboot.orm.jpa;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryUniqueIdGenerator implements UniqueIdGenerator<UUID> {
    private final AtomicInteger counter = new AtomicInteger(0);

    @Override
    public UUID getNextUniqueId() {
        return UUID.randomUUID();
        // O si se necesita una secuencia determinista para pruebas:
        // return UUID.nameUUIDFromBytes(new byte[] { (byte) counter.getAndIncrement() });
    }
}
