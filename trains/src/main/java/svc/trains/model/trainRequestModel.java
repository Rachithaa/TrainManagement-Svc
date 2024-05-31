package svc.trains.model;

import lombok.*;
import svc.trains.entity.trainEntity;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class trainRequestModel {

    private trainModel trains;
    private List<routeRequestModel> routes;
}
