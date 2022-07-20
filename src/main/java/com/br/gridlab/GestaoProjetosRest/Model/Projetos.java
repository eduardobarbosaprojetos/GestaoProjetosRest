/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Model;

/**
 *
 * @author gr001290
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
   name = "projetos"
)
public class Projetos implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   @Column(
      name = "id_projeto",
      nullable = false
   )
   private Long id_projeto;
   @Column(
      name = "codigo_projeto",
      nullable = false,
      length = 10
   )
   private String codigo_projeto;
   @Column(
      name = "nome",
      nullable = false,
      length = 100
   )
   private String nome;
   @Column(
      name = "id_tipo_projeto",
      nullable = false
   )
   private Long id_tipo_projeto;
   @Column(
      name = "cliente",
      nullable = false,
      length = 100
   )
   private String cliente;
   @Column(
      name = "numero_contrato",
      nullable = false,
      length = 50
   )
   private String numero_contrato;
   @Column(
      name = "descricao_contrato",
      nullable = true,
      length = 300
   )
   private String descricao_contrato;
   @Column(
      name = "gestor1",
      nullable = false,
      length = 100
   )
   private String gestor1;
   @Column(
      name = "gestor2",
      nullable = true,
      length = 100
   )
   private String gestor2;
   @Column(
      name = "total_receitas_estimado",
      nullable = false
   )
   private BigDecimal total_receitas_estimado;
   @Column(
      name = "total_despesas_estimado",
      nullable = false
   )
   private BigDecimal total_despesas_estimado;
   @Column(
      name = "total_desp_pessoal_estimado",
      nullable = true
   )
   private BigDecimal total_desp_pessoal_estimado;
   @Column(
      name = "total_desp_insumos_estimado",
      nullable = true
   )
   private BigDecimal total_desp_insumos_estimado;
   @Column(
      name = "total_desp_outros_estimado",
      nullable = true
   )
   private BigDecimal total_desp_outros_estimado;
   @Column(
      name = "total_icms_estimado",
      nullable = true
   )
   private BigDecimal total_icms_estimado;
   @Column(
      name = "total_ipi_estimado",
      nullable = true
   )
   private BigDecimal total_ipi_estimado;
   @Column(
      name = "total_iss_estimado",
      nullable = true
   )
   private BigDecimal total_iss_estimado;
   @Column(
      name = "total_pis_estimado",
      nullable = true
   )
   private BigDecimal total_pis_estimado;
   @Column(
      name = "total_cofins_estimado",
      nullable = true
   )
   private BigDecimal total_cofins_estimado;
   @Column(
      name = "total_irpj_estimado",
      nullable = true
   )
   private BigDecimal total_irpj_estimado;
   @Column(
      name = "total_airpj_estimado",
      nullable = true
   )
   private BigDecimal total_airpj_estimado;
   @Column(
      name = "total_csll_estimado",
      nullable = true
   )
   private BigDecimal total_csll_estimado;
   @Column(
      name = "total",
      nullable = false
   )
   private BigDecimal total;
   @Column(
      name = "duracao_estimada",
      nullable = false,
      length = 20
   )
   private Integer duracao_estimada;
   @Column(
      name = "data_inicio",
      nullable = false
   )
   private LocalDate data_inicio;
   @Column(
      name = "data_fim",
      nullable = false
   )
   private LocalDate data_fim;
   @Column(
      name = "matricula_criador",
      nullable = false
   )
   private int matricula_criador;
   @Column(
      name = "data_criacao",
      nullable = false
   )
   private LocalDate data_criacao;
   @Column(
      name = "matricula_atualizacao",
      nullable = true
   )
   private int matricula_atualizacao;
   @Column(
      name = "data_atualizacao",
      nullable = true
   )
   private LocalDate data_atualizacao;

   public Projetos() {
   }

   public Projetos(Long id_projeto, String codigo_projeto, String nome, Long id_tipo_projeto, String cliente, String numero_contrato, String descricao_contrato, String gestor1, String gestor2, BigDecimal total_receitas_estimado, BigDecimal total_despesas_estimado, BigDecimal total_desp_pessoal_estimado, BigDecimal total_desp_insumos_estimado, BigDecimal total_desp_outros_estimado, BigDecimal total_icms_estimado, BigDecimal total_ipi_estimado, BigDecimal total_iss_estimado, BigDecimal total_pis_estimado, BigDecimal total_cofins_estimado, BigDecimal total_irpj_estimado, BigDecimal total_airpj_estimado, BigDecimal total_csll_estimado, BigDecimal total, Integer duracao_estimada, LocalDate data_inicio, LocalDate data_fim, int matricula_criador, LocalDate data_criacao, int matricula_atualizacao, LocalDate data_atualizacao) throws ParseException {
      this.id_projeto = id_projeto;
      this.codigo_projeto = codigo_projeto;
      this.nome = nome;
      this.id_tipo_projeto = id_tipo_projeto;
      this.cliente = cliente;
      this.numero_contrato = numero_contrato;
      this.descricao_contrato = descricao_contrato;
      this.gestor1 = gestor1;
      this.gestor2 = gestor2;
      this.total_receitas_estimado = total_receitas_estimado;
      this.total_despesas_estimado = total_despesas_estimado;
      this.total_desp_pessoal_estimado = total_desp_pessoal_estimado;
      this.total_desp_insumos_estimado = total_desp_insumos_estimado;
      this.total_desp_outros_estimado = total_desp_outros_estimado;
      this.total_icms_estimado = total_icms_estimado;
      this.total_ipi_estimado = total_ipi_estimado;
      this.total_iss_estimado = total_iss_estimado;
      this.total_pis_estimado = total_pis_estimado;
      this.total_cofins_estimado = total_cofins_estimado;
      this.total_irpj_estimado = total_irpj_estimado;
      this.total_airpj_estimado = total_airpj_estimado;
      this.total_csll_estimado = total_csll_estimado;
      this.total = total;
      this.duracao_estimada = duracao_estimada;
      this.data_inicio = data_inicio;
      this.data_fim = data_fim;
      this.matricula_criador = matricula_criador;
      this.data_criacao = data_criacao;
      this.matricula_atualizacao = matricula_atualizacao;
      this.data_atualizacao = data_atualizacao;
   }

   public Projetos(String codigo_projeto, String nome, Long id_tipo_projeto, String cliente, String numero_contrato, String descricao_contrato, String gestor1, String gestor2, BigDecimal total_receitas_estimado, BigDecimal total_despesas_estimado, BigDecimal total_desp_pessoal_estimado, BigDecimal total_desp_insumos_estimado, BigDecimal total_desp_outros_estimado, BigDecimal total_icms_estimado, BigDecimal total_ipi_estimado, BigDecimal total_iss_estimado, BigDecimal total_pis_estimado, BigDecimal total_cofins_estimado, BigDecimal total_irpj_estimado, BigDecimal total_airpj_estimado, BigDecimal total_csll_estimado, BigDecimal total, Integer duracao_estimada, LocalDate data_inicio, LocalDate data_fim, int matricula_criador, LocalDate data_criacao, int matricula_atualizacao, LocalDate data_atualizacao) throws ParseException {
      this.codigo_projeto = codigo_projeto;
      this.nome = nome;
      this.id_tipo_projeto = id_tipo_projeto;
      this.cliente = cliente;
      this.numero_contrato = numero_contrato;
      this.descricao_contrato = descricao_contrato;
      this.gestor1 = gestor1;
      this.gestor2 = gestor2;
      this.total_receitas_estimado = total_receitas_estimado;
      this.total_despesas_estimado = total_despesas_estimado;
      this.total_desp_pessoal_estimado = total_desp_pessoal_estimado;
      this.total_desp_insumos_estimado = total_desp_insumos_estimado;
      this.total_desp_outros_estimado = total_desp_outros_estimado;
      this.total_icms_estimado = total_icms_estimado;
      this.total_ipi_estimado = total_ipi_estimado;
      this.total_iss_estimado = total_iss_estimado;
      this.total_pis_estimado = total_pis_estimado;
      this.total_cofins_estimado = total_cofins_estimado;
      this.total_irpj_estimado = total_irpj_estimado;
      this.total_airpj_estimado = total_airpj_estimado;
      this.total_csll_estimado = total_csll_estimado;
      this.total = total;
      this.duracao_estimada = duracao_estimada;
      this.data_inicio = data_inicio;
      this.data_fim = data_fim;
      this.matricula_criador = matricula_criador;
      this.data_criacao = data_criacao;
      this.matricula_atualizacao = matricula_atualizacao;
      this.data_atualizacao = data_atualizacao;
   }

   public Long getId_projeto() {
      return this.id_projeto;
   }

   public void setId_projeto(Long id_projeto) {
      this.id_projeto = id_projeto;
   }

   public String getCodigo_projeto() {
      return this.codigo_projeto;
   }

   public void setCodigo_projeto(String codigo_projeto) {
      this.codigo_projeto = codigo_projeto;
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Long getId_tipo_projeto() {
      return this.id_tipo_projeto;
   }

   public void setId_tipo_projeto(Long id_tipo_projeto) {
      this.id_tipo_projeto = id_tipo_projeto;
   }

   public String getCliente() {
      return this.cliente;
   }

   public void setCliente(String cliente) {
      this.cliente = cliente;
   }

   public String getNumero_contrato() {
      return this.numero_contrato;
   }

   public void setNumero_contrato(String numero_contrato) {
      this.numero_contrato = numero_contrato;
   }

   public String getDescricao_contrato() {
      return this.descricao_contrato;
   }

   public void setDescricao_contrato(String descricao_contrato) {
      this.descricao_contrato = descricao_contrato;
   }

   public String getGestor1() {
      return this.gestor1;
   }

   public void setGestor1(String gestor1) {
      this.gestor1 = gestor1;
   }

   public String getGestor2() {
      return this.gestor2;
   }

   public void setGestor2(String gestor2) {
      this.gestor2 = gestor2;
   }

   public BigDecimal getTotal_receitas_estimado() {
      return this.total_receitas_estimado;
   }

   public void setTotal_receitas_estimado(BigDecimal total_receitas_estimado) {
      this.total_receitas_estimado = total_receitas_estimado;
   }

   public BigDecimal getTotal_despesas_estimado() {
      return this.total_despesas_estimado;
   }

   public void setTotal_despesas_estimado(BigDecimal total_despesas_estimado) {
      this.total_despesas_estimado = total_despesas_estimado;
   }

   public BigDecimal getTotal_desp_pessoal_estimado() {
      return this.total_desp_pessoal_estimado;
   }

   public void setTotal_desp_pessoal_estimado(BigDecimal total_desp_pessoal_estimado) {
      this.total_desp_pessoal_estimado = total_desp_pessoal_estimado;
   }

   public BigDecimal getTotal_desp_insumos_estimado() {
      return this.total_desp_insumos_estimado;
   }

   public void setTotal_desp_insumos_estimado(BigDecimal total_desp_insumos_estimado) {
      this.total_desp_insumos_estimado = total_desp_insumos_estimado;
   }

   public BigDecimal getTotal_desp_outros_estimado() {
      return this.total_desp_outros_estimado;
   }

   public void setTotal_desp_outros_estimado(BigDecimal total_desp_outros_estimado) {
      this.total_desp_outros_estimado = total_desp_outros_estimado;
   }

   public BigDecimal getTotal_icms_estimado() {
      return this.total_icms_estimado;
   }

   public void setTotal_icms_estimado(BigDecimal total_icms_estimado) {
      this.total_icms_estimado = total_icms_estimado;
   }

   public BigDecimal getTotal_ipi_estimado() {
      return this.total_ipi_estimado;
   }

   public void setTotal_ipi_estimado(BigDecimal total_ipi_estimado) {
      this.total_ipi_estimado = total_ipi_estimado;
   }

   public BigDecimal getTotal_iss_estimado() {
      return this.total_iss_estimado;
   }

   public void setTotal_iss_estimado(BigDecimal total_iss_estimado) {
      this.total_iss_estimado = total_iss_estimado;
   }

   public BigDecimal getTotal_pis_estimado() {
      return this.total_pis_estimado;
   }

   public void setTotal_pis_estimado(BigDecimal total_pis_estimado) {
      this.total_pis_estimado = total_pis_estimado;
   }

   public BigDecimal getTotal_cofins_estimado() {
      return this.total_cofins_estimado;
   }

   public void setTotal_cofins_estimado(BigDecimal total_cofins_estimado) {
      this.total_cofins_estimado = total_cofins_estimado;
   }

   public BigDecimal getTotal_irpj_estimado() {
      return this.total_irpj_estimado;
   }

   public void setTotal_irpj_estimado(BigDecimal total_irpj_estimado) {
      this.total_irpj_estimado = total_irpj_estimado;
   }

   public BigDecimal getTotal_airpj_estimado() {
      return this.total_airpj_estimado;
   }

   public void setTotal_airpj_estimado(BigDecimal total_airpj_estimado) {
      this.total_airpj_estimado = total_airpj_estimado;
   }

   public BigDecimal getTotal_csll_estimado() {
      return this.total_csll_estimado;
   }

   public void setTotal_csll_estimado(BigDecimal total_csll_estimado) {
      this.total_csll_estimado = total_csll_estimado;
   }

   public BigDecimal getTotal() {
      return this.total;
   }

   public void setTotal(BigDecimal total) {
      this.total = total;
   }

   public Integer getDuracao_estimada() {
      return this.duracao_estimada;
   }

   public void setDuracao_estimada(Integer duracao_estimada) {
      this.duracao_estimada = duracao_estimada;
   }

   public LocalDate getData_inicio() {
      return this.data_inicio;
   }

   public void setData_inicio(LocalDate data_inicio) {
      this.data_inicio = data_inicio;
   }

   public LocalDate getData_fim() {
      return this.data_fim;
   }

   public void setData_fim(LocalDate data_fim) {
      this.data_fim = data_fim;
   }

   public int getMatricula_criador() {
      return this.matricula_criador;
   }

   public void setMatricula_criador(int matricula_criador) {
      this.matricula_criador = matricula_criador;
   }

   public LocalDate getData_criacao() {
      return this.data_criacao;
   }

   public void setData_criacao(LocalDate data_criacao) {
      this.data_criacao = data_criacao;
   }

   public int getMatricula_atualizacao() {
      return this.matricula_atualizacao;
   }

   public void setMatricula_atualizacao(int matricula_atualizacao) {
      this.matricula_atualizacao = matricula_atualizacao;
   }

   public LocalDate getData_atualizacao() {
      return this.data_atualizacao;
   }

   public void setData_atualizacao(LocalDate data_atualizacao) {
      this.data_atualizacao = data_atualizacao;
   }

   public String toString() {
      return "Projetos{id_projeto=" + this.id_projeto + ", codigo_projeto=" + this.codigo_projeto + ", nome=" + this.nome + ", id_tipo_projeto=" + this.id_tipo_projeto + ", cliente=" + this.cliente + ", numero_contrato=" + this.numero_contrato + ", descricao_contrato=" + this.descricao_contrato + ", gestor1=" + this.gestor1 + ", gestor2=" + this.gestor2 + ", total_receitas_estimado=" + this.total_receitas_estimado + ", total_despesas_estimado=" + this.total_despesas_estimado + ", total_desp_pessoal_estimado=" + this.total_desp_pessoal_estimado + ", total_desp_insumos_estimado=" + this.total_desp_insumos_estimado + ", total_desp_outros_estimado=" + this.total_desp_outros_estimado + ", total_icms_estimado=" + this.total_icms_estimado + ", total_ipi_estimado=" + this.total_ipi_estimado + ", total_iss_estimado=" + this.total_iss_estimado + ", total_pis_estimado=" + this.total_pis_estimado + ", total_cofins_estimado=" + this.total_cofins_estimado + ", total_irpj_estimado=" + this.total_irpj_estimado + ", total_airpj_estimado=" + this.total_airpj_estimado + ", total_csll_estimado=" + this.total_csll_estimado + ", total=" + this.total + ", duracao_estimada=" + this.duracao_estimada + ", data_inicio=" + this.data_inicio + ", data_fim=" + this.data_fim + ", matricula_criador=" + this.matricula_criador + ", data_criacao=" + this.data_criacao + ", matricula_atualizacao=" + this.matricula_atualizacao + ", data_atualizacao=" + this.data_atualizacao + '}';
   }
}
