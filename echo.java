public class echo
{
    public static void main(String[] args)
    {
//        for(int i=0;i<args.length;i++)
//        {
//        System.out.println(args[i]);
//        }
        int s= 0;
        for(int i=0;i<args.length;i++)
        {
            s=s+Integer.parseInt(args[i]);
        }
            System.out.println(s);
        
        
        
    }
}