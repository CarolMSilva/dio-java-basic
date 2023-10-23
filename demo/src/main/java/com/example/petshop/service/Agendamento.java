package com.example.petshop.service;

import org.springframework.stereotype.Service;

@Service
public class Agendamento {
    private Cliente cliente;
    private String dataAgendada;
    private String horaAgendada;
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getDataAgendada() {
        return dataAgendada;
    }
    public void setDataAgendada(String dataAgendada) {
        this.dataAgendada = dataAgendada;
    }
    public String getHoraAgendada() {
        return horaAgendada;
    }
    public void setHoraAgendada(String horaAgendada) {
        this.horaAgendada = horaAgendada;
    }

    
}
