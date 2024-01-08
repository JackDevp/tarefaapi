package teamcubation.io.tarefaapi.rest.request;

public class UsuarioDto {
    private String nome;
    private String time;

    public UsuarioDto(String nome, String time) {
        this.nome = nome;
        this.time = time;
    }

    public UsuarioDto() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
