
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String file = scanner.nextLine();
        ArrayList<Recipe> recipes = readRecipesFromFile(file);
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searched recipes by ingredient");
        System.out.println("");
        
        
        while(true){
            System.out.println("Enter command: ");
            String userCommand = scanner.nextLine();
            if(userCommand.equals("stop")){
                break;
            }else if(userCommand.equals("list")){
                listRecipes(recipes);
            }else if(userCommand.equals("find name")){
                System.out.println("Searched word: ");
                String searchedWord = scanner.nextLine();
                findRecipeByName(searchedWord, recipes);
            }else if(userCommand.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                findRecipeByTime(maxTime, recipes);
            }else if(userCommand.equals("find ingredient")){
                System.out.println("Ingredient:");
                String searchIngredient = scanner.nextLine();
                findRecipeByIngredient(searchIngredient, recipes);
            }else{
                continue;
            }
        }
    }
    
    public static void findRecipeByIngredient(String ingredient, ArrayList<Recipe> recipes){
        System.out.println("Recipes:");
        for(Recipe recipe : recipes){
            if(recipe.getIngredients().contains(ingredient)){
                System.out.println(recipe.toString());
            }
        }
    }
    
    public static void findRecipeByTime(int time, ArrayList<Recipe> recipes){
        System.out.println("Recipes:");
        for(Recipe recipe : recipes){
            if(recipe.getTime() <= time){
                System.out.println(recipe.toString());
            }
        }
    }
    
    public static void listRecipes(ArrayList<Recipe> recipes){
        System.out.println("Recipes:");
        for(Recipe recipe : recipes){
            System.out.println(recipe.toString());
        }
    }
    
    public static void findRecipeByName(String searchedWord, ArrayList<Recipe> recipes){
        for(Recipe recipe : recipes){
            if(recipe.getName().contains(searchedWord)){
                System.out.println(recipe.toString());
            }
        }
    }
    
    public static ArrayList<Recipe> readRecipesFromFile(String fileName){
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> recipeBreakdown = new ArrayList<>();
        String recipeName;
        int recipeTime;
        
        try(Scanner fileReader = new Scanner(Paths.get(fileName))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                if(!line.isEmpty()){
                    recipeBreakdown.add(line);
                }else{
                    recipeName = recipeBreakdown.get(0);
                    recipeTime = Integer.valueOf(recipeBreakdown.get(1));
                    recipeBreakdown.remove(0);
                    recipeBreakdown.remove(0);
                    recipes.add(new Recipe(recipeName, recipeTime, recipeBreakdown));
                    recipeBreakdown.clear();
                }
            }
            if(!recipeBreakdown.isEmpty()){
                recipeName = recipeBreakdown.get(0);
                recipeTime = Integer.valueOf(recipeBreakdown.get(1));
                recipeBreakdown.remove(0);
                recipeBreakdown.remove(0);
                recipes.add(new Recipe(recipeName, recipeTime, recipeBreakdown));
                recipeBreakdown.clear();
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return recipes;
    }
}
