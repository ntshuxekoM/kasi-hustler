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
public class Address {

    private String houseNumber;
    private String city;
    private String streetName;
    private String code;
}
