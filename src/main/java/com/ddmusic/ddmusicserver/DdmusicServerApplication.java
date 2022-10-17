package com.ddmusic.ddmusicserver;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author puye(0303)
 */
@SpringBootApplication
@MapperScan({"com.ddmusic.ddmusicserver.mapper"})
@EnableTransactionManagement
@Slf4j
public class DdmusicServerApplication {

    public static void main(String[] args) {
        try {
            ConfigurableEnvironment env = SpringApplication.run (DdmusicServerApplication.class, args).getEnvironment ();
            log.info ("SysApplication runs successfully!");
            String protocol = "http";
            String infoStr = """
                    ----------------------------------------------------------
                    StickPointMusicApplication current version v0.0.1
                    Application {} is running! Access URLs:
                    Local: {}://localhost:{}
                    Profile(s): {}
                    ----------------------------------------------------------
                    """;
            log.info(infoStr,
                    env.getProperty("spring.application.name"),
                    protocol,
                    env.getProperty("server.port"),
                    env.getActiveProfiles());
        } catch (Exception e) {
            log.error (e.getMessage ());
        }
    }

}
