package br.com.scardofax.scfxcontrolhours.repository;

import br.com.scardofax.scfxcontrolhours.model.AppointmentHours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentHoursRepository extends JpaRepository<AppointmentHours, Integer> {


}
