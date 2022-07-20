/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Controller;

/**
 *
 * @author gr001290
 */import com.br.gridlab.GestaoProjetosRest.Model.Despesas;
import com.br.gridlab.GestaoProjetosRest.Model.DespesasTipos;
import com.br.gridlab.GestaoProjetosRest.Repositorio.DespesasRepositorio;
import com.br.gridlab.GestaoProjetosRest.Repositorio.DespesasTiposRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DespesasController {
   @Autowired
   private DespesasTiposRepositorio despesasTiposRepositorio;
   @Autowired
   private DespesasRepositorio despesasRepositorio;

   @GetMapping({"/Listar/Despesas"})
   public List<Despesas> ListarDespesas() {
      return this.despesasRepositorio.findAll();
   }

   @PostMapping({"/Cadastrar/TiposDespesas"})
   public ResponseEntity<DespesasTipos> cadastrar(@RequestBody DespesasTipos despesasTipo) {
      Optional<Despesas> despesa = this.despesasRepositorio.findById(despesasTipo.getId_despesa());
      if (!despesa.isPresent()) {
         return new ResponseEntity(new Error("cidadao não encontrado"), HttpStatus.NOT_FOUND);
      } else {
         this.despesasTiposRepositorio.save(despesasTipo);
         return ResponseEntity.ok(despesasTipo);
      }
   }

   @PutMapping({"/Atualizar/TiposDespesas/{id}"})
   public ResponseEntity<DespesasTipos> Update(@PathVariable("id") Long tipodespesaid, @RequestBody DespesasTipos dadosRequest) {
      Optional<DespesasTipos> tipodespesas = this.despesasTiposRepositorio.findById(tipodespesaid);
      if (!tipodespesas.isPresent()) {
         return new ResponseEntity(new Error("Tipo de Despesa não encontrada"), HttpStatus.NOT_FOUND);
      } else {
         DespesasTipos tiposDespesa = new DespesasTipos();
         tiposDespesa.setId_despesa_tipo(dadosRequest.getId_despesa_tipo());
         tiposDespesa.setCodigo(dadosRequest.getCodigo());
         tiposDespesa.setDescricao(dadosRequest.getDescricao());
         tiposDespesa.setId_despesa(dadosRequest.getId_despesa());
         this.despesasTiposRepositorio.save(tiposDespesa);
         return ResponseEntity.ok(tiposDespesa);
      }
   }
}