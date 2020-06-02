/*
In java we can specify the priority of each thread relative to other threads.
Those threads having higher priority get greater access to available resources then lower priority threads.
By default priority of any thread is set to 5.
We can even modify a thread's priority at any time after its creation using setPriority() method and retrieve the thread priority value using getPriority method.
Priority of child class is inherited from its parents class.
The following static final integer constants are defined in the Thread class:
1.MIN_PRIORITY(0) Lowest Priority
2.NORM_PRIORITY(5) Default Priority
3.MAX_PRIORITY(10) Highest Priority
*/