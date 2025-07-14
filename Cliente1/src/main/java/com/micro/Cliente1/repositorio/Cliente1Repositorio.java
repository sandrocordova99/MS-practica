package com.micro.Cliente1.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.Cliente1.modelo.Cliente1;

@Repository
public interface Cliente1Repositorio extends JpaRepository<Cliente1,Long>{
    
}
