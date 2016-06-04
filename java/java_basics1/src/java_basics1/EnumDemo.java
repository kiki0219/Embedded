package java_basics1;
enum Action{
	TRUN_LEFT,
	TRUN_RIGHT,
	SHOOT
}
public class EnumDemo {
	public static void doAction(Action action){
		switch(action)
		{
			case TRUN_LEFT:System.out.println("TRUN_LEFT");break;
			case TRUN_RIGHT:System.out.println("TRUN_RIGHT");break;
			case SHOOT:System.out.println("SHOOT");break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		doAction(Action.TRUN_LEFT);
		doAction(Action.TRUN_RIGHT);
		doAction(Action.SHOOT);
	}
}
