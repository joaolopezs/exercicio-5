import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		
		double metros;
		double cm;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a medida em Metros: ");
		
		metros = sc.nextDouble();
		
        
		sc.close();
		
		cm = metros * 100;
		
		
		
		System.out.println("A medida em Cm é : " + cm);
		
		

	}

}
