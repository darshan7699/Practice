package com.te.specifier;

public class max {
	public static void main(String[] args) {
		int x=10,y=20,z=30,a=1,b=3;
		int res=((x>y&&x>z&&x>a&&x>b)?x:(y>z&&z>a&&z>b)?y:(z>a&&z>b)?z:(a>b)?a:b);
		System.out.println(res);
	}

}
