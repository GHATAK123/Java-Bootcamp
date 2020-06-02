//unchecked Exception:Run-time exception like ArrayIndexOutOfBounds,NullPointerException.
    public class unexc
    {
        public static void main(String[] args)
        {
            try
            {
                // if any exception occurs in atry block then remaning statements of try block will not be executed.
                System.out.println(3/0);
                System.out.println("in try"); // this will not work bcz exception occurs just above this statement.
                
            }
            catch(ArithmeticException e)
                // if our catch block will run then program will not stop,if the by default catch block will run then program ends.
            {
                System.out.println("Exception: " + e.getMessage());
            }
            System.out.println("Hello");
            
        }
    }