package co.za.njmatrix.kasihustler.repository;

import co.za.njmatrix.kasihustler.model.entity.Registration;
import reactor.core.publisher.*;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface RegistrationRepository extends ReactiveCrudRepository<Registration, String> {
    Mono<Registration> findByContactDetailsEmailAddress(String email);

}
