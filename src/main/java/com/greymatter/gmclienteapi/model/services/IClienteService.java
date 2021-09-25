package com.greymatter.gmclienteapi.model.services;

import com.greymatter.gmclienteapi.model.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
}
