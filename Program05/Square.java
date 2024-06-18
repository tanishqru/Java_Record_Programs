package Java_Record_Programs.Program05;

public class Square extends Shape{
    private double side;
    public Square(String name, double side){
        super(name);
        this.side = side;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a square with side dimensions " + side);
    }
    @Override
    public void erase(){
        System.out.println("Erasing a square with side dimensions " + side);
    }
}
