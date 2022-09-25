package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delongi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("gsgs.jpg");

		Product product2 = new Product();
		product2.setName("Arcelik kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("gsgs.jpg");

		Product product3 = new Product();
		product3.setName("Simbo kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("gsgs.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");

		}
		System.out.println("</ul>");

		
		IndividualCustomer IndividualCustomer = new IndividualCustomer();
		IndividualCustomer.setId(1);
		IndividualCustomer.setPhone("5555");
		IndividualCustomer.setCustomerNumber("125");
		IndividualCustomer.setFirstName("Enes");
		IndividualCustomer.setLastName("Basturk");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhone("5555");
		corporateCustomer.setTaxNumber("4584");
		corporateCustomer.setCustomerNumber("7894");
		
		Customer[] customers = {IndividualCustomer,corporateCustomer};
		
	}

}
