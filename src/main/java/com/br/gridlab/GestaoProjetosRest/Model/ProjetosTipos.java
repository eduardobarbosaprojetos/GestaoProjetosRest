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
   name = "projetos_tipos"
)
public class ProjetosTipos {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   @Column(
      name = "id_tipo_projeto",
      nullable = false
   )
   private Long id_tipo_projeto;
   @Column(
      name = "descricao",
      nullable = false,
      length = 50
   )
   private String descricao;

   public ProjetosTipos() {
   }

   public ProjetosTipos(Long id_tipo_projeto, String descricao) {
      this.id_tipo_projeto = id_tipo_projeto;
      this.descricao = descricao;
   }

   public Long getId_tipo_projeto() {
      return this.id_tipo_projeto;
   }

   public void setId_tipo_projeto(Long id_tipo_projeto) {
      this.id_tipo_projeto = id_tipo_projeto;
   }

   public String getDescricao() {
      return this.descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public String toString() {
      return "ProjetosTipos{id_tipo_projeto=" + this.id_tipo_projeto + ", descricao=" + this.descricao + '}';
   }
}