package abstraction;

public abstract class Shape {

    protected String color;
    public abstract void draw();

    public void setColor(String color) {
        this.color = color;
    }

    public void printColor(){
        System.out.println("Color: " + this.color);
    }

}
