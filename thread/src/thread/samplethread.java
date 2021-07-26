package thread;

public class samplethread extends Thread{

public void run() {
	//super.run();
	
int i;

		for(i=0;i<=9;i++) {
			System.out.println("Thread count"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
              }             
	
	
           }
}
