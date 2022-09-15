class A{
    void name()
    {
        System.out.println("NAME");
    }
}
class B extends A{
    void branch()
    {
        System.out.println("Branch");
    }
}
class C extends B{
    void stream()
    {
        System.out.println("Stream");
    }
}
class D extends B{
    void course()
    {
        System.out.println("Course");
    }
}
class Hybrid
{
    public static void main(String a[])
    {
        D d = new D();
        C c = new C();
        c.stream();
        c.branch();
        c.name();
        d.course();
        d.branch();
        d.name();
    }
}
