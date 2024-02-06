package co.za.njmatrix.kasihustler.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(value = "registration")
public class Registration {

    @Id
    public String id;
    private String name;
    private String lastname;
    private Integer age;
    private ContactDetails contactDetails;
    private Address address;

}
