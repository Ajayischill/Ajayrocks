package handling_exceptions5;

public class App {

	public static void main(String[] args){
		
		Zapper myZapper = new Zapper();
		
		try {
			myZapper.startZap(4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
