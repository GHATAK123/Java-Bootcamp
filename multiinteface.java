// We can create refrence variable of an interface but not object
interface i1
{
    
}
interface i2
{
    
}
interface i3 extends i1,i2 // Multi-extension of interface.
{

}
interface i4
{
    
}
class A
{
    
}
class B extends A implements i3,i4 //Any class can implements more than one interface but extends only one class.
{

}