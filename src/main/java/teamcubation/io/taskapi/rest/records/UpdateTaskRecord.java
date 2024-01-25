package teamcubation.io.taskapi.rest.records;

public record UpdateTaskRecord(String title, String description, UserRecord user, String status) {
}
