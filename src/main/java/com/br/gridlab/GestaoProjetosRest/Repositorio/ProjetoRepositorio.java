/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Repositorio;

/**
 *
 * @author gr001290
 */
import com.br.gridlab.GestaoProjetosRest.Model.Projetos;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepositorio extends JpaRepository<Projetos, Long> {
   @Query(
      value = "select TOP(1) * from projetos where codigo_projeto = ?1",
      nativeQuery = true
   )
   Optional<Projetos> consultaPorCodigoProjeto(String numero);
    @Query(
      value = "select * from projetos where status = ?1",
      nativeQuery = true
   )
   List<Projetos> consultaPorStatus(Long status);
}