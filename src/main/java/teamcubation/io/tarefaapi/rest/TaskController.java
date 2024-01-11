package teamcubation.io.tarefaapi.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController("/api/tasks")
public class TaskController {



    @GetMapping
    public ResponseEntity getApiStatus() {
        return new ResponseEntity("ON",HttpStatus.OK);
    }



}
