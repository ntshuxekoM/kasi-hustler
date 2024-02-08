package co.za.njmatrix.kasihustler.service;

import co.za.njmatrix.kasihustler.model.entity.Registration;
import co.za.njmatrix.kasihustler.repository.RegistrationRepository;
import reactor.core.publisher.Flux;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@AllArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    final RegistrationRepository registrationRepository;

    @Override
    public Mono<Registration> save(Registration registration)  {
        return registrationRepository.save(registration);
    }

    @Override
    public Mono<Registration> updateRegistration(Registration registration) {
        return save(registration);
    }

    @Override
    public Flux<Registration> findAll() {
        return registrationRepository.findAll();
    }

    @Override
    public Mono<Registration> findById(String id) {
        return registrationRepository.findById(id);
    }

    @Override
    public Mono<Registration> findByEmailAddress(String email) {
        return registrationRepository.findByContactDetailsEmailAddress(email);
    }
}
