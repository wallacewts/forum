package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {
  private Long id;
  private String titulo;
  private String mensagem;
  private LocalDateTime dataCricao;

  public TopicoDto(Topico topico) {
    id = topico.getId();
    titulo = topico.getTitulo();
    mensagem = topico.getMensagem();
    dataCricao = topico.getDataCriacao();
  }

  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public LocalDateTime getDataCricao() {
    return dataCricao;
  }

  public void setDataCricao(LocalDateTime dataCricao) {
    this.dataCricao = dataCricao;
  }

  public static Page<TopicoDto> converter(Page<Topico> topicos) {
    return topicos.map(TopicoDto::new);
  }
}
