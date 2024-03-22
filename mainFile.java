import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class mainFile {
    public static void main(String[] args) {
        // Read ingredients from text file
        Ingredients in = new Ingredients();
        try {
            File ingredientFile = new File("ingredients.txt");
            if (!ingredientFile.exists()) {
                ingredientFile.createNewFile();  
            } 

            // TODO
            // Create ingredients objects
            in.createIngredients(ingredientFile);

        } catch (Exception e) {
            System.out.println("An error has occured while trying to make a file.");
            e.printStackTrace();
        }

        
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        while (option != "5") {
            System.out.println(
                "Menu\n" +
                "1: Check ingredients\n" +
                "2: Add ingredients\n" + 
                "3: Remove ingredients\n" + 
                "4: Get random dish\n"+
                "5: Exit\n"
            );
            
            switch (scanner.nextLine()) {
                case "1":
                    in.checkIngredients();
                    break;
            
                default:
                    System.out.println("Incorect value! Please try again.");;
            }
            
        }
        scanner.close();
    }
}
