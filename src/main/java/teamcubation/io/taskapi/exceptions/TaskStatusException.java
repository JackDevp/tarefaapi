package teamcubation.io.taskapi.exceptions;

public class TaskStatusException extends RuntimeException{

    public TaskStatusException(String message) {
        super(message);
    }

    public TaskStatusException() {
        super("Task status for this operation is not valid");
    }
}
