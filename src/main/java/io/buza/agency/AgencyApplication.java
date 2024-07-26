package io.buza.agency;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@ServletComponentScan
@MapperScan("io.buza.agency.repository")
public class AgencyApplication {

    private static final Logger log = LoggerFactory.getLogger(AgencyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AgencyApplication.class, args);
    }

}
