package org.example;

import java.io.IOException;

public interface Logger {

    void log(LogLevel level, String message);

    void setLogFile(String filePath) throws IOException;

    String getLogFile();

    // Flush the log entries to the file
    void flush();

    // Close the logger and release any resources
    void close();
}
