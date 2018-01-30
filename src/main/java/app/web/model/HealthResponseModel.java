package app.web.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HealthResponseModel {

    private HealthStatus application;

}
