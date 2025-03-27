package com.rge.dormitorio.rgeallocator.adapters.controller;

import com.rge.dormitorio.rgeallocator.adapters.controller.output.ReservasResponseData;
import com.rge.dormitorio.rgeallocator.usecases.ListaReservas;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservas")
@RequiredArgsConstructor
public class ReservasController {

    private final ListaReservas listaReservas;

    @GetMapping
    @CrossOrigin("*")
    public ResponseEntity<ReservasResponseData> getAllReservas() {
        ReservasResponseData data = listaReservas.execute();
        return ResponseEntity.ok(data);
    }

}
