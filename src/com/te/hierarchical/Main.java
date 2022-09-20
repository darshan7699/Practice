package com.te.hierarchical;

public class Main {
public static void main(String[] args) {
//	Doctor doctor=new Psychologist();
//	doctor.opd();
	Psychologist psychologist = new Psychologist();
	psychologist.patient("Manish");
	psychologist.opd();
	Surgen surgen = new Surgen();
	surgen.operation();
	surgen.opd();
}
}
