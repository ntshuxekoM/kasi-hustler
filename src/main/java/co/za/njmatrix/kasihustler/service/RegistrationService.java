package co.za.njmatrix.kasihustler.service;

import co.za.njmatrix.kasihustler.model.entity.Registration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface RegistrationService {

    Mono<Registration> save(Registration registration);

    Mono<Registration> updateRegistration(Registration registration);

    Flux<Registration> findAll();

    Mono<Registration> findById(String id);

    Mono<Registration> findByEmailAddress(String email);

}
