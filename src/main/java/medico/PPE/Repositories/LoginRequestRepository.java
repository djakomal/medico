package medico.PPE.Repositories;


import medico.PPE.Models.LoginRequest;
import medico.PPE.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface LoginRequestRepository extends JpaRepository<LoginRequest, Long> {
    //List<Taxes> findByBillingId(Long id);

}
