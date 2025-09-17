package com.duoc.semana6.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Videojuego {

    private String id;
    private String titulo;
    private int precio;
    private String plataforma;
    private boolean disponibilidad;

}
