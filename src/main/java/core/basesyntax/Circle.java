package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double areaCalculation() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + areaCalculation()
                + " sq.units," + " radius: " + radius + " units," + " color: " + getColor());
    }
}