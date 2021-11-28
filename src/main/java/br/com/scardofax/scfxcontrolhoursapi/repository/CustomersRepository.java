package br.com.scardofax.scfxcontrolhoursapi.repository;

import br.com.scardofax.scfxcontrolhoursapi.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {

}
