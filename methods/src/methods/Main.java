package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		
	}
	
	public static void sayiBulmaca() {
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
			mesajVer("Sayı vardır:"+ aranacak);
		}else {
			mesajVer("Sayı mevcut değildir:"+ aranacak);
		}
	}
	                   //camelCasing
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}

}
