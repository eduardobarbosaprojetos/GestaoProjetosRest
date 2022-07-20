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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
   name = "despesas"
)
public class Despesas implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id_despesa;
   @Column(
      name = "codigo_despesa",
      nullable = false,
      length = 2
   )
   private String codigo_despesa;
   @Column(
      name = "descricao",
      nullable = false,
      length = 50
   )
   private String descricao;
   @Column(
      name = "id_despesa_adm_insumo",
      nullable = false,
      length = 50
   )
   private String id_despesa_adm_insumo;

   public Despesas() {
   }

   public Despesas(Long id_despesa, String codigo_despesa, String descricao) {
      this.id_despesa = id_despesa;
      this.codigo_despesa = codigo_despesa;
      this.descricao = descricao;
   }

   public Long getId_despesa() {
      return this.id_despesa;
   }

   public void setId_despesa(Long id_despesa) {
      this.id_despesa = id_despesa;
   }

   public String getCodigo_despesa() {
      return this.codigo_despesa;
   }

   public void setCodigo_despesa(String codigo_despesa) {
      this.codigo_despesa = codigo_despesa;
   }

   public String getDescricao() {
      return this.descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public String toString() {
      return "Despesas{id_despesa=" + this.id_despesa + ", codigo_despesa=" + this.codigo_despesa + ", descricao=" + this.descricao + '}';
   }
}