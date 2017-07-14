package intermediate.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;


/**
 * Created by jtian on 6/19/2017.
 */
@SpringBootApplication
@Service
public class App implements CommandLineRunner {

    @Autowired
    Demo demo;

    public void run(String... strings) throws Exception {
        demo.oneToOneCascading1();
        demo.oneToOneCascading2();
        demo.oneToOneNocascading1();
        demo.oneToOneNoCascading2();
    }

    public static void main(String args[]) {
        SpringApplication.run(App.class);
    }
}
