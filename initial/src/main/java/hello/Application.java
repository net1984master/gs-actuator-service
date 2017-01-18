package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by akhodzinsky on 17.01.2017.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
    public Draw draw;
    public static void main(String[] args) {

        Draw draw=new Draw();

        SpringApplication.run(Application.class,args);
        Draw.make();
    }
}
