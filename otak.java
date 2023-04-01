
    

    import java.util.List;
import java.util.ArrayList;

public class otak extends robot implements gabung{
    public otak(String name, String type, int health, int maxHealth, int power2) {
        super(name, type, health, maxHealth, power2);
        //TODO Auto-generated constructor stub
    }

    private List<robot> componentRobots;


    public void addComponentRobot(robot robot) {
        this.componentRobots.add(robot);
    }

    public void removeComponentRobot(robot robot) {
        this.componentRobots.remove(robot);
    }

    @Override
    public void move() {
        System.out.println(getName()+ " is moving.");
    }

    @Override
    public void attack(Monster monster) {
        System.out.println(getName() + " is attacking.");
    }

    @Override
    public void defend(Monster monster) {
        System.out.println(getName() + " is defending against " + monster.getName() + ".");
    }

    @Override
    public void heal() {
        System.out.println(getName() + " is healing.");
    }

    @Override
    public void combine() {
        System.out.println(getName() + " is combining into a larger robot.");
    }

    @Override
    public void separate() {
        System.out.println(getName() + " is separating into smaller robots.");
    }

    public List<robot> getComponentRobots() {
        return componentRobots;
    }

    public void setComponentRobots(List<robot> componentRobots) {
        this.componentRobots = componentRobots;
    }
    
}

