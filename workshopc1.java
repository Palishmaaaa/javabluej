public class workshopc1
{
   
    int age; //instance variable
    static int qty; //static variable
    
    public static void mai(String[] args)
    {
     //calling instance variable in static method
     // systax: <classname> <variable> = new <classname> ();
      workshopc1 v1= new workshopc1();  
      System.out.println(v1.age);
      
      System.out.println(workshopc1.qty);
      
      int age=123; //local variable: must be initialized, confined inside a method where they are declared
      System.out.println(age);
    
 }
}