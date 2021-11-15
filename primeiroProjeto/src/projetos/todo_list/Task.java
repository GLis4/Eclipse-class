package projetos.todo_list;

import java.util.Calendar;

public class Task {

	int id;
	String description;

	private Calendar created = Calendar.getInstance();
	boolean status;
	String priority;

	Task() {
		id += 1;
		created = Calendar.getInstance(); 
	} 

	void calculateTaskAge() {
		
//		LocalTime userTime = LocalTime.parse("11:10");
//	    LocalTime currentTime = LocalTime.now();
//
//
//	    long diff = ChronoUnit.HOURS.between(currentTime, userTime);
//	    
	}

}
