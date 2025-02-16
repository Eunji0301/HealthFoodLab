package org.koreait.example.teamproject_healthfoodlab;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.koreait.example.teamproject_healthfoodlab.repository")
public class TeamprojectHealthFoodLabApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeamprojectHealthFoodLabApplication.class, args);
    }

}
