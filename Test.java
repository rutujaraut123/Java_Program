class Demo
{
    int a=10,b=20;
    void show ()
    {
        System.out.println(a+" "+b);
    }
}
class Test
{
    public static void main(String[]args)
    {
        Demo r=new Demo();
        r.show();
    }
}