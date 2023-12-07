package ru.masliakov.pp_3_1_1.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.masliakov.pp_3_1_1.model.User;
import ru.masliakov.pp_3_1_1.service.UserService;


@Component
public class Util {
    private final UserService userService;

    @Autowired
    public Util(UserService userService) {
        this.userService = userService;
    }

    @Bean
    public void fillDataBase() {
        User user1 = new User("Petr", "Ivanov", "ivanov@mail.ru");
        User user2 = new User("Anna", "Sidorova", "sidorova@mail.ru");
        User user3 = new User("Semen", "Gorbunkov", "gorbunkov@mail.ru");
        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);
    }
}
