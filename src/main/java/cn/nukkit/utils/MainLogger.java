package cn.nukkit.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * author: MagicDroidX
 * Nukkit
 */
/*
We need to keep this class for backwards compatibility
 */
@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MainLogger extends ThreadedLogger {

    private static final MainLogger logger = new MainLogger();

    public static MainLogger getLogger() {
        return logger;
    }

    public void emergency(String message) {
        log.fatal(message);
    }

    
    public void alert(String message) {
        log.error(message);
    }

    
    public void critical(String message) {
        log.fatal(message);
    }

    
    public void error(String message) {
        log.error(message);
    }

    
    public void warning(String message) {
        log.warn(message);
    }

    
    public void notice(String message) {
        log.warn(message);
    }

    
    public void info(String message) {
        log.info(message);
    }

    
    public void debug(String message) {
        log.debug(message);
    }

    public void setLogDebug(Boolean logDebug) {
        throw new UnsupportedOperationException();
    }

    public void logException(Throwable t) {
        log.throwing(t);
    }

    
    public void log(LogLevel level, String message) {
        level.log(this, message);
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    
    public void emergency(String message, Throwable t) {
        log.fatal(message, t);
    }

    
    public void alert(String message, Throwable t) {
        log.error(message, t);
    }

    
    public void critical(String message, Throwable t) {
        log.fatal(message, t);
    }

    
    public void error(String message, Throwable t) {
        log.error(message, t);
    }

    
    public void warning(String message, Throwable t) {
        log.warn(message, t);
    }

    
    public void notice(String message, Throwable t) {
        log.warn(message, t);
    }

    
    public void info(String message, Throwable t) {
        log.info(message, t);
    }

    
    public void debug(String message, Throwable t) {
        log.debug(message, t);
    }

    
    public void log(LogLevel level, String message, Throwable t) {
        level.log(this, message, t);
    }
}
