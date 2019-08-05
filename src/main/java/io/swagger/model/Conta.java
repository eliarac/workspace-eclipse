package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cliente;
import io.swagger.model.Transacao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Conta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-05T18:00:01.964Z")

public class Conta   {
  @JsonProperty("agencia")
  private String agencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  @JsonProperty("digito")
  private Integer digito = null;

  @JsonProperty("saldo")
  private Double saldo = null;

  @JsonProperty("cliente")
  private Cliente cliente = null;

  @JsonProperty("transacao")
  @Valid
  private List<Transacao> transacao = null;

  public Conta agencia(String agencia) {
    this.agencia = agencia;
    return this;
  }

  /**
   * Get agencia
   * @return agencia
  **/
  @ApiModelProperty(example = "2779", value = "")

@Size(min=4,max=4) 
  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public Conta numConta(String numConta) {
    this.numConta = numConta;
    return this;
  }

  /**
   * Get numConta
   * @return numConta
  **/
  @ApiModelProperty(example = "0023148", value = "")

@Size(min=7,max=7) 
  public String getNumConta() {
    return numConta;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public Conta digito(Integer digito) {
    this.digito = digito;
    return this;
  }

  /**
   * Get digito
   * @return digito
  **/
  @ApiModelProperty(example = "5", value = "")


  public Integer getDigito() {
    return digito;
  }

  public void setDigito(Integer digito) {
    this.digito = digito;
  }

  public Conta saldo(Double saldo) {
    this.saldo = saldo;
    return this;
  }

  /**
   * Get saldo
   * @return saldo
  **/
  @ApiModelProperty(example = "105.35", value = "")


  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public Conta cliente(Cliente cliente) {
    this.cliente = cliente;
    return this;
  }

  /**
   * Get cliente
   * @return cliente
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Conta transacao(List<Transacao> transacao) {
    this.transacao = transacao;
    return this;
  }

  public Conta addTransacaoItem(Transacao transacaoItem) {
    if (this.transacao == null) {
      this.transacao = new ArrayList<Transacao>();
    }
    this.transacao.add(transacaoItem);
    return this;
  }

  /**
   * Get transacao
   * @return transacao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Transacao> getTransacao() {
    return transacao;
  }

  public void setTransacao(List<Transacao> transacao) {
    this.transacao = transacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conta conta = (Conta) o;
    return Objects.equals(this.agencia, conta.agencia) &&
        Objects.equals(this.numConta, conta.numConta) &&
        Objects.equals(this.digito, conta.digito) &&
        Objects.equals(this.saldo, conta.saldo) &&
        Objects.equals(this.cliente, conta.cliente) &&
        Objects.equals(this.transacao, conta.transacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agencia, numConta, digito, saldo, cliente, transacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conta {\n");
    
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    digito: ").append(toIndentedString(digito)).append("\n");
    sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
    sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
    sb.append("    transacao: ").append(toIndentedString(transacao)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

