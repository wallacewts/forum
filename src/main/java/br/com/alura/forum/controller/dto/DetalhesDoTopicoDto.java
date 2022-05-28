package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.StatusTopico;
import br.com.alura.forum.modelo.Topico;

public class DetalhesDoTopicoDto {
  private Long id;
  private String titulo;
  private String mensagem;
  private LocalDateTime dataCricao;
  private String nomeAutor;
  private StatusTopico status;
  private List<RespostaDto> respostas;

  public DetalhesDoTopicoDto(Topico topico) {
    id = topico.getId();
    titulo = topico.getTitulo();
    mensagem = topico.getMensagem();
    dataCricao = topico.getDataCriacao();
    nomeAutor = topico.getAutor().getNome();
    status = topico.getStatus();
    respostas = new ArrayList<>();
    respostas.addAll(topico.getRespostas().stream().map(RespostaDto::new).collect(Collectors.toList()));
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

  public String getNomeAutor() {
    return nomeAutor;
  }

  public void setNomeAutor(String nomeAutor) {
    this.nomeAutor = nomeAutor;
  }

  public StatusTopico getStatus() {
    return status;
  }

  public void setStatus(StatusTopico status) {
    this.status = status;
  }

  public List<RespostaDto> getRespostas() {
    return respostas;
  }

  public void setRespostas(List<RespostaDto> respostas) {
    this.respostas = respostas;
  }
}
