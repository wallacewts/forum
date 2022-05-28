package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

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

  public static List<TopicoDto> converter(List<Topico> topicos) {
    return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
  }
}
