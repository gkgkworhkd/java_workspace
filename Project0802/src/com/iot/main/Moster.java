package com.iot.main;
class Moster{
	public static void main(String[]args){
	String str="korea java";
	int c=str.lastIndexOf('a');
	int a=str.length();
	String b=str.replace("korea","ÄÚ¸®¾Æ");
	String e=str.substring(3,8);
	String f=str.toUpperCase();
	
	
	String pho="photo.jpg";
	String[] arr=pho.split("\\.");
	System.out.println(arr[0]);
	System.out.println(arr[1]);

	}
}