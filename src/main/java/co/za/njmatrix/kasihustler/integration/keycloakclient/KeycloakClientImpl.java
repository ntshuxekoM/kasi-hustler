package co.za.njmatrix.kasihustler.integration.keycloakclient;

import co.za.njmatrix.kasihustler.model.payload.KeycloakDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
//import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class KeycloakClientImpl implements KeycloakClient {

//    @Value("${keycloak.base.url}")
//    String baseUrl;
//    @Autowired
//    private WebClient client;

    //private final OAuth2AuthorizedClientService clientService;

    @Override
    public Flux<KeycloakDTO> registerUser(KeycloakDTO keycloakDTO) {
       return null;
       //client.get()
//                .uri(  "/users")
//                .header("Barear " + getToken())
//                .accept(MediaType.APPLICATION_JSON)
//                .exchangeToFlux(response -> response.bodyToFlux(KeycloakDTO.class));
    }

    private String getToken() {
//        OAuth2AuthorizedClient client = clientService.loadAuthorizedClient("your-client-registration-id", "your-principal-name");
//        OAuth2AccessToken accessToken = client.getAccessToken();
//        return accessToken.getTokenValue();

        return null;
    }

}
