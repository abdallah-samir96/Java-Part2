package abstraction;

public interface ShapeInterface {

    void draw();
}

interface Color{
    void colored();
}

class Circle implements ShapeInterface, Color{

    @Override
    public void draw() {
        System.out.println("draw method from circle");
    }

    @Override
    public void colored() {

    }
}