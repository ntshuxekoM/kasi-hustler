package co.za.njmatrix.kasihustler.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class ContactDetails {

    private String cellNumber;
    private String alternativeNumber;
    private String emailAddress;
}
