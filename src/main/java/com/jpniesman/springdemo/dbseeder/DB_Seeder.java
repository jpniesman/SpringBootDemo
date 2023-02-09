package com.jpniesman.springdemo.dbseeder;

import com.jpniesman.springdemo.Models.User;
import com.jpniesman.springdemo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DB_Seeder implements CommandLineRunner {

    @Autowired
    private UserRepo userRepo;

    @Override
    public void run(String... args) throws Exception {
        seedDB();
    }

    private void seedDB(){
        User u1 = new User("John", "Niesman", 22, "08/29/2000");
        User u2 = new User("Zach", "Hogan", 22, "01/01/2000");
        User u3 = new User("Curt", "Fitz", 19, "01/01/2004");
        User u4 = new User("Sergio", "Ibarra", 22, "08/01/2000");
        userRepo.save(u1);
        userRepo.save(u2);
        userRepo.save(u3);
        userRepo.save(u4);
    }
}
