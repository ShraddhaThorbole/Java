public class Method_Overloading 
{
    public String name;
    public int players;
    public String type;

    public Method_Overloading(String name, int players) 
    {
        this.name = name;
        this.players = players;
    }

     // Method to display sports details
     void disp() 
     {
         System.out.println("Name of sport: " + name);
         System.out.println("Number of players: " + players);
     }
  
     // Method overloading - passing multiple arguments
     void disp(String sName, int sPlayers) 
     {
         System.out.println("Name of sport: " + sName);
         System.out.println("Number of players: " + sPlayers);
     }

     void disp(String sName, int sPlayers, String sType) 
     {
         System.out.println("Name of sport: " + sName);
         System.out.println("Number of players: " + sPlayers);
         System.out.println("Sport Type: " + sType);
     }
     
     public static void main(String[] args) 
     {
        Method_Overloading[] mo = new Method_Overloading[3];
        mo[0] = new Method_Overloading("Cricket", 11);
        mo[1] = new Method_Overloading("Football", 11);
        mo[2] = new Method_Overloading("Chess", 2);



        System.out.println("\nMethod Overloading :");
        mo[0].disp();
        System.out.println("\n");
        mo[1].disp("Football", 11);
        System.out.println("\n");
        mo[2].disp("Chess", 2,"Indoor");
     }
}
