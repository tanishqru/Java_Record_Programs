package Java_Record_Programs.Program07;

interface Resizable{
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable{
    private int width;
    private int height;
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void resizeWidth(int width){
        this.width = width;
        System.out.println("Resized width to : " + width);
    }
    @Override
    public void resizeHeight(int height){
        this.height = height;
        System.out.println("Resized height to " + height);
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void displayInfo(){
        System.out.println("Rectangle : width = " + width + ", height = " + height);
    }
}
