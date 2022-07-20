/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Controller;

/**
 *
 * @author gr001290
 */
import com.br.gridlab.GestaoProjetosRest.Model.ObjetoMensagens;
import com.br.gridlab.GestaoProjetosRest.Model.Projetos;
import com.br.gridlab.GestaoProjetosRest.Model.ProjetosTipos;
import com.br.gridlab.GestaoProjetosRest.Repositorio.ProjTpRepositorio;
import com.br.gridlab.GestaoProjetosRest.Repositorio.ProjetoRepositorio;
import com.br.gridlab.GestaoProjetosRest.Util.Util;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjetosController {
   @Autowired
   private ProjetoRepositorio projetoRepositorio;
   @Autowired
   private ProjTpRepositorio reptiposprojetos;

   @GetMapping({"/tiposprojetos/list"})
   public List<ProjetosTipos> listar_tiposProjetos() {
      return this.reptiposprojetos.findAll();
   }
   @GetMapping({"/consultarProjeto/{codigo}"})
   public ResponseEntity<Projetos> consultarProjeto(@PathVariable String codigo) {
      ObjetoMensagens msg = new ObjetoMensagens();
      Optional<Projetos> proj = this.projetoRepositorio.consultaPorCodigoProjeto(codigo);
      if (!proj.isPresent()) {
         msg.setStatus(HttpStatus.NOT_FOUND.value());
         msg.setMessage("O Projeto não existe");
         msg.setTipo(1);
         return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
      } 
      Projetos projeto = proj.get();
      return ResponseEntity.ok(projeto);
   }
   @GetMapping({"/tiposprojetos/{id_tipo_projeto}"})
   public ResponseEntity<ProjetosTipos> consultarTipoProjeto(@PathVariable Long id_tipo_projeto) {
      ObjetoMensagens msg = new ObjetoMensagens();
      Optional<ProjetosTipos> tp_proj = this.reptiposprojetos.findById(id_tipo_projeto);
      if (!tp_proj.isPresent()) {
         msg.setStatus(HttpStatus.NOT_FOUND.value());
         msg.setMessage("O Tipo de Projeto não existe");
         msg.setTipo(1);
         return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
      } 
      ProjetosTipos tipo_projeto = tp_proj.get();
      return ResponseEntity.ok(tipo_projeto);
   }
   @GetMapping({"/projetos/list"})
   public List<Projetos> listar_Projetos() {
      return this.projetoRepositorio.findAll();
   }
   @PostMapping({"/cadastrarProjeto"})
   public ResponseEntity<Projetos> cadastrar(@RequestBody Projetos projeto) throws ParseException {
      ObjetoMensagens msg = new ObjetoMensagens();
      Optional<Projetos> proj = this.projetoRepositorio.consultaPorCodigoProjeto(projeto.getCodigo_projeto());
      if (proj.isPresent()) {
         msg.setStatus(HttpStatus.FOUND.value());
         msg.setMessage("O Projeto já existe");
         msg.setTipo(1);
         return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
      } else {
         Util objUtil = new Util();
         LocalDate dtfim = objUtil.RetornaDataTerminoContrato(projeto.getData_inicio(), projeto.getDuracao_estimada());
         projeto.setData_fim(dtfim);
         projeto.setData_criacao(LocalDate.now());

         try {
            this.projetoRepositorio.save(projeto);
            return ResponseEntity.ok(projeto);
         } catch (Exception var7) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
         }
      }
   }
   @PostMapping({"/atualizarProjeto"})
   public ResponseEntity<Projetos> atualizar(@RequestBody Projetos projeto) throws ParseException {
      ObjetoMensagens msg = new ObjetoMensagens();
      Optional<Projetos> proj = this.projetoRepositorio.consultaPorCodigoProjeto(projeto.getCodigo_projeto());
      if (proj.isPresent()) {
         msg.setStatus(HttpStatus.FOUND.value());
         msg.setMessage("O Projeto já existe");
         msg.setTipo(1);
         return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
      } else {
         Util objUtil = new Util();
         LocalDate dtfim = objUtil.RetornaDataTerminoContrato(projeto.getData_inicio(), projeto.getDuracao_estimada());
         projeto.setData_fim(dtfim);
         projeto.setData_criacao(LocalDate.now());

         try {
            this.projetoRepositorio.save(projeto);
            return ResponseEntity.ok(projeto);
         } catch (Exception var7) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
         }
      }
   }
}