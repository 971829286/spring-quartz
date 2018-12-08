package org.hsiang.free;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@MapperScan(basePackages = {"org.hsiang.free.modular.dao"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringQuartzApplication.class, args);
    }
}
