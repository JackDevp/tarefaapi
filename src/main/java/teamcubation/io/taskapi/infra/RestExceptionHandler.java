package teamcubation.io.taskapi.infra;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import teamcubation.io.taskapi.exceptions.TaskStatusException;


@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(TaskStatusException.class)
    private ResponseEntity<RestErrorMessage> buildResponseEntity(TaskStatusException taskStatusException) {
        RestErrorMessage restErrorMessage = new RestErrorMessage(taskStatusException.getMessage(), HttpStatus.NOT_ACCEPTABLE);
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(restErrorMessage);
    }
}
