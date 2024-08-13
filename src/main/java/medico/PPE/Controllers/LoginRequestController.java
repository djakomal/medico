package medico.PPE.Controllers;

import jakarta.validation.Valid;
import medico.PPE.Models.LoginRequest;
import medico.PPE.Models.User;
import medico.PPE.Services.LoginRequestService;
import medico.PPE.Services.UserService;
import medico.PPE.dtos.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/LoginRequest")
public class LoginRequestController {

    @Autowired
    private LoginRequestService loginRequestService;


    @PostMapping("/")
    public LoginRequest add(@Valid @RequestBody LoginRequest loginRequest){

        return  loginRequestService.add(loginRequest);
    }





/*    @DeleteMapping("/delete/{taxeId}")
    public  void delete(@PathVariable Long taxeId){
        taxesService.delete(taxeId);
    }*/


}
