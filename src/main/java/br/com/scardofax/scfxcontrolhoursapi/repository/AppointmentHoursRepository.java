package br.com.scardofax.scfxcontrolhoursapi.repository;

import br.com.scardofax.scfxcontrolhoursapi.model.AppointmentHours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentHoursRepository extends JpaRepository<AppointmentHours, Integer> {


}
