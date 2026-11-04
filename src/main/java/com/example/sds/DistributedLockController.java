package com.example.sds;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/** Entry point for the "Distributed lock" demo. Replace with the real implementation (see TODO.md). */
@RestController
public class DistributedLockController {
    @GetMapping("/demo/distributed-lock")
    public Map<String, String> demo() {
        return Map.of("concept", "Distributed lock", "status", "scaffold - implement me");
    }
}
