/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gleywson.modelo.dao;

import com.gleywson.controller.factory.ConnectionFactory;
import com.gleywson.modelo.PacienteKanban;
import com.gleywson.modelo.nir.LeitoLimpeza;
import com.gleywson.modelo.nir.LeitoVago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gleywson
 */
public class PacienteKanbanDao {

    private Connection connection;

    public List<PacienteKanban> getPacientesUrgencia() {
        connection = ConnectionFactory.createConnectionToOracle();
        List<PacienteKanban> pacientes = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement("select * from kanban");
            rs = statement.executeQuery();

            while (rs.next()) {
                
                PacienteKanban paciente = new PacienteKanban();
                paciente.setNome(rs.getString("NM_PACIENTE"));
                paciente.setDataClassificacao(rs.getTimestamp("CLASSIFICACAO"));
                paciente.setCor(rs.getString("COR"));
                paciente.setCodigoAtendimento(rs.getLong("CD_ATENDIMENTO"));
                paciente.setDataAtendimento(rs.getTimestamp("HR_ATENDIMENTO"));
                paciente.setDataFau(rs.getTimestamp("FAU"));
                paciente.setEvoDas(rs.getTimestamp("DAS"));
                
                pacientes.add(paciente);
                        
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (statement != null) {

                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }

                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return pacientes;
    }

   
}
