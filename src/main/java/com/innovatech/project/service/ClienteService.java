package com.innovatech.project.service;


import com.innovatech.project.model.Cliente;
import com.innovatech.project.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;
@Service
@Transactional

public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Cliente findbyId(long id){
        return clienteRepository.findById(id).get();
    }

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void delet(Long id){
        clienteRepository.deleteById(id);
    }
}
