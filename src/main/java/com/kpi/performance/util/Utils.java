package com.kpi.performance.util;

import lombok.extern.slf4j.Slf4j;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class Utils {
    private Utils() {
    }

    public static void createFolderIfNotExists(String folderPath) {
        Path path = Paths.get(folderPath);

        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (Exception e) {
                log.error("Error creating folder:  {}", e.getMessage());
            }
        } else {
            log.info("Folder already exists: " + folderPath);
        }
    }
}
