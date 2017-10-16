package test;

public class testRunable {

	public static void main(String[] args) {
		Thread th = new Thread(new MyRunnabel());
		th.start();
		for(int i=0;i<1000;i++){
			System.out.println("-------++----"+i);
		}
	}
}

class MyRunnabel implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("----------"+i);
		}
		
	}
	
}