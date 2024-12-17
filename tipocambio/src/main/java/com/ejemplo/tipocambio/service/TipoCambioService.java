/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.tipocambio.service;
import com.ejemplo.tipocambio.model.TipoCambio;
import com.ejemplo.tipocambio.model.TipoCambio.ConversionRequest;
import com.ejemplo.tipocambio.model.TipoCambio.ConversionResponse;

/**
 *
 * @author Diego
 */
public interface TipoCambioService {
    ConversionResponse convertirMonto(ConversionRequest request);
    TipoCambio actualizarTipoCambio(String monedaOrigen, String monedaDestino, Double nuevoTipoCambio);
}