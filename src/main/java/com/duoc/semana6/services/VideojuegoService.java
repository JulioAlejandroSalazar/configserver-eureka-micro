package com.duoc.semana6.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.duoc.semana6.model.Videojuego;

@Service
public interface VideojuegoService {
    List<Videojuego> getAllVideojuegos();
    Videojuego getVideojuegoById(String id);
    Videojuego getVideojuegoByTitulo(String titulo);
    Videojuego getVideojuegoByPlataforma(String plataforma);
}
