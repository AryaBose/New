class Java1
{
    int a = 7;
    int b = 5;
}
class Single extends Java1
{
    public static void main (String a[])
    {
        Java1 j = new Java1();
        System.out.println("Addition = " + (j.a + j.b));
        System.out.println("Subtraction = " + (j.a - j.b));
    }
}
