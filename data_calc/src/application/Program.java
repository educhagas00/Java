package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-07-15");
		LocalDateTime d02 = LocalDateTime.parse("2023-07-15T01:30:20");
		Instant d03 = Instant.parse("2023-07-15T01:30:20Z");
		
		LocalDate pastWeek = d01.minusDays(7);
		LocalDate nextWeek = d01.plusDays(7);
		
		System.out.println("past week = " + pastWeek);
		System.out.println("next week = " + nextWeek);
	
		// mesma coisa para LocalDateTime
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		DateTimeFormatter instFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("pastWeekInstant = " + instFmt.format(pastWeekInstant));
		System.out.println("nextWeekInstant = " + instFmt.format(nextWeekInstant));
		
		System.out.println("------------------------");
		
		Duration d1 = Duration.between(pastWeekInstant, nextWeekInstant);
		
		System.out.println("dias entre semana passada e a proxima: " + d1.toDays());
		
		// para usar com LocalDate deve passar para LocalDateTime :
		
		Duration d2 = Duration.between(pastWeek.atStartOfDay(), d01.atStartOfDay());
		System.out.println("de semana passada ate hoje foram : " + d2.toDays() + " dias ");
		
	}
	
}
