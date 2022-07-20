/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Util;

/**
 *
 * @author gr001290
 */
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Util {
   public LocalDate RetornaDataTerminoContrato(LocalDate dataInicio, Integer meses) throws ParseException {
      Date d = Date.from(dataInicio.atStartOfDay(ZoneId.systemDefault()).toInstant());
      Calendar cal = Calendar.getInstance();
      cal.setTime(d);
      cal.add(2, meses);
      LocalDate localDate = LocalDateTime.ofInstant(cal.toInstant(), cal.getTimeZone().toZoneId()).toLocalDate();
      return localDate;
   }
}
