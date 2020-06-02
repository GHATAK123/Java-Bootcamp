/* int a[][]=new int[4][5]; 2-D-Array Creation.
   int [][]a=new int[][];//error
   int [][]a=new int[][5];//error
   int [][]a=new int[4][]; //Correct 2-D-Array Creation.
   int [][]a=new int[][] {{3,4},{5,6},{7,8}}
   */
public class arra2{
    public static void main(String[] args)
    {
        int [][]a=new int[4][];
        a[0]=new int[5];
        a[1]=new int[3];
      //  System.out.println(a[0][0]);// Null type error.
        System.out.println(a[0]); // Output:null
        // System.out.println(a[2].length); //Null type error.
        System.out.println(a[1].length);//3
    } 
}
  