import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class play {
    private List<robot> robots;
    

    public play(List<robot> robots) {
        this.robots = robots;
    }

    

    public static void main(String[] args) {
        
        // Create a list of robots to use in the game
        robot[] componentRobots = {
        new Melee("Melee 1", 100, 100, 20, 40),
        new Melee("Melee 2", 100, 100, 19, 35),
        new jarakserangan("Ranged 1", 90, 100, 15, 20),
        new assistrobo("Support 1", 80, 100, 18, 10),
        new otak("Main Robot", "robot1", 100, 100, 01),
        };

    

        // Find a monster to fight
        Monster monster = new Monster(500, "Godzila");
        otak ootak = new otak("Main Robot", "robot1", 100, 100, 01);
        System.out.println("Demonstrating movement and communication of smaller robots:");
        
        ootak.move();
        ootak.defend(monster);
        ootak.attack(monster);
        ootak.heal();
        ootak.combine();
        for (robot componentRobot : componentRobots) {
            if (componentRobot instanceof Melee) {
                ((Melee) componentRobot).attack(monster);
            } else if (componentRobot instanceof jarakserangan) {
                ((jarakserangan) componentRobot).attack(monster);
            } else if (componentRobot instanceof assistrobo) {
                ((assistrobo) componentRobot).attack(monster);
            }
    }
}
}