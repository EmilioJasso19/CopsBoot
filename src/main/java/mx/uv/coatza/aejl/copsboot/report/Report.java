package mx.uv.coatza.aejl.copsboot.report;

import jakarta.persistence.Entity;
import mx.uv.coatza.aejl.copsboot.orm.jpa.AbstractEntity;
import mx.uv.coatza.aejl.copsboot.user.UserId;
import mx.uv.coatza.aejl.copsboot.util.ArtifactForFramework;
import java.time.Instant;

@Entity
public class Report extends AbstractEntity<ReportId> {
    private UserId reporterId;
    private Instant dateTime;
    private String description;

    @ArtifactForFramework
    protected Report() {}

    public Report(ReportId id, UserId reporterId, Instant dateTime, String description) {
        super(id);
        this.reporterId = reporterId;
        this.dateTime = dateTime;
        this.description = description;
    }

    public UserId getReporterId() {
        return reporterId;
    }

    public Instant getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }
}
