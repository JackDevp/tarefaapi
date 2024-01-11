package teamcubation.io.taskapi.domain;

public class User {
    private String name;
    private String team;

    public User(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public User() {

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
