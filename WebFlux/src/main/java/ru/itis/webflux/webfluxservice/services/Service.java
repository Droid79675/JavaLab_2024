package ru.itis.webflux.webfluxservice.services;

import reactor.core.publisher.Flux;
import ru.itis.webflux.webfluxservice.entities.Entity;


public interface Service {
    Flux<Entity> getAll();
}