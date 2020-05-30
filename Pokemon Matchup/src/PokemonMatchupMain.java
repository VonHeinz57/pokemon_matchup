import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokemonMatchupMain {

	public static void main(String[] args) {

List<Pokemon> pokedex = new ArrayList<>();
		
		pokedex.add(new Pokemon(4, "Scorbunny", "fire", "Starter Pokemon"));
		pokedex.add(new Pokemon(5, "Raboot", "fire", "Starter Pokemon"));
		pokedex.add(new Pokemon(6, "Cinderace", "fire", "Starter Pokemon"));
		pokedex.add(new Pokemon(1, "Grookey", "grass", "Starter Pokemon"));
		pokedex.add(new Pokemon(2, "Thwackey", "grass", "Starter Pokemon"));
		pokedex.add(new Pokemon(3, "Rillaboom", "grass", "Starter Pokemon"));
		pokedex.add(new Pokemon(7, "Sobble", "water", "Starter Pokemon"));
		pokedex.add(new Pokemon(8, "Drizzle", "water", "Starter Pokemon"));
		pokedex.add(new Pokemon(9, "Inteleon", "water", "Starter Pokemon"));
		pokedex.add(new Pokemon(10, "Blipbug", "bug", "EVERYWHERE"));
		pokedex.add(new Pokemon(11, "Dotler", "bug", "psychic", "EVERYWHERE"));
		pokedex.add(new Pokemon(12, "Orbeetle", "bug", "psychic", "EVERYWHERE"));
	
		


		
		Scanner searchBar = new Scanner(System.in);
		System.out.println("Enter your opponent's Pokemon's name: ");
		
		String enemyPokemon = searchBar.next();
		
		for (int i = 0; i < pokedex.size(); i++) {
			
			if(pokedex.get(i).name.equals(enemyPokemon) && pokedex.get(i).type.equals("fire")) {
				
				System.out.println("Enemy Pokemon is a(n) " + pokedex.get(i).type + " type.");
				
				for(int j = 0; j < pokedex.size(); j++) {
					
					if(pokedex.get(j).type.equals("water")) {
						
						System.out.println(pokedex.get(j).name + " is 2x effective. It can be found at " + pokedex.get(j).location);
					}	
				}
			}
			
			if(pokedex.get(i).name.equals(enemyPokemon) && pokedex.get(i).type.equals("water")) {
				
				System.out.println("Enemy Pokemon is a(n) " + pokedex.get(i).type + " type.");
				
				for(int j = 0; j < pokedex.size(); j++) {
					
					if(pokedex.get(j).type.equals("grass")) {
						
						System.out.println(pokedex.get(j).name + " is 2x effective. It can be found at " + pokedex.get(j).location);
					}	
				}
			
			} if(pokedex.get(i).name.equals(enemyPokemon) && pokedex.get(i).type.equals("grass")) {
				
				System.out.println("Enemy Pokemon is a(n) " + pokedex.get(i).type + " type.");
				
				for(int j = 0; j < pokedex.size(); j++) {
					
					if(pokedex.get(j).type.equals("fire")) {
						
						System.out.println(pokedex.get(j).name + " is 2x effective. It can be found at " + pokedex.get(j).location);
					}	
				}
			}
			
		}
			
		
		searchBar.close();

		
		

	}
}


