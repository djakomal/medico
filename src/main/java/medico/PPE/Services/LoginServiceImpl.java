package medico.PPE.Services;

import jakarta.transaction.Transactional;
import medico.PPE.Models.LoginRequest;
import medico.PPE.Models.User;
import medico.PPE.Repositories.LoginRequestRepository;
import medico.PPE.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LoginServiceImpl implements LoginRequestService {

    @Autowired
    private LoginRequestRepository loginRequestRepository;
    @Autowired
    private UserRepository userRepository;


    @Override
    @Transactional
    public LoginRequest add(LoginRequest loginRequest) {

        if(loginRequest==null){
            throw new IllegalArgumentException("User cannot be null");
        }
        try {
            //User user = userdtomapper.mapToUser(userDto);
            LoginRequest savedloginRequest = loginRequestRepository.save(loginRequest);
            //UserDto savedUserDto = Userdtomapper.userdtomapper.mapToUserDto(savedUser);
            return savedloginRequest;
        }catch(Exception e){
            System.err.println("Error while adding user: " + e.getMessage());
            // Rejeter une exception personnalisée ou une exception runtime
            throw new RuntimeException("Error while adding user", e);
        }
    }


}
