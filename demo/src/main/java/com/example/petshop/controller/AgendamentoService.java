package com.example.petshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petshop.component.AgendaManager;
import com.example.petshop.service.Agendamento;
import com.example.petshop.service.Cliente;

@RestController
@RequestMapping("AgendaManager")

public class AgendamentoService {
    private final AgendaManager agendaManager;


    public AgendamentoService(AgendaManager agendaManager) {
        this.agendaManager = agendaManager;
    }

    public void agendar(Cliente cliente, String dataAgendada, String horaAgendada) {
        Agendamento agendamento = new Agendamento();
        agendamento.setCliente(cliente);
        agendamento.setDataAgendada(dataAgendada);
        agendamento.setHoraAgendada(horaAgendada);

        agendaManager.adicionarAgendamento(agendamento);
    }

    public Agendamento buscarAgendamentoPorCliente(String nomeCliente) {
        return agendaManager.buscarAgendamento(nomeCliente);
    }

    public void cancelarAgendamento(String nomeCliente) {
        agendaManager.removerAgendamento(nomeCliente);
    }
}
