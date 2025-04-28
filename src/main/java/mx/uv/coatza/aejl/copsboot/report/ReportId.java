package mx.uv.coatza.aejl.copsboot.report;


import mx.uv.coatza.aejl.copsboot.orm.jpa.AbstractEntityId;
import mx.uv.coatza.aejl.copsboot.util.ArtifactForFramework;

import java.util.UUID;

public class ReportId extends AbstractEntityId<UUID> {
    @ArtifactForFramework
    protected ReportId() {
    }

    public ReportId(UUID id) {
        super(id);
    }
}
