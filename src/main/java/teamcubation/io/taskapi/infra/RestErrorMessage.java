package teamcubation.io.taskapi.infra;

import org.springframework.http.HttpStatus;

public class RestErrorMessage {
    private String message;
    private final HttpStatus status;

    public RestErrorMessage(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
