package medico.PPE.Repositories;


import medico.PPE.Models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //List<Taxes> findByBillingId(Long id);
    User findByEmail(String email);


}
