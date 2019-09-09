package webpage.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class WebController implements WebMvcConfigurer {
    
    @GetMapping("/form")
    public String showForm(PersonForm personForm){
        return "form";
    }

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/form")
    public @ResponseBody String addUser(@RequestParam String name, @RequestParam int id){
        User u = new User();
        u.setName(name);
        u.setId(id);
        userRepository.save(u);
        return "Added";
    }
    
}