package medico.PPE.Services;

import medico.PPE.Models.Appointment;
import medico.PPE.Repositories.AppointmentRepository;
import medico.PPE.dtos.AppointmentDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppServiceImp implements AppService {

    @Autowired
    private AppointmentRepository appointmentRepository;


    @Override
    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment add(Appointment appointement) {
        if(appointement==null){
            throw new IllegalArgumentException("appointement cannot be null");
        }
        try {

        Appointment appdtaxes = appointmentRepository.save(appointement);
        return appdtaxes;
        }catch(Exception e){
            System.err.println("Error while adding appointement: " + e.getMessage());
            // Rejeter une exception personnalisée ou une exception runtime
            throw new RuntimeException("Error while adding appointement", e);
        }

    }


   /* @Override
    public AppointmentDto update(Long Id, AppointmentDto appointment) throws Exception {


        //User UserExisting = UserRepository.findById(user.getId());
        Appointment appointmentExisting = appointmentRepository.findById(appointment.getId()).orElseThrow(()-> new Exception("appointment not found with id: " + appointment.getId()));
        //orElseThrow(()->new TaxesException(ExeceptionMessage.Taxe_UPDATE_FAILED_BY_ID ) );
        BeanUtils.copyProperties(appointment, appointmentExisting);

        Appointment updateAppointment= appointmentRepository.save(appointmentExisting);
        return updateAppointment;

    }
*/
/*    @Override
    public void delete(Long Id) {
        if (Id == null) {
            //throw new TaxesException("ID cannot be null");
        }
            Optional<User> optionalUser = UserRepository.findById();
        if (!optionalUser.isPresent()) {
            //throw new TaxesException("Taxes with ID " + taxeId + " not found");
        }
        userRepository.deleteById(Id);

    }*/

    @Override
    public Appointment getAppById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }
}
