package Java_Language.OOPs;
class Player{
    String name;//2. every object of Player class has its own name and id
    int id;

    // better is to use private static int playerCount = 0;
    static int playerCount = 0; //1. variable shared among all the objects of the Player class

    Player(String name){
        this.name = name;
        id = ++playerCount;
    }
    void printDetails(){
        System.out.println(id+" : "+name);
    }
    //4. static method : (1)to access/modify static variables(though we can do it in non static methods as we did ++playerCount above
    //                   (2)use functional programming(i.e. can be called without even creating any object)
    static int getPlayerCount(){
        return playerCount;
    }

    static {
        int Test = 9;
        System.out.println(Test);
    }
}
public class Static {
    public static void main(String[] args) {
        System.out.println(Player.getPlayerCount());
        Player p1 = new Player("xyz");
        Player p2 = new Player("abc");
        p1.printDetails();
        p2.printDetails();
        //
        System.out.println(Player.playerCount);
        //System.out.println(p1.playerCount);
        System.out.println(p2.playerCount);
        //
        System.out.println(Player.getPlayerCount());
    }
}
//3. static variables or static methods can be accessed using class name(or any object we want) as done in above code
