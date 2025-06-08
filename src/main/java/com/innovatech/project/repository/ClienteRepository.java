package com.innovatech.project.repository;

import com.innovatech.project.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    List<Cliente> findByApellido(String apellido);

    Cliente findByCorreo(String correo);

    List<Cliente> findByNombreAndApellido(String nombre, String apellido);
    

}
