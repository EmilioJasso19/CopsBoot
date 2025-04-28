package mx.uv.coatza.aejl.copsboot.report;

import mx.uv.coatza.aejl.copsboot.user.UserId;
import java.time.Instant;

public record CreateReportParameters(UserId userId, Instant dateTime, String description) {
}
