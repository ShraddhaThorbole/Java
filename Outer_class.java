public class Outer_class 
{
        String name;
        int players;
    
        Outer_class(String name,int players)
        {
            this.name = name;
            this.players = players;
        }
    
        class Inner_class 
        {
            public void display() 
            {
                System.out.println("Inside the inner class");
                System.out.println("Name of Sports: " + name);
                System.out.println("Number of players: " + players);
            }
        }
    
        public static void main(String[] args) 
        {
            Outer_class out[] = new Outer_class[2];
            out[0] = new Outer_class("Cricket",11);
            out[1] = new Outer_class("Chess",2);
            
            Outer_class.Inner_class in = out[0].new Inner_class();
            Outer_class.Inner_class in1 = out[1].new Inner_class();
            in.display();
            in1.display();
        }
}
