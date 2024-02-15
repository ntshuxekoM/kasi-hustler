package co.za.njmatrix.kasihustler.model.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
public class KeycloakDTO {
    private String username;
    private boolean enabled;
    private String email;
    private String firstName;
    private String lastname;
    private List<Credential> credential;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class Credential {
        private String type;
        private String value;
        private boolean temporary;
    }
}
