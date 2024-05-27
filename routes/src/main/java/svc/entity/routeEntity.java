package svc.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
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
import svc.constants.routeConstant;

@NoArgsConstructor
@AllArgsConstructor
@Entity
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
	@Pattern(regexp="^[0-3][0-9]/[1-12]/[1-10000]$",message="Date of the Train should be in DD/MM/YYYY")
	private String DayMonYear;
	
	@NotBlank(message ="Required")
	@Pattern(regexp="^[0-24]:[0-60]:[0-60]$",message="start time of the Train in this route should be of hh:mm:ss")
	private String startRouteTrainTimings;
	
	@NotBlank(message ="Required")
	@Pattern(regexp="^[0-24]:[0-60]:[0-60]$",message="reach time of the Train in this route should be of hh:mm:ss")
	private String routeReachTrainTimings;
	
	@NotBlank(message ="Required")
	@Size(min=3,max=1000)
	@Indexed(unique=true)
	private String trainId;
	
}
