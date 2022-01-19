package projetos.todo_list;


import java.util.Calendar;

public class Task {

	private	int id;
	Calendar created;
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

		data[0] = created.get(Calendar.YEAR) - now.get(Calendar.YEAR);
		data[1] = created.get(Calendar.MONTH)- now.get(Calendar.MONTH);
		data[2] = created.get(Calendar.DAY_OF_MONTH) - now.get(Calendar.DAY_OF_MONTH);
		data[3] = created.get(Calendar.HOUR_OF_DAY) - now.get(Calendar.HOUR_OF_DAY)  ;
		data[4] = created.get(Calendar.MINUTE) - now.get(Calendar.MINUTE);

		String diff = "";

		for(int i = 0; i < data.length ; i++) {
			if(data[i] != 0) diff += Math.abs(data[i]) + " " + tipo[i] + " ";
		}
		if(diff.isEmpty()) return "just created";
		else return diff;
	}
}
