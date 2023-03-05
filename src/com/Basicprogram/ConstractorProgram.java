package com.Basicprogram;
public class ConstractorProgram {
	double height;
	double width;
	double depth;
	ConstractorProgram(){
		System.out.println("Without arguments");
		height=10;
		width=10;
		depth=10;
		
	}
	ConstractorProgram(int a,int b,int c){
		height=a;
		width=b;
		depth=c;
		System.out.println("With arguments");
		
	}
	double volume() {
		return height*width*depth;
		
		
	}
	
	public static void main(String[]args) {
		
		ConstractorProgram obj=new ConstractorProgram();
		double vol=obj.volume();
		System.out.println("volume is :"+vol);
		ConstractorProgram obj1=new ConstractorProgram(7,5,2);
		double vol1=obj1.volume();
		System.out.println("volume is :"+vol1);
}
}
