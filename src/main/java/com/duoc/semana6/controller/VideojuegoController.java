package com.duoc.semana6.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.duoc.semana6.messaging.VideojuegoProducer;
import com.duoc.semana6.model.Videojuego;
import com.duoc.semana6.services.VideojuegoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/videojuego")
@RequiredArgsConstructor
public class VideojuegoController {
    
    private final VideojuegoService videojuegoService;
    private final VideojuegoProducer kafkaProducer;

    @GetMapping()
    public ResponseEntity<List<Videojuego>> getAllVideojuego() {
        List<Videojuego> videojuegos = videojuegoService.getAllVideojuegos();
        if(videojuegos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(videojuegos);
    }
    
    // @GetMapping("/id/{id}")
    // public ResponseEntity<Videojuego> getVideojuegoById(@PathVariable String id) {
    //     Videojuego videojuego = videojuegoService.getVideojuegoById(id);
    //     if(videojuego == null) {
    //         return ResponseEntity.notFound().build();
    //     }
    //     return ResponseEntity.ok(videojuego);
    // }

    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<Videojuego> getVideojuegoByTitulo(@PathVariable String titulo) {
        Videojuego videojuego = videojuegoService.getVideojuegoByTitulo(titulo);
        if(videojuego == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(videojuego);
    }

    @GetMapping("/plataforma/{plataforma}")
    public ResponseEntity<Videojuego> getVideojuegoByPlataforma(@PathVariable String plataforma) {
        Videojuego videojuego = videojuegoService.getVideojuegoByPlataforma(plataforma);
        if(videojuego == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(videojuego);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Videojuego> getVideojuegoById(@PathVariable String id) {
        Videojuego videojuego = videojuegoService.getVideojuegoById(id);
        if(videojuego == null) {
            return ResponseEntity.notFound().build();
        }
        // enviar evento a Kafka
        kafkaProducer.send("videojuego-consultas", "Se consultó el juego con id: " + id);
        return ResponseEntity.ok(videojuego);
    }


}
