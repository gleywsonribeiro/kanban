/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gleywson.controller;

import com.gleywson.modelo.dao.LeitoDao;
import com.gleywson.modelo.nir.LeitoLimpeza;
import com.gleywson.modelo.nir.LeitoVago;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Gleywson
 */
@ManagedBean
@RequestScoped
public class LeitoController implements Serializable {

    private LeitoDao dao = new LeitoDao();
    private List<LeitoVago> leitosVagos = dao.getLeitosVagos(); 
    private List<LeitoLimpeza> leitosLimpeza = dao.getLeitosEmLimpeza();

    public List<LeitoVago> getLeitosVagos() {
        return leitosVagos;
    }

    public List<LeitoLimpeza> getLeitosLimpeza() {
        return leitosLimpeza;
    }

    
}
