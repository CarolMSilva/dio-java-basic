package com.example.petshop.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.example.petshop.service.Agendamento;

@Component
public class AgendaManager {
    private List<Agendamento> agendamentos = new ArrayList<>();
    private static AgendaManager instance;

    public static void setInstance(AgendaManager instance) {
        AgendaManager.instance = instance;
    }

    private AgendaManager() {
    }

    public static AgendaManager getInstance() {
        if (instance == null) {
            instance = new AgendaManager();
        }
        return instance;
    }

    public void adicionarAgendamento(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }

    public Agendamento buscarAgendamento(String clienteNome) {
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getCliente().getNome().equalsIgnoreCase(clienteNome)) {
                return agendamento;
            }
        }
        return null; // Agendamento não encontrado
    }

    public void removerAgendamento(String clienteNome) {
        Agendamento agendamentoParaRemover = null;
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getCliente().getNome().equalsIgnoreCase(clienteNome)) {
                agendamentoParaRemover = agendamento;
                break;
            }
        }
        if (agendamentoParaRemover != null) {
            agendamentos.remove(agendamentoParaRemover);
        }
    }
}
