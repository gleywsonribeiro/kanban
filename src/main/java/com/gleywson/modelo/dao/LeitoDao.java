/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gleywson.modelo.dao;

import com.gleywson.controller.factory.ConnectionFactory;
import com.gleywson.modelo.Pedido;
import com.gleywson.modelo.nir.LeitoLimpeza;
import com.gleywson.modelo.nir.LeitoVago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gleywson
 */
public class LeitoDao {

    private Connection connection;

    public List<LeitoVago> getLeitosVagos() {
        connection = ConnectionFactory.createConnectionToOracle();
        List<LeitoVago> leitos = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement("SELECT * FROM LEITOS_VAGOS");
            rs = statement.executeQuery();

            while (rs.next()) {
                
                LeitoVago leito = new LeitoVago();
                leito.setUnidade(rs.getString(1));
                leito.setLeito(rs.getString(2));
                leito.setLiberacao(rs.getTimestamp(3));
                leito.setHoraAtual(rs.getTimestamp(4));
                
                leitos.add(leito);
                        
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

        return leitos;
    }

    public List<LeitoLimpeza> getLeitosEmLimpeza() {
        return null;
    }
}
