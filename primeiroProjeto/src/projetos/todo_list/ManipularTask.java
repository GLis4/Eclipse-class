package projetos.todo_list;



public class ManipularTask {



	public static void main(String[] args) {
		Task tsk = new Task();

		tsk.description = "Buy 5 eggs";
		tsk.done = false;
		tsk.priority = "low";	
		
		//System.out.println(tsk.calculateTaskAge()+ "\n" + tsk.description );
		System.out.println(Util.formatarTarefa(tsk));


	}
}
