package teamcubation.io.tarefaapi.rest.request;

import teamcubation.io.tarefaapi.domain.enums.TaskStatus;

public class UpdateTaskDto {

    private Integer id;
    private String title;
    private String description;
    private UserDto user;
    private TaskStatus status;

    UpdateTaskDto(String title, String description, UserDto user) {
        this.title = title;
        this.description = description;
        this.user = user;
    }

    public UpdateTaskDto() {}

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
