package mx.uv.coatza.aejl.copsboot.orm.jpa;

import jakarta.persistence.MappedSuperclass;
import mx.uv.coatza.aejl.copsboot.util.ArtifactForFramework;

import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntityId<T extends Serializable> implements Serializable, EntityId<T> {

    private T id;

    @ArtifactForFramework
    protected AbstractEntityId() {}

    public AbstractEntityId(T id) {
        this.id = Objects.requireNonNull(id);
    }

    @Override
    public T getId() {
        return id;
    }

    @Override
    public String asString() {
        return id.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntityId<?> that = (AbstractEntityId<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + id + ")";
    }
}
