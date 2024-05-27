package svc.routes.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import svc.routes.constants.routeConstant;

@NoArgsConstructor
@AllArgsConstructor
@Generated
@Getter
@Setter
@Data
@Document(collection= routeConstant.ROUTE_TABLE)
public class routeEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Digits(integer = 5,fraction = 0)
	private int routeId;
		
	@NotBlank(message ="Required")
	@Size(min=3,max=1000)
	@Indexed(unique=true)
	private String routeName;
	
	@NotBlank(message ="Required")
	@Pattern(regexp="[0-3][0-9]/[0-1][0-9]/[0-9][0-9][0-9][0-9]$",message="Date of the Train should be in DD/MM/YYYY")
	private String dayMonYear;
	
	@NotBlank(message ="Required")
	@Pattern(regexp="[0-2][0-9]:[0-5][0-9]:[0-5][0-9]$",message="start time of the Train in this route should be of hh:mm:ss")
	private String startRouteTrainTimings;
	
	@NotBlank(message ="Required")
	@Pattern(regexp="[0-2][0-9]:[0-5][0-9]:[0-5][0-9]$",message="reach time of the Train in this route should be of hh:mm:ss")
	private String routeReachTrainTimings;
	
	@NotBlank(message ="Required")
	@Size(min=3,max=1000)
	@Indexed(unique=true)
	private String trainId;
	
}
