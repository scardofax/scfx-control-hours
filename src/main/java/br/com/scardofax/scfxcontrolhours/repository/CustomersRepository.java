package br.com.scardofax.scfxcontrolhours.repository;

import br.com.scardofax.scfxcontrolhours.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {

}
