/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Controller;

/**
 *
 * @author gr001290
 */
import com.br.gridlab.GestaoProjetosRest.Hash.clsHash;
import com.br.gridlab.GestaoProjetosRest.Model.Usuarios;
import com.br.gridlab.GestaoProjetosRest.Repositorio.LoginRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
   @Autowired
   private LoginRepositorio loginRepositorio;
   clsHash hs = new clsHash();

   @GetMapping({"/Usuarios"})
   public List<Usuarios> ListarUsuarios() {
      return this.loginRepositorio.findAll();
   }

   @PostMapping({"/auth"})
   public ResponseEntity<Usuarios> validar(@RequestBody Usuarios dadosUsuario) throws NumberFormatException, Exception {
      Optional<Usuarios> usuario = this.loginRepositorio.findById(dadosUsuario.getMatricula());
      Usuarios u = this.loginRepositorio.ConsultaMatricula(dadosUsuario.getMatricula());
      System.out.println(u.getNome());
      System.out.println(u.getDataCriacao());
      if (!usuario.isPresent()) {
         return new ResponseEntity(new Error("Usuário não encontrado"), HttpStatus.NOT_FOUND);
      } else {
         String senhaString = this.hs.criptografar(dadosUsuario.getSenha());
         Usuarios usarioverificar = new Usuarios(dadosUsuario.getMatricula(), senhaString);
         return usarioverificar.getSenha().equals(((Usuarios)usuario.get()).getSenha()) ? new ResponseEntity(usuario, HttpStatus.OK) : new ResponseEntity(new Error("Usuário não existe"), HttpStatus.BAD_REQUEST);
      }
   }
}