package ru.itis.webflux.webfluxservice.clients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import ru.itis.webflux.webfluxservice.entities.Entity;

import java.util.Arrays;

@Component
public class FastWebClient implements Client {

    private final WebClient client;

    public FastWebClient(@Value("${fastAppService.api.url}") String url) {
        client = WebClient.builder()
                .baseUrl(url)
                .build();
    }

    @Override
    public Flux<Entity> getAll() {
        return client.get()
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(Entity[].class))
                .flatMapIterable(Arrays::asList);
    }
}