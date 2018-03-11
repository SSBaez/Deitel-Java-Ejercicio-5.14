package com.ssbaez.ejercicio514;

public class InteresCompuesto {
	
	public static void main(String[] args) {
		
		System.out.println("Aplicacion que calcula el interes compuesto a 10 años a una tasa de interes del"
				+ " 5, 6, 7, 8, 9 y 10%");
		
		double vf;
		double vp = 1000;
		
		//VF = VP(1+i)^n
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.printf("%n%s%22s%20s%n", "Agno", "Monto en deposito", "Tasa de i");
			
			double interes = 1 + ((double) i / 100);
			
			for(int n = 1; n <= 10; n++) {
				
				vf = vp * Math.pow(interes, n);
				System.out.printf("%2d%,20.2f%20d%s%n", n, vf, i, "%");
				
			}
			
		}
		
	}

}
