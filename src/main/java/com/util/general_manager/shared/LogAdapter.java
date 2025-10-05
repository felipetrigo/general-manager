package com.util.general_manager.shared;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class LogAdapter {

    private final Logger log = Logger.getLogger(LogAdapter.class.getName());
    public void info(String logMessage) {
        log.info(logMessage);
    }
}
