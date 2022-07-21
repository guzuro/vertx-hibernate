import models.Ticket;
import models.User;
import services.UserService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("Masha", "Egorova");
        userService.saveUser(user);
        Ticket ticket = new Ticket("new task", "description", LocalDateTime.now());
        ticket.setUser(user);
        user.addTicket(ticket);
        userService.updateUser(user);
    }
}
