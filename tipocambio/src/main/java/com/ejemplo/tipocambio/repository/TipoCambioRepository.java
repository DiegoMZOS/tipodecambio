/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.tipocambio.repository;
import com.ejemplo.tipocambio.model.TipoCambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 *
 * @author Diego
 */

@Repository
public interface TipoCambioRepository extends JpaRepository<TipoCambio, Long> {
    Optional<TipoCambio> findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino);
}