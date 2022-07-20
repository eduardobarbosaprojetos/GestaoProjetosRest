/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Repositorio;

/**
 *
 * @author gr001290
 */
import com.br.gridlab.GestaoProjetosRest.Model.ProjetosTipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjTpRepositorio extends JpaRepository<ProjetosTipos, Long> {
}
