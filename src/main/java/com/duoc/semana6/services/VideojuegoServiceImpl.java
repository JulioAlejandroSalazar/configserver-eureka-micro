package com.duoc.semana6.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.duoc.semana6.model.Videojuego;
import com.duoc.semana6.repository.VideojuegoRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@Service
public class VideojuegoServiceImpl implements VideojuegoService {

    private final VideojuegoRepository videojuegoRepository = new VideojuegoRepository();
    private static final String CIRCUIT_BREAKER_NAME = "videojuegoService";

    @Override
    @CircuitBreaker(name = CIRCUIT_BREAKER_NAME)
    @Retry(name = CIRCUIT_BREAKER_NAME)
    public List<Videojuego> getAllVideojuegos() {
        return videojuegoRepository.findAll();
    }

    @Override
    @CircuitBreaker(name = CIRCUIT_BREAKER_NAME)
    @Retry(name = CIRCUIT_BREAKER_NAME)
    public Videojuego getVideojuegoById(String id) {
        return videojuegoRepository.findVideojuegoById(id);
    }

    @Override
    @CircuitBreaker(name = CIRCUIT_BREAKER_NAME)
    @Retry(name = CIRCUIT_BREAKER_NAME)
    public Videojuego getVideojuegoByTitulo(String titulo) {
        return videojuegoRepository.findVideojuegoByTitulo(titulo);
    }

    @Override
    @CircuitBreaker(name = CIRCUIT_BREAKER_NAME)
    @Retry(name = CIRCUIT_BREAKER_NAME)
    public Videojuego getVideojuegoByPlataforma(String plataforma) {
        return videojuegoRepository.findVideojuegoByPlataforma(plataforma);
    }
}
