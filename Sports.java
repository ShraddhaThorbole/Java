import java.util.Scanner;
public class Sports 
{
    public String name;
    public int players;
    public String type;
    static int totalSports = 0;

    // Default Constructor
    public Sports() 
    {
        this("ABC", 0, "Outdoor");
    }

    // Constructor with arguments
    public Sports(String name, int players, String type) 
    {
        this.name = name;
        this.players = players;
        this.type = type;
        totalSports++;
    }

    // Method to display sports details
    void disp() 
    {
        System.out.println("Name of sport: " + name);
        System.out.println("Number of players: " + players);
        System.out.println("Type of sport: " + type);
    }

    // Method overloading - passing single argument
    void disp(String additionalInfo) 
    {
        System.out.println("Name of sport: " + name);
        System.out.println("Additional Info: " + additionalInfo);
    }

    // Method overloading - passing multiple arguments
    void disp(String sName, int sPlayers, String sType) 
    {
        System.out.println("Name of sport: " + sName);
        System.out.println("Number of players: " + sPlayers);
        System.out.println("Type of sport: " + sType);
    }

    // Method overloading - passing arguments by changing order
    void disp(int sPlayers, String sType, String sName) 
    {
        System.out.println("Number of players: " + sPlayers);
        System.out.println("Type of sport: " + sType);
        System.out.println("Name of sport: " + sName);
    }

    // Static method to get No. of total sports
    public static int getTotalSports() 
    {
        return totalSports;
    }

    // Passing object as an argument
    void comparePlayers(Sports sport2) 
    {
        if (this.players < sport2.players) 
        {
            System.out.println(this.name + " requires fewer players compared to " + sport2.name);
        } 
        else if (this.players > sport2.players) 
        {
            System.out.println(sport2.name + " requires fewer players compared to " + this.name);
        } 
        else 
        {
            System.out.println(this.name + " and " + sport2.name + " require the same number of players");
        }
    }

    // Method to compare number of players among an array of sports
    static void compare(Sports[] sports) 
    {
        for (int i = 0; i < sports.length - 1; i++) 
        {
            for (int j = i + 1; j < sports.length; j++) 
            {
                sports[i].comparePlayers(sports[j]);
            }
        }
    }

    // Inner class for taking input details of a sport
    static class SportInput 
    {
        // Method to create a sport with the input details
        public static Sports createSport() 
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter details for Sport:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Number of players: ");
            int players = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Type: ");
            String type = scanner.nextLine();
            return new Sports(name, players, type);
        }
    }

    public static void main(String args[]) 
    {
        // Create an array of objects of Sports class
        Sports[] sports = new Sports[4];
        // Take input from user using inner class and Accessing inner class method
        for (int i = 0; i < sports.length; i++) 
        {
            sports[i] = SportInput.createSport();
        }

        // Compare number of players among all sports using object asargument
        System.out.println("\nComparing number of players among all sports:");
        Sports.compare(sports);

        // Method overloading
        System.out.println("\nMethod Overloading :");
        sports[0].disp();
        System.out.println("\n");
        sports[1].disp("Football", 11, "Outdoor");
        System.out.println("\n");
        sports[2].disp("Indoor Sport");
        System.out.println("\n");
        sports[3].disp(11, "Outdoor", "Football");

        // Display total sports with static method
        System.out.println("\nTotal Sports: " + Sports.getTotalSports());
    }
}
