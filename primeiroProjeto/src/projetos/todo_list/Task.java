package projetos.todo_list;


import java.util.Calendar;

public class Task {

	private	int id;
	private Calendar created = Calendar.getInstance();
	String description;
	boolean done;
	String priority;

	Task() {
		id += 1;
		created = Calendar.getInstance(); 
	} 

	String calculateTaskAge() {

		Calendar now = Calendar.getInstance();

		int data[] = new int[5];
		String tipo[] = {"year" , "month", "day", "hour(s)", "min"};

		data[0] = now.get(Calendar.YEAR) - created.get(Calendar.YEAR);
		data[1] = now.get(Calendar.MONTH) - created.get(Calendar.MONTH);
		data[2] = now.get(Calendar.DAY_OF_MONTH) - created.get(Calendar.DAY_OF_MONTH);
		data[3] = now.get(Calendar.HOUR_OF_DAY) - created.get(Calendar.HOUR_OF_DAY);
		data[4] = now.get(Calendar.MINUTE) - created.get(Calendar.MINUTE);

		String diff = "";

		for(int i = 0; i< data.length ; i++) {
			if(data[i] > 0 ) {
				diff = data[i] + " " + tipo[i];
			}
		}
		if(diff.isEmpty()) return "just created";
		else return diff;
	}
}
