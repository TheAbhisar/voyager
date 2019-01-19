package com.weAssist.main.WeAssist;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * This is the main Start up application for
 */
@SpringBootApplication
@ComponentScan("com.weAssist.components.*")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ApplicationMain {

    /**
     *
     * @param args
     */
    public static  void main(String [] args ){
        SpringApplication.run(ApplicationMain.class, args);

    }
}
