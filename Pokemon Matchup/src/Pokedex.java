import java.util.ArrayList;
import java.util.List;

public class Pokedex {

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
	
	}
	
}
