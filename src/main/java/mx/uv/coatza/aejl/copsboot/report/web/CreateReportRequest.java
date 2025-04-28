package mx.uv.coatza.aejl.copsboot.report.web;

import mx.uv.coatza.aejl.copsboot.report.CreateReportParameters;
import mx.uv.coatza.aejl.copsboot.user.UserId;
import java.time.Instant;

public record CreateReportRequest(Instant dateTime,
                                  String description,
                                  boolean trafficIncident,
                                  int numberOfInvolvedCars) {
    public CreateReportParameters toParameters(UserId userId) {
        return new CreateReportParameters(userId, dateTime, description);
    }
}