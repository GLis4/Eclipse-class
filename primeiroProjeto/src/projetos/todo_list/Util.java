package projetos.todo_list;

public class Util {

	
	public static String formatarTarefa(Task trf) {
		String formT;
		formT = " 1# Task. \n Description: " +  trf.description +
				"\n Priority: "+ trf.priority +
				"\n Task created in: " + trf.calculateTaskAge() +
				"\n Its done? " + trf.done; 
		return formT;
	}
}
