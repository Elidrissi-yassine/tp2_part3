package ma.emsi.userrole;

import ma.emsi.userrole.entities.Role;
import ma.emsi.userrole.entities.User;
import ma.emsi.userrole.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.stream.Stream;

@SpringBootApplication
public class UserroleApplication implements CommandLineRunner {
    @Autowired
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(UserroleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("dev","arch","Admin").forEach(name->{
            Role role=new Role();
            role.setNom(name);
            role.setDesc("desc : "+name);
            userService.addNewRole(role);
        });

        User user=new User();
        userService.addNewUser(user);




    }
}
