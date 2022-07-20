/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Repositorio;

/**
 *
 * @author gr001290
 */
import com.br.gridlab.GestaoProjetosRest.Model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepositorio extends JpaRepository<Usuarios, Long> {
   @Query(
      value = "SELECT * FROM view_usuarios WHERE matricula_usuario = ?1",
      nativeQuery = true
   )
   Usuarios ConsultaMatricula(Long matricula);
}