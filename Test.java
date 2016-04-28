

public class Test
{
    
    public class A
    {
        public void show()
        {
            System.out.print("A");
        }
    }
    
    public class B extends A
    {
        public void show()
        {
            System.out.print("B");
        }
    }
    
    public void foo()
    {
        A obj = new B();
        obj.show();
    }
}