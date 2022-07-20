/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Model;

/**
 *
 * @author gr001290
 */
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
   name = "view_usuarios"
)
public class Usuarios {
   @Id
   @Column(
      name = "matricula_usuario",
      nullable = false
   )
   private Long matricula;
   @Column(
      name = "nome_usuario",
      nullable = false,
      length = 50
   )
   private String nome;
   @Column(
      name = "senha_usuario",
      nullable = false,
      length = 50
   )
   private String senha;
   @Column(
      name = "flag_funcionario",
      nullable = false
   )
   private Integer FlagFuncionario;
   @Column(
      name = "codigo_status_usuario",
      nullable = false
   )
   private Integer CodigoStatusUsuario;
   @Column(
      name = "codigo_tipo_usuario",
      nullable = false
   )
   private Integer CodigoTipoUsuario;
   @Column(
      name = "codigo_setor_usuario",
      nullable = false
   )
   private Integer CodigoSetorUsuario;
   @Column(
      name = "matricula_criador",
      nullable = false
   )
   private Integer MatriculaCriador;
   @Column(
      name = "data_criacao",
      nullable = false
   )
   private Date DataCriacao;
   @Column(
      name = "matricula_atualizacao",
      nullable = true
   )
   private Integer MatriculaAtualizacao;
   @Column(
      name = "data_atualizacao",
      nullable = true
   )
   private Date DataAtualizacao;
   @Column(
      name = "php_senha",
      nullable = true,
      length = 2046
   )
   private String senha_php;

   public Usuarios(Long matricula, String nome, String senha, Integer flagFuncionario, Integer codigoStatusUsuario, Integer codigoTipoUsuario, Integer codigoSetorUsuario, Integer matriculaCriador, Date dataCriacao, Integer matriculaAtualizacao, Date dataAtualizacao, String senha_php) {
      this.matricula = matricula;
      this.nome = nome;
      this.senha = senha;
      this.FlagFuncionario = flagFuncionario;
      this.CodigoStatusUsuario = codigoStatusUsuario;
      this.CodigoTipoUsuario = codigoTipoUsuario;
      this.CodigoSetorUsuario = codigoSetorUsuario;
      this.MatriculaCriador = matriculaCriador;
      this.DataCriacao = dataCriacao;
      this.MatriculaAtualizacao = matriculaAtualizacao;
      this.DataAtualizacao = dataAtualizacao;
      this.senha_php = senha_php;
   }

   public Usuarios() {
   }

   public Usuarios(Long matricula, String senha) {
      this.matricula = matricula;
      this.senha = senha;
   }

   public Long getMatricula() {
      return this.matricula;
   }

   public void setMatricula(Long matricula) {
      this.matricula = matricula;
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getSenha() {
      return this.senha;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }

   public Integer getFlagFuncionario() {
      return this.FlagFuncionario;
   }

   public void setFlagFuncionario(Integer flagFuncionario) {
      this.FlagFuncionario = flagFuncionario;
   }

   public Integer getCodigoStatusUsuario() {
      return this.CodigoStatusUsuario;
   }

   public void setCodigoStatusUsuario(Integer codigoStatusUsuario) {
      this.CodigoStatusUsuario = codigoStatusUsuario;
   }

   public Integer getCodigoTipoUsuario() {
      return this.CodigoTipoUsuario;
   }

   public void setCodigoTipoUsuario(Integer codigoTipoUsuario) {
      this.CodigoTipoUsuario = codigoTipoUsuario;
   }

   public Integer getCodigoSetorUsuario() {
      return this.CodigoSetorUsuario;
   }

   public void setCodigoSetorUsuario(Integer codigoSetorUsuario) {
      this.CodigoSetorUsuario = codigoSetorUsuario;
   }

   public Integer getMatriculaCriador() {
      return this.MatriculaCriador;
   }

   public void setMatriculaCriador(Integer matriculaCriador) {
      this.MatriculaCriador = matriculaCriador;
   }

   public Date getDataCriacao() {
      return this.DataCriacao;
   }

   public void setDataCriacao(Date dataCriacao) {
      this.DataCriacao = dataCriacao;
   }

   public Integer getMatriculaAtualizacao() {
      return this.MatriculaAtualizacao;
   }

   public void setMatriculaAtualizacao(Integer matriculaAtualizacao) {
      this.MatriculaAtualizacao = matriculaAtualizacao;
   }

   public Date getDataAtualizacao() {
      return this.DataAtualizacao;
   }

   public void setDataAtualizacao(Date dataAtualizacao) {
      this.DataAtualizacao = dataAtualizacao;
   }

   public String getSenha_php() {
      return this.senha_php;
   }

   public void setSenha_php(String senha_php) {
      this.senha_php = senha_php;
   }

   public String toString() {
      return "Usuarios{matricula=" + this.matricula + ", nome=" + this.nome + ", senha=" + this.senha + ", FlagFuncionario=" + this.FlagFuncionario + ", CodigoStatusUsuario=" + this.CodigoStatusUsuario + ", CodigoTipoUsuario=" + this.CodigoTipoUsuario + ", CodigoSetorUsuario=" + this.CodigoSetorUsuario + ", MatriculaCriador=" + this.MatriculaCriador + ", DataCriacao=" + this.DataCriacao + ", MatriculaAtualizacao=" + this.MatriculaAtualizacao + ", DataAtualizacao=" + this.DataAtualizacao + ", senha_php=" + this.senha_php + '}';
   }
}
