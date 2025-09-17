package com.duoc.semana6.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.duoc.semana6.model.Videojuego;
import com.duoc.semana6.repository.VideojuegoRepository;

@Service
public class VideojuegoServiceImpl implements VideojuegoService{
    
    private final VideojuegoRepository videojuegoRepository = new VideojuegoRepository();

    @Override
    public List<Videojuego> getAllVideojuegos(){
        return videojuegoRepository.findAll();
    }

    @Override
    public Videojuego getVideojuegoById(String id) {
        return videojuegoRepository.findVideojuegoById(id);
    }

    @Override
    public Videojuego getVideojuegoByTitulo(String titulo) {
        return videojuegoRepository.findVideojuegoByTitulo(titulo);
    }

    @Override
    public Videojuego getVideojuegoByPlataforma(String plataforma) {
        return videojuegoRepository.findVideojuegoByPlataforma(plataforma);
    }

}
