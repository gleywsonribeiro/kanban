/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gleywson.modelo.dao;


import com.gleywson.controller.factory.ConnectionFactory;
import com.gleywson.modelo.Pedido;
import com.gleywson.modelo.TipoExame;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gleywson
 */
public class PedidoDao implements Serializable {

    public List<Pedido> getPedidosMedicina() {
        return getPedidos(TipoExame.MEDICINA);
    }

    public List<Pedido> getPedidosSepse() {
        return getPedidos(TipoExame.SEPSE);
    }
    
    public List<Pedido> getPedidosUrgentes() {
        return getPedidos(TipoExame.URGENTE);
    }
    
    public List<Pedido> getPedidosPendentes() {
        return getPedidos(TipoExame.PENDENTE);
    }
    
    public List<Pedido> getPedidosSolicitados() {
        return getPedidos(TipoExame.SOLICITADO);
    }

    private List<Pedido> getPedidos(TipoExame tipoExame) {
        Connection connection = null;
        List<Pedido> lista = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            connection = ConnectionFactory.createConnectionToOracle();
            statement = connection.prepareStatement("SELECT * FROM " + tipoExame.getDescricao());
            rs = statement.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setCodigo(rs.getInt("pedido"));
                pedido.setSetor(rs.getString("setor"));
                pedido.setDataPedido(rs.getTimestamp("dh_pedido"));

                lista.add(pedido);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(PedidoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
}
