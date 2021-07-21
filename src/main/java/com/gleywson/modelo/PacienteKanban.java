/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gleywson.modelo;

import java.util.Date;

/**
 *
 * @author Gleywson
 */
public class PacienteKanban {
    private String nome;
    private Date dataClassificacao;
    private Date dataFau;
    private Date evoDas;
    private long codigoAtendimento;
    private String cor;
    private Date dataAtendimento;
    private String ExamesRX;
    private String ExamesTC;

    public PacienteKanban() {
    }

    public PacienteKanban(String nome, Date dataClassificacao, Date dataFau, Date evoDas, long codigoAtendimento, String cor, Date dataAtendimento) {
        this.nome = nome;
        this.dataClassificacao = dataClassificacao;
        this.dataFau = dataFau;
        this.evoDas = evoDas;
        this.codigoAtendimento = codigoAtendimento;
        this.cor = cor;
        this.dataAtendimento = dataAtendimento;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataClassificacao() {
        return dataClassificacao;
    }

    public void setDataClassificacao(Date dataClassificacao) {
        this.dataClassificacao = dataClassificacao;
    }

    public Date getDataFau() {
        return dataFau;
    }

    public void setDataFau(Date dataFau) {
        this.dataFau = dataFau;
    }

    public Date getEvoDas() {
        return evoDas;
    }

    public void setEvoDas(Date evoDas) {
        this.evoDas = evoDas;
    }

    public long getCodigoAtendimento() {
        return codigoAtendimento;
    }

    public void setCodigoAtendimento(long codigoAtendimento) {
        this.codigoAtendimento = codigoAtendimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String getExamesRX() {
        return ExamesRX;
    }

    public void setExamesRX(String examesRX) {
        ExamesRX = examesRX;
    }

    public String getExamesTC() {
        return ExamesTC;
    }

    public void setExamesTC(String examesTC) {
        ExamesTC = examesTC;
    }
}
