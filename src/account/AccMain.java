package account;

public class AccMain {

	public static void main(String[] args) {
		
		
		Account[] acc=new Account[5];
		
		for(int i=0;i<2;i++)
		{
			acc[i]=new Account();
			acc[i].accept();
			acc[i].withdraw();
		}
		
		for(int i=0;i<2;i++)
		{
			acc[i].display();
		}

	}

}
