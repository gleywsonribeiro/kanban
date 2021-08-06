package com.gleywson.modelo.pa;

import com.gleywson.modelo.dao.PacienteKanbanDao;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<PacienteKanban> pacientes = new PacienteKanbanDao().getPacientesUrgencia();
        pacientes.forEach(p -> {

        });
    }
}
