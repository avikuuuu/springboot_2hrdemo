package com.avdesh.demo.configuration;
import com.avdesh.demo.DB;
import com.avdesh.demo.DevDB;
import com.avdesh.demo.ProdDB;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name = "project.mode" ,havingValue = "development")
    public DB getDevBean(){
        return new DevDB();

    }

    @Bean
    @ConditionalOnProperty(name = "project.mode" ,havingValue = "production")
    public DB getProdBean(){
        return new ProdDB();
    }
}
