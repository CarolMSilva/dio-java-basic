package com.example.petshop.service;

import org.springframework.stereotype.Service;

@Service
public class Pagamento {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
