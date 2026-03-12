package Day12_Abstraction;

import java.util.Scanner;

public class PrinterDriver1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for HP");
		System.out.println("Press 2 for Samsung");
		int n=sc.nextInt();
		Printer p;
		switch(n)
		{
		case 1:p=new HP();
		if(p instanceof HP) {
			HP h=(HP)p;
			h.PrinterSoftware();}
		break;
		case 2:p=new Samsung();
		if(p instanceof Samsung) {
			Samsung s=(Samsung)p;
			s.PrinterSoftware();}
		}
		
		
		
		
	}

}
