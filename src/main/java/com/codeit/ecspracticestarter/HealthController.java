package com.codeit.ecspracticestarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
  @GetMapping("/health")
  public String checkHealth() {
    return "OK";   // 단순 상태 응답
  }
}