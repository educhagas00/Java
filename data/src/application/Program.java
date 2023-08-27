package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
	
	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //padrão customizado ;
	
		
		//agora -> data-hora ;
		
		LocalDate hoje = LocalDate.now();
		LocalDateTime agora = LocalDateTime.now(); // com segundos ;
		Instant d03 = Instant.now(); // horario global com padrao GMT ;
		
		//padrao ISO 8601 -> data-hora ;
		
		LocalDate d04 = LocalDate.parse("2022-03-16");
		
		LocalDateTime d05 = LocalDateTime.parse("2022-03-16T15:30:40");
		
		Instant d06 = Instant.parse("2023-06-16T01:30:40Z");
		
		Instant d07 = Instant.parse("2023-06-16T15:30:40-03:00");
		
		//formato customizado -> data-hora ;
		
		LocalDate d08 = LocalDate.parse("15/07/2023", fmt1);
		
		LocalDateTime d09 = LocalDateTime.parse("15/07/2003 01:30",  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		//horario separado > data-hora local 
		
		LocalDate d10 = LocalDate.of(2023, 7, 15);
		
	
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		
		System.out.println("----------------------------");
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault()); //timezone do pc
		
		System.out.println("d06 = " + fmt3.format(d06)); // quando for instant, deve formatar especificando o fuso
		
		System.out.println("----------------------------");
		
		Instant dia = Instant.parse("2023-07-15T13:30:10Z");
		
		LocalDateTime r1 = LocalDateTime.ofInstant(dia, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		
		System.out.println("----------------------------");
		
		System.out.println("dia de hoje: " + hoje.getDayOfMonth());
		System.out.println("estamos no mes: " + hoje.getMonthValue());
		System.out.println("estamos no ano: " + hoje.getYear());
		
		System.out.println("horas: " + agora.getHour());
		System.out.println("minutos: " + agora.getMinute());
		System.out.println("segundos: " + agora.getSecond());
		
		System.out.println("----------------------------");
		                                                             
	}

}
