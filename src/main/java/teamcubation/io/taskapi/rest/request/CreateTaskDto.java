package teamcubation.io.taskapi.rest.request;

public class CreateTaskDto {

    private String title;
    private String description;
    private UserDto user;

    CreateTaskDto(String title, String description, UserDto user) {
        this.title = title;
        this.description = description;
        this.user = user;
    }

    public CreateTaskDto() {}

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
}
