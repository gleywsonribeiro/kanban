/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gleywson.util;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author Gleywson
 */
public class CalcDate {
    public static String tempoEntredatas(Date dataInicial, Date dataFinal) {
        LocalDateTime inicio = dataInicial.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime fim = dataFinal.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        Duration duration = Duration.between(inicio, fim);
        long dias = duration.toDays();
        Duration hours = duration.minus(dias, ChronoUnit.DAYS);
        long horas = hours.toHours();
        Duration minutes = hours.minus(horas, ChronoUnit.HOURS);
        long minutos = minutes.toMinutes();   
        String saida;
        if(dias > 0) {
            saida = String.format("%d - %02d:%02d", dias, horas, minutos);
        } else {
            saida = String.format("%02d:%02d", horas, minutos);
        }
        return saida;
    }
    
    public static long getTempo(Date dataInicial, Date dataFinal) {
        LocalDateTime inicio = dataInicial.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime fim = dataFinal.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        Duration duration = Duration.between(inicio, fim);

        return duration.toMinutes();
    }
}
