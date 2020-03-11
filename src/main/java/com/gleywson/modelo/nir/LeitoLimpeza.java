/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gleywson.modelo.nir;

import java.util.Date;

/**
 *
 * @author Gleywson
 */
public class LeitoLimpeza {
    private String unidade;
    private String leito;
    private int solicitacaoLimpeza;
    private Date horaSolicitacao;
    private Date horaAtual;

    public LeitoLimpeza() {
    }

    public LeitoLimpeza(String unidade, String leito, int solicitacaoLimpeza, Date horaSolicitacao, Date horaAtual) {
        this.unidade = unidade;
        this.leito = leito;
        this.solicitacaoLimpeza = solicitacaoLimpeza;
        this.horaSolicitacao = horaSolicitacao;
        this.horaAtual = horaAtual;
    }
    
    

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getLeito() {
        return leito;
    }

    public void setLeito(String leito) {
        this.leito = leito;
    }

    public int getSolicitacaoLimpeza() {
        return solicitacaoLimpeza;
    }

    public void setSolicitacaoLimpeza(int solicitacaoLimpeza) {
        this.solicitacaoLimpeza = solicitacaoLimpeza;
    }

    public Date getHoraSolicitacao() {
        return horaSolicitacao;
    }

    public void setHoraSolicitacao(Date horaSolicitacao) {
        this.horaSolicitacao = horaSolicitacao;
    }

    public Date getHoraAtual() {
        return horaAtual;
    }

    public void setHoraAtual(Date horaAtual) {
        this.horaAtual = horaAtual;
    }
    
    
}
