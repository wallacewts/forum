package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.alura.forum.modelo.Resposta;

public class RespostaDto {
  private Long id;
  private String mensagem;
  private LocalDateTime dataCricao;
  private String nomeAutor;

  public RespostaDto(Resposta resposta) {
    id = resposta.getId();
    mensagem = resposta.getMensagem();
    dataCricao = resposta.getDataCriacao();
    nomeAutor = resposta.getAutor().getNome();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
}
