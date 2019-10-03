import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Initialisation");
        int height = 15;
        int width = 20;
        int maxSteps = 200;
        int steps = 0;

        Map map = new Map(20,15);
        map.fillBoard(3);

        ArrayList<Robot> blueTeam = createRobotTeam(5);
        ArrayList<Robot> redTeam = createRobotTeam(5);

        System.out.println("Start Game");
        for (int i = 0; i < blueTeam.size(); i++) {
            System.out.println(blueTeam.get(i).getId());
            System.out.println(redTeam.get(i).getId());
        }
        for (; steps < maxSteps ; steps++) {
            System.out.println("Current Step: " + steps);
//            System.out.println(map.printMap());
            System.out.println("======================");

        }
        System.out.println("End");
    }

    public static ArrayList createRobotTeam(int numberOfRobots) {
        ArrayList res = new ArrayList();
        for (int i = 0; i < numberOfRobots; i++) {
            res.add(new Robot(new Point(0,0)));
        }
        return  res;
    }
}
