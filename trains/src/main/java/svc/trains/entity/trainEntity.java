package svc.trains.entity;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import svc.trains.constants.trainConstant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection= trainConstant.TRAIN_TABLE)
public class trainEntity {

    @Id
    @NotBlank(message = "required")
    private String trainId;

    @NotBlank(message="required")
    @Pattern(regexp = "^[A-Za-z]+\\s")
    @Size(min = 8, max =50)
    private String trainName;

    @NotBlank(message="required")
    @Pattern(regexp = "^[A-Za-z]+\\s")
    @Size(min = 8, max =50)
    private String sourceName;

    @NotBlank(message="required")
    @Pattern(regexp = "^[A-Za-z]+\\s")
    @Size(min = 8, max =50)
    private String destinationName;

    @NotNull(message = "required")
    @Digits(integer = 5,fraction = 2)
    private double totalKmsSourceToDestination;

    @NotNull(message = "required")
    @Digits(integer = 5,fraction = 2)
    private double costPerKms;

    @NotBlank(message ="Required")
    @Pattern(regexp="(^[1-9]|[12]\\d)/(0\\d|1[0-2])/(\\d{4}$)",message="Date of the Train should be in DD/MM/YYYY")
    private String dayMonYear;
}
