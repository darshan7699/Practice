package com.te.customexception;

public class User {
private String name;
private long bal;
private long accountno;

public User(String name, long bal, long accountno) {
	super();
	this.name = name;
	this.bal = bal;
	this.accountno = accountno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getBal() {
	return bal;
}
public void setBal(long bal) {
	this.bal = bal;
}
public long getAccountno() {
	return accountno;
}
public void setAccountno(long accountno) {
	this.accountno = accountno;
}


}
