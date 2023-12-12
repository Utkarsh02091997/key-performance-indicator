
package com.kpi.performance.controller;

import com.kpi.performance.entity.KPIPerformance;
import com.kpi.performance.service.KPIPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KPIPerformanceController {

    @Autowired
    private KPIPerformanceService kpiPerformanceService;

    @PostMapping("/saveKPIPerformance")
    public KPIPerformance saveKPIPerformance(@RequestBody KPIPerformance kpiPerformance) {
        return kpiPerformanceService.saveKPIPerformance(kpiPerformance);
    }
}
