import java.util.*;
public class PC {
 int memorija;
 String tipNaMemorija;
 int hardDisk;
 String golemina;
 public PC()
 {
	 memorija=2;
	 tipNaMemorija="DDR4";
	 hardDisk=160;
	 golemina="HDD";
 }
 public void getP(int zgolemiMemorija, int novSSDDisk)
 {
	 Scanner pc=new Scanner(System.in);
	 zgolemiMemorija=pc.nextInt();
	 novSSDDisk=pc.nextInt();
	 System.out.println("Memorijata bese"+ memorija + "GB" + "sega iznesuva "+ zgolemiMemorija );
	 System.out.println("Tipot na memorijata e "+tipNaMemorija);
	 System.out.println("Noviot diks e "+ novSSDDisk);
 }
	public static void main(String[] args) {
		PC novpc= new PC();
		novpc.getP();
	}

}
