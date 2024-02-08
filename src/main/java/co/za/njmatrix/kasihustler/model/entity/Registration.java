package co.za.njmatrix.kasihustler.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(value = "registration")
public class Registration {

    @Id
    @Generated
    public String id;
    private String name;
    private String lastname;
    private Integer age;
    private ContactDetails contactDetails;
    private Address address;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ContactDetails {

        private String cellNumber;
        private String alternativeNumber;
        private String emailAddress;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Address {

        private String houseNumber;
        private String city;
        private String streetName;
        private String code;
    }

}
