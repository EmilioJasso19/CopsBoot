package mx.uv.coatza.aejl.copsboot.report.web;

import mx.uv.coatza.aejl.copsboot.report.Report;
import mx.uv.coatza.aejl.copsboot.report.ReportId;
import mx.uv.coatza.aejl.copsboot.user.UserService;
import java.time.Instant;

public record ReportDto(ReportId id,
                        String reporter,
                        Instant dateTime,
                        String description) {

    public static ReportDto fromReport(Report report, UserService userService) {
        return new ReportDto(report.getId(),
                userService.getUserById(report.getReporterId()).getEmail(),
                report.getDateTime(),
                report.getDescription());
    }
}
