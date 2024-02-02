package Java_Programs.Program05;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a triangle with base dimensions " + base + " and height dimensions " + height);
    }
    @Override
    public void erase(){
        System.out.println("Erasing a triangle with base dimensions " + base + " and height dimensions " + height);
    }
}
