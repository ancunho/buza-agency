package io.buza.agency;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "io.buza.agency.entity")
@EnableJpaRepositories(basePackages = {"io.buza.agency.repository"})
public class AgencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgencyApplication.class, args);
    }

}
