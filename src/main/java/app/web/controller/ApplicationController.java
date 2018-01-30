package app.web.controller;

import app.web.model.HealthResponseModel;
import app.web.model.HealthStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/health")
    public ResponseEntity<HealthResponseModel> getHealth() {
        return ResponseEntity.ok(HealthResponseModel.builder()
                .application(HealthStatus.OK)
                .build());
    }

}
