import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ingredients {

    private ArrayList<String> ingredientsList = new ArrayList<String>();

    private void addIngredients(String ing) {
        this.ingredientsList.add(ing);
    }

    private void removeIngredients(String ing) {
        this.ingredientsList.remove(ing);
    }

    public void checkIngredients() {
        for (String string : ingredientsList) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Error trying to print out ingredients.");
                e.printStackTrace();
            }
            System.out.println(string);
        }
    }

    public void createIngredients(File ingredientFile) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(ingredientFile));

        String line = bf.readLine();

        while(line != null) {
            addIngredients(line);
            line = bf.readLine();
        }

        bf.close();

    }

}
