package teamcubation.io.tarefaapi.rest.request;

public class CriarTarefaDto {

    private String titulo;
    private String descricao;
    private UsuarioDto usuario;

    CriarTarefaDto(String titulo, String descricao, UsuarioDto usuario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public CriarTarefaDto() {}

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public UsuarioDto getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
