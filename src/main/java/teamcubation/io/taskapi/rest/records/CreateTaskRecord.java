package teamcubation.io.taskapi.rest.records;

public record CreateTaskRecord(String title, String description, UserRecord user) {
}
