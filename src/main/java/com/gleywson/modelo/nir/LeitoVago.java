/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gleywson.modelo.nir;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import javafx.util.converter.LocalDateTimeStringConverter;

/**
 *
 * @author Gleywson
 */
public class LeitoVago {

    private String unidade;
    private String leito;
    private Date liberacao;
    private Date horaAtual;
    private String tempo;

    public LeitoVago() {
    }

    public LeitoVago(String unidade, String leito, Date liberacao, Date horaAtual) {
        this.unidade = unidade;
        this.leito = leito;
        this.liberacao = liberacao;
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

    public Date getLiberacao() {
        return liberacao;
    }

    public void setLiberacao(Date liberacao) {
        this.liberacao = liberacao;
    }

    public Date getHoraAtual() {
        return horaAtual;
    }

    public void setHoraAtual(Date horaAtual) {
        this.horaAtual = horaAtual;
    }

    public String getTempo() {
        LocalDateTime inicio = liberacao.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime fim = horaAtual.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        Duration duration = Duration.between(inicio, fim);
        long dias = duration.toDays();
        Duration hours = duration.minus(dias, ChronoUnit.DAYS);
        long horas = hours.toHours();
        Duration minutes = hours.minus(horas, ChronoUnit.HOURS);
        long minutos = minutes.toMinutes();        
        return String.format("%d - %02d:%02d", dias, horas, minutos);
    }

}
