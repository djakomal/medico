package medico.PPE.Services;

import medico.PPE.Models.Appointment;
import medico.PPE.dtos.AppointmentDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AppService {
    List<Appointment> getAll();

    Appointment add(Appointment appointement);

   // AppointmentDto update(Long Id, AppointmentDto appointment) throws Exception;

    Appointment getAppById(Long id);
}
