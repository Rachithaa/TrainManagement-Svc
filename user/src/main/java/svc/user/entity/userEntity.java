package svc.user.entity;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import svc.user.constants.userConstant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = userConstant.USER_TABLE)
public class userEntity {

    @Id
    @Digits(integer = 5,fraction = 0)
    private int userId;

    @NotBlank(message = "required")
    @Pattern(regexp = "^[A-Za-z\\s]+$",message = "Only alphabets and spaces are allowed is allowed")
    @Size(min = 3, max = 15,message = "min 3 max 15")
    private String userName;

    @NotEmpty(message = "required")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z].{15,20}$",message = "It should be in format abc@gmail.com")
    private String userEmail;

    @NotEmpty(message = "required")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$",message = "It contains at least 8 characters and at most 20 characters.\n" +
            "It contains at least one digit.\n" +
            "It contains at least one upper case alphabet.\n" +
            "It contains at least one lower case alphabet.\n" +
            "It contains at least one special character \n" +
            "It doesn’t contain any white space.")
    private String userPassword;

    @NotEmpty(message = "required")
    @Size(min=1,max=10)
    private String userGender;

    @NotEmpty(message = "required")
    @Pattern(regexp = "^\\d{10}$",message = "It should be of 10 digits")
    private String userContact;

    @NotEmpty(message = "required")
    @Pattern(regexp = "^[A-Za-z0-9 \\-:/()]+$",message = "address can have alphabets and numbers and special character such as(-,:,/,())")
    @Size(min = 10, max = 50,message = "min 10 max 50")
    private String userAddress;

}
