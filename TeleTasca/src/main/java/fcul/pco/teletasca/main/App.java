package fcul.pco.teletasca.main;

import fcul.pco.teletasca.domain.Client;
import fcul.pco.teletasca.domain.ClientCatalog;
import fcul.pco.teletasca.domain.Dish;

import java.io.IOException;

import fcul.pco.teletasca.domain.DishCatalog;
import fcul.pco.teletasca.domain.OrderCatalog;
import java.io.File;
import java.util.Locale;
import java.util.Scanner;

/**
 * This is the application main class.
 * It holds an instance of each of the catalogs and an instance of Client that 
 * corresponds to the current user (client).
 * 
 * @author Thibault Langlois 
 * Alunos: 
 * @author André Oliveira 45648 
 * @author Tânia Maldonado 44745
 */
public class App {

    public static DishCatalog dishCatalog;
    public static ClientCatalog clientCatalog;
    public static OrderCatalog orderCatalog;
    public static Client currentClient = null;
    
    
    private static void initialize() {
        dishCatalog = new DishCatalog();
        clientCatalog = new ClientCatalog();
        orderCatalog = new OrderCatalog();
    }
 
    /**
     * This method may be called to use the application in default mode i.e. 
     * interacting with the keyboard.
     * 
     * @throws IOException 
     */
    private static void interactiveMode() throws IOException {
        try (Scanner in = new Scanner(System.in)) {
            in.useLocale(Locale.US);
            Menu.mainMenu(in);
        }
    }
    
    /**
     * This method allows the application to work in non interactive mode i.e. 
     * the input is read from a file. It should be used for testing. A file, 
     * called a use-case contains a sequence of inputs that allows testing some 
     * functionalities of the application. A use-case file may contain comments 
     * (useful to make it easy to understand). Comments begin with the # 
     * character and extend until the end of the line. Here is an example of 
     * use-case file:
     * --------
     * # Caso de uso 1: o gerente adiciona um prato.
     * # user = gerente
     * 2
     * 1 # adicionar um prato
     * bacalhau à braz # descrição do prato
     * 5.99 # preço
     * 5 # terminar
     * 3 # terminar
     * -------
     * 
     * 
     * @param useCaseFileName A String that represents the name of a file that 
     * contains a use-case.
     * @throws IOException
     * @requires the contents of the file must be correct with respect of the 
     * menus (see class Menu) and the input data expected by the application, 
     * unless the objective of the test is to verify an illegal situation.
     */
    private static void executeUseCase(String useCaseFileName) throws IOException {
        System.out.println("Test: " + useCaseFileName);
        Scanner in = new Scanner(new File(useCaseFileName));
        in.useLocale(Locale.US);
        in.nextLine();
        Menu.mainMenu(in);
        in.close();
    }
    
    /**
     * 
     * @throws IOException
     */
    public static void executeAllUseCases() throws IOException {
        executeUseCase("data/usecase1.dat");
        executeUseCase("data/usecase2.dat");
        executeUseCase("data/usecase3.dat");
        executeUseCase("data/usecase4.dat");
        executeUseCase("data/usecase5.dat");
    }
    
    public static void main(String [] args) throws IOException {
		// Test Dish
		Dish d1 = new Dish("Cozido", 5.95);
		Dish d2 = new Dish("Bolonhesa", 7.0);	
		DishCatalog cat = new DishCatalog();
		cat.addDish(d1);
		cat.addDish(d2);
    	
    	initialize();
        // dishCatalog.load();
        // clientCatalog.load();
        // orderCatalog.load();
        // interactiveMode();
//        executeAllUseCases();
        interactiveMode();
    }
    
}