package fcul.pco.teletasca.domain;
// DELETE
public class Tester {
	public static void main(String[] args) {
		/*
		// Test Dish
		Dish d1 = new Dish("Cozido", 5.95);
		Dish d2 = new Dish("Bolonhesa", 7.0);
		Dish d3 = Dish.fromString("3, Bacalhau à Brás, 5.95");
		
		System.out.println(d1.getId());
		System.out.println(d1.getName());
		
		System.out.println(d2.getId());
		System.out.println(d2.getName());
		
		System.out.println(d3.getId());
		System.out.println(d3.getName());
		 */
		
		// Test Client
		Client c1 = new Client("André", "andrefboliveira@gmail.com");
		Client c2 = new Client("Tânia", "tanmald@hotmail.com");
		Client c3 = new Client("Maria", "tanmald@hotmail.com");
		Client c4 = new Client("Joao", "andrefboliveira@gmail.com");
		Client c5 = Client.fromString("Carolina, carolina@gmail.com");
		
		System.out.println(c1.getEmail());
		System.out.println(c2.getEmail());
		System.out.println(c3.getEmail());
		System.out.println(c4.getEmail());
		System.out.println(c5.getEmail());
		
		
		
	}

}