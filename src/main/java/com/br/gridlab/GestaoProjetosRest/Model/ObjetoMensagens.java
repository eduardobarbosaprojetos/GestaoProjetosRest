/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Model;

/**
 *
 * @author gr001290
 */
public class ObjetoMensagens {
   private Integer status;
   private Integer tipo;
   private String message;

   public ObjetoMensagens(Integer status, Integer tipo, String message) {
      this.status = status;
      this.tipo = tipo;
      this.message = message;
   }

   public ObjetoMensagens() {
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public String getMessage() {
      return this.message;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public Integer getTipo() {
      return this.tipo;
   }

   public void setTipo(Integer tipo) {
      this.tipo = tipo;
   }

   public String toString() {
      return "ObjetoMensagens{status=" + this.status + ", tipo=" + this.tipo + ", mensagem=" + this.message + '}';
   }
}