class Animals {
    void walk()
    {
        System.out.println("Animals can Walk");
    }    
}
class Birds extends Animals {
    void fly()
    {
        System.out.println("Birds can Fly");
    }    
}
class Mammals extends Animals {
    void run()
    {
        System.out.println("Mammals can Run");
    }    
}
class Book
{
    public static void main(String a[])
    {
        Mammals m = new Mammals();
        Birds b = new Birds();
        m.run();
        m.walk();
        b.fly();
        b.walk();
    }
}
