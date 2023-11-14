package org.example;

class LoggerSolution {
    public LoggerImpl getInstance() {
        return LoggerImpl.getLogger();
    }
    public void resetInstance() {
        LoggerImpl.resetLogger();
    }
}