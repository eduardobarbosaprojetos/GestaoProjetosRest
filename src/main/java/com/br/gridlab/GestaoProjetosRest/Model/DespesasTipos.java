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
   name = "despesas_tipos"
)
public class DespesasTipos implements Serializable {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   @Column(
      name = "id_despesa_tipo",
      nullable = false
   )
   private Long id_despesa_tipo;
   @Column(
      name = "codigo",
      nullable = false,
      length = 2
   )
   private String codigo;
   @Column(
      name = "descricao",
      nullable = false,
      length = 100
   )
   private String descricao;
   @Column(
      name = "id_despesa",
      nullable = false,
      length = 100
   )
   private Long id_despesa;

   public DespesasTipos() {
   }

   public DespesasTipos(Long id_despesa_tipo, String codigo, String descricao, Long id_despesa) {
      this.id_despesa_tipo = id_despesa_tipo;
      this.codigo = codigo;
      this.descricao = descricao;
      this.id_despesa = id_despesa;
   }

   public Long getId_despesa_tipo() {
      return this.id_despesa_tipo;
   }

   public void setId_despesa_tipo(Long id_despesa_tipo) {
      this.id_despesa_tipo = id_despesa_tipo;
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

   public Long getId_despesa() {
      return this.id_despesa;
   }

   public void setId_despesa(Long id_despesa) {
      this.id_despesa = id_despesa;
   }

   public String toString() {
      return "DespesasTipos{id_despesa_tipo=" + this.id_despesa_tipo + ", codigo=" + this.codigo + ", descricao=" + this.descricao + '}';
   }
}
