package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,8,9,5,6};
		int aranacak = 7;
			boolean varMi = false;
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Sayı vardır.");
		}else {
			System.out.println("Sayı yoktur");
		}
		
	}

}
