package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerImpl implements Logger {
    private static LoggerImpl logger;
    PrintWriter writer;
    private String path;

//    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private LoggerImpl() {
    }
    @Override
    public void log(LogLevel level, String message) {
        if(writer == null) {
            throw new IllegalStateException();
        }
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        String logEntry = String.format("[%s] [%s] %s", timeStamp, level, message);
        writer.println(logEntry);

    }

    private void init() {
        if (path != null) {
            try {
                writer = new PrintWriter(new FileWriter(path, true));
            } catch (IOException e) {
                throw new RuntimeException("Failed to initialize the logger.");
            }
        } else {
            throw new IllegalStateException("Logger is not initialized. Call setLogFile() first.");
        }
    }

    @Override
    public void setLogFile(String filePath) {
        if (path != null) {
            close();
        }
        path = filePath;
        init();
    }

    @Override
    public String getLogFile() {
        return this.path;
    }

    @Override
    public void flush() {
        if(writer != null)
            writer.flush();
    }

    @Override
    public void close() {
        if (writer != null) {
            writer.close();
        }
        path = null;
        writer = null;
    }

    public static LoggerImpl getLogger() {
        if(logger == null) {
            synchronized(LoggerImpl.class) {
                if(logger != null) {
                    logger = new LoggerImpl();
                }
            }
        }
        return logger;
    }

    public static void resetLogger() {
        logger = null;
    }


}