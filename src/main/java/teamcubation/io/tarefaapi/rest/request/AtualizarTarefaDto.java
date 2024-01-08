package teamcubation.io.tarefaapi.rest.request;

import teamcubation.io.tarefaapi.domain.enums.TarefaStatus;

public class AtualizarTarefaDto {

    private Integer id;
    private String titulo;
    private String descricao;
    private UsuarioDto usuario;
    private TarefaStatus status;

    AtualizarTarefaDto(String titulo, String descricao, UsuarioDto usuario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public AtualizarTarefaDto() {}

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

    public TarefaStatus getStatus() {
        return status;
    }

    public void setStatus(TarefaStatus status) {
        this.status = status;
    }
}
