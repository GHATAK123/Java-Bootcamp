/** Finalize() Method
** finalize() method id a protected and non-static method of java.lang.object class.*/
   protected void finalize() throws Throwable
   {
   
   }
/* GCT before sweeping out an abandoned object ,it calls finalize() method of that object.*/
//finalize() methods are not chained like constructor.