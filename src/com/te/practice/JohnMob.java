package com.te.practice;

public class JohnMob {
String name;
String brand;
int price;

public JohnMob(String name, String brand, int price) {
	super();
	this.name = name;
	this.brand = brand;
	this.price = price;
	
	
	
}

@Override
public String toString() {
	return "JohnMob [name=" + name + ", brand=" + brand + ", price=" + price + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}


}
