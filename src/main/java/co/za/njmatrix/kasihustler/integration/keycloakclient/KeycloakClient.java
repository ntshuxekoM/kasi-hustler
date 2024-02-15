package co.za.njmatrix.kasihustler.integration.keycloakclient;

import co.za.njmatrix.kasihustler.model.payload.KeycloakDTO;
import reactor.core.publisher.Flux;

public interface KeycloakClient {

    Flux<KeycloakDTO> registerUser(KeycloakDTO keycloakDTO);
}
