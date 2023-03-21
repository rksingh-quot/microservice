package com.microservice.twitter.to.kafka.service;

import com.microservice.twitter.to.kafka.service.config.TwitterToKafkaServiceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
@Scope("")
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);
    private final TwitterToKafkaServiceConfig twitterToKafkaServiceConfig;

    public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfig twitterToKafkaServiceConfig) {
        //this is constructor
        this.twitterToKafkaServiceConfig = twitterToKafkaServiceConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Hello world");
        logger.info(Arrays.toString(twitterToKafkaServiceConfig.getTwitterKeywords().toArray(new String[]{})));
        logger.info(twitterToKafkaServiceConfig.getWelcomeMessages());

        logger.trace("doStuff needed more information - {}");
        logger.debug("doStuff needed to debug - {}");
        logger.info("doStuff took input - {}");
        logger.warn("doStuff needed to warn - {}");
        logger.error("doStuff encountered an error with value - {}");
    }
}
