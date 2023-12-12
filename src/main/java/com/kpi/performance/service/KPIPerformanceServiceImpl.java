
package com.kpi.performance.service;

import com.kpi.performance.constants.Constants;
import com.kpi.performance.entity.KPIPerformance;
import com.kpi.performance.util.Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Slf4j
@Service
public class KPIPerformanceServiceImpl implements KPIPerformanceService {

    public KPIPerformance saveKPIPerformance(KPIPerformance kpiPerformance) {
        // Save to database code here


        // Save to CSV file code here
        writeDataToCsv(kpiPerformance);
        return null;
    }

    private void writeDataToCsv(KPIPerformance kpiPerformance) {
        try {
            Utils.createFolderIfNotExists(Constants.CSV_FILE_FOLDER_PATH);

            File file = new File(Constants.CSV_FILE_PATH);
            boolean fileExists = file.exists();

            try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
                // write the CSV headers

                if (!fileExists) {
                    writer.println(String.join(",", Constants.CSV_HEADERS));
                }
                // Append a new line with the data to the CSV file
                writer.println(kpiPerformance.getUser() + "," +
                        kpiPerformance.getOpenaiApiKey() + "," +
                        kpiPerformance.getPlugin() + "," +
                        kpiPerformance.getApplication() + "," +
                        kpiPerformance.getTimestamp() + "," +
                        kpiPerformance.getDetails() + "," +
                        kpiPerformance.getCount() + "," +
                        kpiPerformance.getUserRequest() + "," +
                        kpiPerformance.getLlmGeneratedResponse() + "," +
                        kpiPerformance.getUpdatedResponseCorrectness() + "," +
                        kpiPerformance.getCorrectnessPercentage()
                );
            }
        } catch (IOException e) {
            log.error("error occurred while data writing to CSV: {}", e.getMessage());
            // Handle exception as needed
        }
    }

}
