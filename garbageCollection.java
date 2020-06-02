/* Garbage Collection
** In java destruction of object from memory is done automatically by the JVM.
** No delete keyword in Java.
** When there is no refrence to an object,then that object is assumed to be no longer needed and the memory occupied by the object are released.
** This technique is called Garbage Collection.
** This is accomplished by the JVM.
** The task of garbage collector thread is to sweep out abandoned objects(having no life refrence) from the heap memory.
** garbage collector thread before sweeping out an abandoned object,it calls finalize() method of that object.
** After finalize() method is executed,object is destroyed from the memory.
** We can call garbage collectral explicitly using System.gc or Runtiome.getRunTime().gc().
** But it is just a request to garbage collector not a command.
** It is up to garbage collector to honour this request.
** Advantages:Increases memory efficient and decreases the chances for memory leak.