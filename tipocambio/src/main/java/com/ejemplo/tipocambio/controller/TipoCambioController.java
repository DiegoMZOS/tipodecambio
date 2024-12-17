/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.tipocambio.controller;
import com.ejemplo.tipocambio.model.TipoCambio.ConversionRequest;
import com.ejemplo.tipocambio.model.TipoCambio.ConversionResponse;
import com.ejemplo.tipocambio.model.TipoCambio;
import com.ejemplo.tipocambio.service.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Diego
 */
@RestController
@RequestMapping("/api/tipocambio")
public class TipoCambioController {

    @Autowired
    private TipoCambioService service;

    @PostMapping("/convertir")
    public ConversionResponse convertirMonto(@RequestBody ConversionRequest request) {
        return service.convertirMonto(request);
    }

    @PostMapping("/actualizar")
    public TipoCambio actualizarTipoCambio(
            @RequestParam String monedaOrigen,
            @RequestParam String monedaDestino,
            @RequestParam Double nuevoTipoCambio) {
        return service.actualizarTipoCambio(monedaOrigen, monedaDestino, nuevoTipoCambio);
    }
}