package week1.day2;

public class Mobile {

	public void sendSms()
	{
		System.out.println("From Oppo");
	}
	
	public long makeCall(long phno) {
		return phno;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
		m.sendSms();
		System.out.println("Phone number is " + m.makeCall(919943932523l));				
	}

}
