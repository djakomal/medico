package medico.PPE.Services;

import medico.PPE.Models.LoginRequest;
import medico.PPE.Models.User;
import medico.PPE.dtos.UserDto;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User add(User user);

    User update(Long Id, User user) throws Exception;

    //void delete(Long userId);

    //Optional<User> findByEmail(String Email);

    void delete(Long Id);

    User getUserById(Long id);

    User login(User loginRequest);


    // UserDetails loadUserByEmail(String username) throws UsernameNotFoundException;

    //User login(User loginRequest);


}
