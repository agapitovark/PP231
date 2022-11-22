package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.Dao.UserDao;
import web.model.User;
import web.service.UserService;


@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping()
    public String index(Model model){
        model.addAttribute("user", userService.getAllUsers());
        return "user/index";
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        model.addAttribute("user", userService.getUserByID(id));
        return "user/show";
    }
    @GetMapping("/new")
    public String create(@ModelAttribute("user") User user){
        userService.saveUser(user.getName(), user.getLastName(), user.getAge());
        return "redirect:/user";
    }



}