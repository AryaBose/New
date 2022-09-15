class Multi {
    String name = "Arya";
}
class Multi1 extends Multi {
    String college = "TIB";
}
class Multi2 extends Multi1 {
    String c = "CSE";
    void details()
    {
        System.out.println("Name : " + name);
        System.out.println("College : " + college);
        System.out.println("Name : " + c);
    }
}
class Arya extends Multi2{
    public static void main(String a[])
    {
        Multi2 m = new Multi2();
        m.details();
    }
}