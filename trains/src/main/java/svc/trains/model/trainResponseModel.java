package svc.trains.model;

import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class trainResponseModel {

    private trainModel trains;
    private List<routeModel> routes;
}
