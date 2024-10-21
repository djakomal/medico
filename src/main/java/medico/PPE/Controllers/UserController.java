package medico.PPE.Controllers;

import jakarta.validation.Valid;
import medico.PPE.Models.LoginRequest;
import medico.PPE.Models.User;
import medico.PPE.Services.UserService;
import medico.PPE.dtos.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getAll() {
        return userService.getAll();

    }
    @PostMapping("/")
    public User add(@RequestBody User user){
        return  userService.add(user);
    }


    @PutMapping("/update/{Id}")
    public UserDto update(@PathVariable Long Id, @RequestBody UserDto user) throws Exception{
        UserDto updatedUser = userService.update(Id,user);
        return  userService.update(Id, updatedUser);
    }

     @DeleteMapping("/delete/{id}")
    public  void delete(@PathVariable Long id){
        userService.delete(id);
    }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable Long id){
        return  userService.getUserById(id);
    }

    @PostMapping("/login")
    public User login(@Valid @RequestBody User user)  {
        return userService.login(user);
    }
}
