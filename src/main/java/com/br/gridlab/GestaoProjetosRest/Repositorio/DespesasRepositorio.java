/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Repositorio;

/**
 *
 * @author gr001290
 */
import com.br.gridlab.GestaoProjetosRest.Model.Despesas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DespesasRepositorio extends JpaRepository<Despesas, Long> {
   @Query(
      value = "SELECT * FROM despesas WHERE id_despesa = ?1",
      nativeQuery = true
   )
   Despesas consultaPorId(Long id);
}