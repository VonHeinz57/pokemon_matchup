
public class Pokemon {

	public int number;
	public String name;
	public String type;
	public String location;
	public String typeTwo;
	

	public Pokemon(int number, String name, String type, String location) {
		this.number = number;
		this.name = name;
		this.type = type;
		this.location = location;
	}
	
	public Pokemon(int number, String name, String type, String typeTwo, String location) {
		this.number = number;
		this.name = name;
		this.type = type;
		this.typeTwo = typeTwo;
		this.location = location;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
