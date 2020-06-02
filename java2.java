class Box
{
    private int length,breadth,height; // Instance member variable
    public void setDimension(int l,int b,int h) // Instance member method
    {
        length=l;
        breadth=b;
        height=h;   
    }
    public void showDimension()  // Instance member method
    {
        System.out.println("L - "+ length);
        System.out.println("B - "+ breadth);
        System.out.println("H - "+ height);
        System.out.println("Volume - " + length*breadth*height);
    }
}

public class java2
{
    public static void main(String[] args)
    {
    Box smallBox = new Box(); // Reference Variable or object.
    smallBox.setDimension(12,10,5);
    smallBox.showDimension();
        smallBox=new Box();
        smallBox.showDimension();
    }
}