package com.duoc.semana6.repository;

import java.util.ArrayList;
import java.util.List;

import com.duoc.semana6.model.Videojuego;

public class VideojuegoRepository {

    private final List<Videojuego> videojuegos = new ArrayList<>();

    public List<Videojuego> findAll() {
        return videojuegos;
    }

    public Videojuego findVideojuegoById (String id) {
        for(Videojuego videojuego : videojuegos) {
            if(videojuego.getId().equals(id)) {
                return videojuego;
            }
        }
        return null;
    }

    public Videojuego findVideojuegoByTitulo (String titulo) {
        for(Videojuego videojuego : videojuegos) {
            if(videojuego.getTitulo().equals(titulo)) {
                return videojuego;
            }
        }
        return null;
    }

    public Videojuego findVideojuegoByPlataforma (String plataforma) {
        for(Videojuego videojuego : videojuegos) {
            if(videojuego.getPlataforma().equals(plataforma)) {
                return videojuego;
            }
        }
        return null;
    }

    public VideojuegoRepository() {
        videojuegos.add(new Videojuego("1", "Minecraft", 25000, "PC", true));
        videojuegos.add(new Videojuego("2", "Red dead redemption 2", 60000, "Xbox", true));
        videojuegos.add(new Videojuego("3", "The last of us", 60000, "PS5", true));
    }
    
}
