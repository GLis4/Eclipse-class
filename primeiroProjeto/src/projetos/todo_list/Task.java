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

	int calculateTaskAge() {
		created.set(2021, 11, 01, 18, 00);
		Calendar today = Calendar.getInstance();

		//int year = today.get(Calendar.YEAR  ) - created.get(Calendar.YEAR);
		//int day = created.get(Calendar.DAY_OF_MONTH) -  today.get(Calendar.DAY_OF_MONTH);
		//int month = (today.get(Calendar.MONTH) + 1 )- created.get(Calendar.MONTH);
		int hour =  today.get(Calendar.HOUR ) - created.get(Calendar.HOUR);
		return hour ;
	}

}
