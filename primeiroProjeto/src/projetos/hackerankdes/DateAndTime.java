package projetos.hackerankdes;

import java.time.LocalDate;

public class DateAndTime {
	public static void main(String[] args) {
	
		int mm = 10;
		int dd = 11; 
		int yy = 2008 ; 
		LocalDate dt = LocalDate.of(yy, mm, dd);
		System.out.print(dt.getDayOfWeek().toString());
	}
}
