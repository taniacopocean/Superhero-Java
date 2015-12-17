public class Superhero{
private String name; //Any Superhero can have a name
private int strength; //Any Superhero can have a strength

public Superhero(String n, int s){ //A constructor for a Superhero that has a name and a specified strength
    name=n;
    strength=s;
}
        
public Superhero(String n){ //A constructor for a Superhero that has only a name, the strength being automatically set to 10
    name=n;
    strength=10;
}
    
public void powerUp(int amount){ //Giving a Superhero a powerUp, which means their strength increases with the specified amount
strength+=amount;
}

public Superhero fight(Superhero s2){ //The fight method, which returns the Superhero with the higher strength, and the opponent in case these are equal
if(this.strength>s2.strength) return this;
else return s2;
}

public void print(){ //This method prints the name of the Superhero on the terminal
System.out.println(this.name);
}
}
