package paricka.oop.marija;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        System.out.println("Kolku pati ke frlate paricka? ");
        int brojPati = keyboard.nextInt();
        
        brojac b = new brojac();
        
        for (int i = 0; i < brojPati; ++i) {
            if (Math.random() < 0.5) {
                System.out.println("Parickata padna na pismo");
                b.add("pismo");
            } 
            else {
                System.out.println("Parickata padna na glava");
                b.add("glava");
            }
        }
        
        System.out.println("Rezultatite se sledni: ");
        System.out.println(b.getResults());
        b.reset();
	}
}