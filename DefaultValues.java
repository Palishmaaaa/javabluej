public class DefaultValues
{
        byte b;
        int a;
        short d;
        long c;
        float e;
        double f;
        char h;
        String g;
    public static void main(String[] args)
    {
        DefaultValues DF= new DefaultValues();
        System.out.println(DF.b);
        System.out.println(DF.a);
        System.out.println(DF.d);
        System.out.println(DF.c);
        System.out.println(DF.e);
        System.out.println(DF.f);
        System.out.println(DF.h);
        System.out.println(DF.g);
        //this wouldnot work for local variables because java doesnot assign default values to local variables.
    }
}
