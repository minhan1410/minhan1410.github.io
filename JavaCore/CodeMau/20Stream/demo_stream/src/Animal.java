public class Animal {
    String name;
    int legs;
    String color;
    public Animal(String name, int legs, String color) {
        this.name = name;
        this.legs = legs;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + " - " + legs + " - " + color;
    }
    public Animal() {
    }

    
}
