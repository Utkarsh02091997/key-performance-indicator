
package com.kpi.performance.constants;

public class Constants {
    private Constants() {
    }
    public static final String CSV_FILE_FOLDER_PATH = System.getProperty("user.home") + "/Downloads/kpiPerformanceMetrices";
    public static final String CSV_FILE_PATH = CSV_FILE_FOLDER_PATH + "/kpi.csv";
    public static final String[] CSV_HEADERS = {"User", "OpenAI API-Key", "Plugin", "Application", "Timestamp", "Details", "Count", "User Request", "LLM Generated Response", "Updated Response", "Correctness Percentage"};
}
