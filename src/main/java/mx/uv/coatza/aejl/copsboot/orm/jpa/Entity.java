package mx.uv.coatza.aejl.copsboot.orm.jpa;

public interface Entity<T extends EntityId> {
    T getId();
}
