/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Model;

/**
 *
 * @author gr001290
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
   name = "despesas_adm_insumos"
)
public class DespesasAdmInsumos {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id_despesa_adm_insumo;
   @Column(
      name = "codigo",
      nullable = false,
      length = 2
   )
   private String codigo;
   @Column(
      name = "descricao",
      nullable = false,
      length = 50
   )
   private String descricao;

   public DespesasAdmInsumos() {
   }

   public DespesasAdmInsumos(Long id_despesa_adm_insumo, String codigo, String descricao) {
      this.id_despesa_adm_insumo = id_despesa_adm_insumo;
      this.codigo = codigo;
      this.descricao = descricao;
   }

   public Long getId_despesa_adm_insumo() {
      return this.id_despesa_adm_insumo;
   }

   public void setId_despesa_adm_insumo(Long id_despesa_adm_insumo) {
      this.id_despesa_adm_insumo = id_despesa_adm_insumo;
   }

   public String getCodigo() {
      return this.codigo;
   }

   public void setCodigo(String codigo) {
      this.codigo = codigo;
   }

   public String getDescricao() {
      return this.descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public String toString() {
      return "DespesasAdmInsumos{id_despesa_adm_insumo=" + this.id_despesa_adm_insumo + ", codigo=" + this.codigo + ", descricao=" + this.descricao + '}';
   }
}
