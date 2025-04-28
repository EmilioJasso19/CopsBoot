package mx.uv.coatza.aejl.copsboot.report;

import java.util.UUID;
import mx.uv.coatza.aejl.copsboot.orm.jpa.UniqueIdGenerator;

public class ReportRepositoryImpl implements ReportRepositoryCustom {
    private final UniqueIdGenerator<UUID> generator;

    public ReportRepositoryImpl(UniqueIdGenerator<UUID> generator) {
        this.generator = generator;
    }

    @Override
    public ReportId nextId() {
        return new ReportId(generator.getNextUniqueId());
    }
}
