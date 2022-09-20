package com.te_interface;

public class Owner{
public static void main(String[] args) {
	Phone phone = new Phone("black",12000,"vivo");
	System.out.println(phone.name);
	System.out.println(phone.price);
	System.out.println(phone.color);
	phone.text();
	phone.call();
	SmartPhone smartPhone = new SmartPhone("black",12000,"vivo",4,64);
	System.out.println(smartPhone.ram);
	System.out.println(smartPhone.cam);
	System.out.println(smartPhone.name);
	System.out.println(smartPhone.color);
	System.out.println(smartPhone.price);
	smartPhone.game("BGMI");

}
}
