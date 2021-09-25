package com.greymatter.gmclienteapi.model.dao;

import com.greymatter.gmclienteapi.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
