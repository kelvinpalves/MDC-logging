package br.com.forgeit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MdcLoggingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MdcLoggingApplication.class, args);
    }

}
