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
import java.util.Objects;
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
   @GetMapping({"/projetos/list/{status}"})
   public List<Projetos> listar_Projetos_status(@PathVariable Long status) {
      return this.projetoRepositorio.consultaPorStatus(status);
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
         //projeto.setStatus(1);//seta sempre ao cadastrar como 1 - Ativo / 2 - Encerrado
         try {
            this.projetoRepositorio.save(projeto);
            return ResponseEntity.ok(projeto);
         } catch (Exception var7) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
         }
      }
   }
   @PutMapping({"/atualizarProjeto"})
   public ResponseEntity<Projetos> atualizar(@RequestBody Projetos projeto) throws ParseException {
      ObjetoMensagens msg = new ObjetoMensagens();
      Projetos proj = this.projetoRepositorio.getById(projeto.getId_projeto());
      if (Objects.equals(proj.getId_projeto(), projeto.getId_projeto())) {
          //System.out.println("Id Projeto Post:"+ projeto.getId_projeto());
          //System.out.println("Id Projeto getById:"+ proj.getId_projeto());
         Util objUtil = new Util();
         LocalDate dtfim = objUtil.RetornaDataTerminoContrato(projeto.getData_inicio(), projeto.getDuracao_estimada());
         projeto.setData_fim(dtfim);
         projeto.setData_criacao(projeto.getData_criacao());
         projeto.setData_atualizacao(LocalDate.now());
         try {
             //System.out.println("caiu no try");
            this.projetoRepositorio.save(projeto);
             //System.out.println("passou do save");
            return ResponseEntity.ok(projeto);
         } catch (Exception var7) {
              //System.out.println("caiu no catch");
               msg.setStatus(HttpStatus.NOT_FOUND.value());
               msg.setMessage("");
               //System.out.println(var7.getMessage());
               msg.setTipo(1);
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
         }
         
      } else {
        msg.setStatus(HttpStatus.NOT_FOUND.value());
         msg.setMessage("O Projeto informado não existe");
         msg.setTipo(1);
         return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
      }
   }
}