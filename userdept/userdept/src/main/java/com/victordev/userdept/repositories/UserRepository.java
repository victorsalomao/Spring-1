package com.victordev.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victordev.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}

//Implementação de operações básicas do banco de dados
//Deletar
//Salvar
//Inserir tudo através dos imports do Spring Boot
