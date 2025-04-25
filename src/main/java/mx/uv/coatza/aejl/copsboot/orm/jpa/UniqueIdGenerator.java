package mx.uv.coatza.aejl.copsboot.orm.jpa;

import java.io.Serializable;

public interface UniqueIdGenerator<T extends Serializable> {
    T getNextUniqueId();
}
