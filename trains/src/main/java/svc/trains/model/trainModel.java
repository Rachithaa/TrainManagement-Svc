package svc.trains.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class trainModel {

    private String trainId;

    private String trainName;

    private String sourceName;

    private String destinationName;

    private double totalKmsSourceToDestination;

    private double costPerKms;

    private String dayMonYear;

}
