package co.za.njmatrix.kasihustler.controller;

import co.za.njmatrix.kasihustler.model.entity.Registration;
import co.za.njmatrix.kasihustler.service.RegistrationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/registration")
@AllArgsConstructor
public class RegistrationController {


    final RegistrationService registrationService;

    @PostMapping
    @Operation(description = "Register user")
    @ApiResponses({ @ApiResponse(responseCode = "200", description = "The user is registered.") })
    @PreAuthorize("hasAuthority('SCOPE_read_access')")
    public Mono<Registration> save(@RequestBody Registration registration) {
        return registrationService.save(registration);
    }

    @PutMapping("/update-registration")
    @Operation(description = "Update user")
    @ApiResponses({ @ApiResponse(responseCode = "200", description = "The user is found and updated.") })
    @PreAuthorize("hasAuthority('SCOPE_read_access')")
    public Mono<Registration> update(@RequestBody Registration registration) {
        return registrationService.updateRegistration(registration);
    }

    @GetMapping("/find-all")
    @Operation(description = "Read all users")
    @ApiResponses({ @ApiResponse(responseCode = "200", description = "The users were found and returned.") })
    @PreAuthorize("hasAuthority('SCOPE_read_access')")
    public Flux<Registration> findAll() {
        return registrationService.findAll();
    }

    @GetMapping("/find-by-email/{email}")
    @Operation(description = "Read user by email")
    @ApiResponses({ @ApiResponse(responseCode = "200", description = "The user found and returned.") })
    @PreAuthorize("hasAuthority('SCOPE_read_access')")
    public Mono<Registration> findByEmail(@RequestParam String email) {
        return registrationService.findByEmailAddress(email);
    }

    @GetMapping("/find-by-id/{id}")
    @Operation(description = "Read user by id")
    @ApiResponses({ @ApiResponse(responseCode = "200", description = "The user found and returned.") })
    @PreAuthorize("hasAuthority('SCOPE_read_access')")
    public Mono<Registration> findById(@RequestParam String id) {
        return registrationService.findById(id);
    }
}
