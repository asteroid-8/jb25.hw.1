package by.epam.jb25.hometask;

import java.lang.Math;

public class Hometask1_4 {
	
	public static void main(String[] args) {
		double a, b, c = 0, s = 0;
		
		a = 3;
		b = 4;
		
		c = Math.sqrt(a * a + b * b);
		System.out.println("Гипотенуза равна " + c);
		
		s = (a * b)/2;
		System.out.print("Площадь равна " + s);
	}

}
