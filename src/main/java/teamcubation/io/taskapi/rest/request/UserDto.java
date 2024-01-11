package teamcubation.io.taskapi.rest.request;

public class UserDto {
    private String name;
    private String team;

    public UserDto(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public UserDto() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
