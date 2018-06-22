package cn.net.aipic.spring.cloud.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class WeatherEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherEurekaServerApplication.class, args);
    }
}
