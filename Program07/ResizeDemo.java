package Java_Record_Programs.Program07;

public class ResizeDemo{
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle(10,5);
        System.out.println("Original rectangle info : ");
        rectangle.displayInfo();
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(8);
        System.out.println("\nUpdated rectangle info : ");
        rectangle.displayInfo();
    }
}
