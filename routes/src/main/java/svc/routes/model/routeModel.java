package svc.routes.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder=true)
@Generated
@Getter
@Setter
@Data
public class routeModel implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String routeId;

    private String stationName;

    private String dayMonYear;

    private String timeOfArrival;

    private String timeOfDeparture;

    private double totalDistance;

    private String trainId;

}

