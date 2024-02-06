package co.za.njmatrix.kasihustler.controller;

import co.za.njmatrix.kasihustler.model.entity.Registration;
import co.za.njmatrix.kasihustler.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/register")
@AllArgsConstructor
public class RegistrationController {


    final RegistrationService registrationService;

    @PostMapping
    public Mono<Registration> save(@RequestBody Registration registration) {
        return registrationService.save(registration);
    }

    @PutMapping("/update-registration")
    public Mono<Registration> update(@RequestBody Registration registration) {
        return registrationService.updateRegistration(registration);
    }

    @GetMapping("/find-all")
    public Flux<Registration> findAll() {
        return registrationService.findAll();
    }

    @GetMapping("/find-by-email/{email}")
    public Mono<Registration> findByEmail(@RequestParam String email) {
        return registrationService.findByEmailAddress(email);
    }
}
