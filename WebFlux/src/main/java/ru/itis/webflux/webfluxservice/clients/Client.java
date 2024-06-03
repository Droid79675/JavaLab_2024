package ru.itis.webflux.webfluxservice.clients;

import reactor.core.publisher.Flux;
import ru.itis.webflux.webfluxservice.entities.Entity;


public interface Client {

    Flux<Entity> getAll();
}