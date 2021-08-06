/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gleywson.modelo.pa;

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
    private Date dataImagem;
    private Date dataLab;
    private String ExamesRX;
    private String ExamesTC;
    private String ExamesRM;
    private String ExamesLab;

    public PacienteKanban() {
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

    public Date getDataImagem() {
        return dataImagem;
    }

    public void setDataImagem(Date dataImagem) {
        this.dataImagem = dataImagem;
    }

    public Date getDataLab() {
        return dataLab;
    }

    public void setDataLab(Date dataLab) {
        this.dataLab = dataLab;
    }

    public String getExamesRM() {
        return ExamesRM;
    }

    public void setExamesRM(String examesRM) {
        ExamesRM = examesRM;
    }

    public String getExamesLab() {
        return ExamesLab;
    }

    public void setExamesLab(String examesLab) {
        ExamesLab = examesLab;
    }

    private Boolean isOk(String exames) {
        if(exames == null) {
            return false;
        } else {
            String[] fragment = exames.split("/");
            return fragment[0].equals(fragment[1]);
        }
    }

    public String getStatusRX() {
        if(isOk(getExamesRX())) {
            return "status-verde";
        } else {
            return "status-vermelho";
        }
    }

    public String getStatusTC() {
        if(isOk(getExamesTC())) {
            return "status-verde";
        } else {
            return "status-vermelho";
        }
    }

    public String getStatusRM() {
        if(isOk(getExamesRM())) {
            return "status-verde";
        } else {
            return "status-vermelho";
        }
    }

    public String getStatusLab() {
        if(isOk(getExamesLab())) {
            return "status-verde";
        } else {
            return "status-vermelho";
        }
    }
}
