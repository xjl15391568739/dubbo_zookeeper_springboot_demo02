package provider3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("provider3.mapper")
public class Provider3Start {

    public static void main(String[] args) {

        SpringApplication.run(Provider3Start.class,args);
    }
}
