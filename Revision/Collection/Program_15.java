import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Player implements Comparable<Object>{
    String name;
    int score;

    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString(){
        return name + " " + score;
    }

    @Override
    public int compareTo(Object obj){
        Player player = (Player)obj;
        if (this.score > player.score){
            return -1;
        } else if (this.score < player.score){
            return 1;
        } else {
            return this.name.compareTo(player.name);
        }
    }
}

class Program_15 {
    public static void main(String[] args){
        Player p1 = new Player("Virat Kohli", 8677);
        Player p2 = new Player("Rohit Sharma", 3677);
        Player p3 = new Player("Hardik Pandya", 3677);

        List<Player> list = new ArrayList<Player>();

        list.add(p1);
        list.add(p2);
        list.add(p3);

        Collections.sort(list);

        for (Object obj : list){
            Player player = (Player)obj;
            System.out.println(player);
        }
    }
}

