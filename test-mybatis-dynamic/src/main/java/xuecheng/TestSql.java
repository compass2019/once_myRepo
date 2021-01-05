package xuecheng;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("xuecheng.dao")
@SpringBootApplication
@SpringBootConfiguration
public class TestSql {
    public static void main(String[] args) {
        SpringApplication.run(TestSql.class,args);
    }
}