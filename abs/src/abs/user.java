package abs;

public class user extends hello {

	
void ontext(String text) {
		
		System.out.println(text);
	}

	user(){
		textscanner ts=new textscanner(this);
		ts.scan();
	}
	public static void main(String[] args) {
	
		user s=new user();

	}

	
}
