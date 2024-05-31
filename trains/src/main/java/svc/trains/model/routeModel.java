package svc.trains.model;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Generated
@Getter
@Setter
@Data
public class routeModel implements Serializable{

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
