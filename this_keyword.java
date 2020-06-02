// this reference cannot be used in static context.
// this reference can be used to represent caller object.
class Box
{
    private int l,b,h;
    public void setDimension(int l,int b,int h) //Instance member function
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public void showDimension()
    {
        System.out.println(l);
        System.out.println(b);
        System.out.println(h);
    }
//   public void sendBox()  Another function of this.
//   {
//       GiftTaker gf = new GiftTaker()
//           gf.acceptGift(this);
//   }
 
}

public class this_keyword
{
    public static void main(String[] args) //static member function
    {
        Box b1=new Box();
        b1.setDimension(12,10,5);
        b1.showDimension();
        
    }
}