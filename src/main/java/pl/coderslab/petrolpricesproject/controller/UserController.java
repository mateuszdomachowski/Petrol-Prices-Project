package pl.coderslab.petrolpricesproject.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.petrolpricesproject.entity.GasStation;
import pl.coderslab.petrolpricesproject.entity.User;
import pl.coderslab.petrolpricesproject.repository.GasStationsRepository;
import pl.coderslab.petrolpricesproject.repository.UserRepository;

import java.util.List;

@Controller
public class UserController {

    private final UserRepository userRepo;

    public UserController(UserRepository userRepo, GasStationsRepository gasStationsRepo) {
        this.userRepo = userRepo;
    }


    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }


    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "signup_form";
    }
    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);

        return "register_success";
    }

}
