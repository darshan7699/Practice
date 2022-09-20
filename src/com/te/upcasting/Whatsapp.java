package com.te.upcasting;

public class Whatsapp {
	public static void main(String[] args) {
User user =new User();
user.name="Pushpa";
user.phoneNumber=5154454;
user.text();
user.call();
User user1 = new Admin();
user1.call();
user1.phoneNumber=534154;  
user1.text();
Admin res =(Admin)user1;
res.addUser("darshan");
res.removeUser("amit");
	}
}
