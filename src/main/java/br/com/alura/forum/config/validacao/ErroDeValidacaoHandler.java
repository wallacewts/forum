package br.com.alura.forum.config.validacao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErroDeValidacaoHandler {

  @Autowired
  private MessageSource messageSource;

  @ResponseStatus(code = HttpStatus.BAD_REQUEST)
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public List<ErroDeFormularioDto> handle(MethodArgumentNotValidException exception) {
    List<ErroDeFormularioDto> erroDeFormularioDtos = new ArrayList<>();
    List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();

    fieldErrors.forEach(erro -> {
      String menssagem = messageSource.getMessage(erro, LocaleContextHolder.getLocale());
      ErroDeFormularioDto erroDeFormularioDto = new ErroDeFormularioDto(erro.getField(), menssagem);

      erroDeFormularioDtos.add(erroDeFormularioDto);
    });

    return erroDeFormularioDtos;
  }
}
