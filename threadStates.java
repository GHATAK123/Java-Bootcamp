// A java thread is always in one of the several states which could be either running , slepping or dead etc.
//States
//1.New thread
//2.Runnable
//3.Not Runnable
//4.Dead
/* New Thread
1.A thread is in this state when the instantiation of a thread object creates a new thread but does not start it running.
2.A thread starts life in the Ready-to-run state.
3.We can call only the start() or stop() methods when the threads is in this state.
4.Calling any method beside start() or stop() causes IllegalStateException.*/
/*Runnable
1.When the start() method is invoked on a New Thread() it gets to the runnable state or running state by calling the run() method.
2.A runnable thread may actually be running, or may be awaiting its turn to run.*/
/*Not Runnable
A thread becomes Not Runnable due to four events:
1.When sleep() method is invoked and it sleeps for a specified amount of time.
2.When suspend() method is invoked.(Not used in the new version of java)
3.When the wait() method is invoked and the thread waits for notification of a free resource or waits for the completion of another thread or waits to acquire a lock of an object.
4.The thread is blocking on I/O and waits for its completion.
*/
/* Switching from not Runnable to Runnable State
1.If a thread has been put to sleep,then the specified number of milliseconds must elapse.
2.If a thread has been suspended,then its resume() method must be invoked.
3.If a thread is waiting on a condition variable,whatever object owns the variable must relinquish it by calling either notify() or notifyAll().
4.If a thread is blocked on I/O,then the I/O must complete.
*/
/*Dead State
A thread enters this state when the run() method has finished executing or when the stop() method is invoked.Once in this state,the thread cannot ever run again.
*/
