package com.duoc.semana6.messaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoConsumer {
    
    @KafkaListener(topics = "videojuego-consultas", groupId = "grupo-videojuegos")
    public void listen(String message) {
        System.out.println("Mensaje recibido de Kafka: " + message);
    }
    
}
