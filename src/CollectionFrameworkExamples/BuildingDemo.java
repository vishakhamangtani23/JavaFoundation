package CollectionFrameworkExamples;

import JAVAExamples.Building;
import JAVAExamples.utils;

//import static CollectionFrameworkExamples.utils.compareBuildings;

public class BuildingDemo {
    public static void main(String[] args) {
        Building<String> orchid = new Building<>("Nisarg Greens");
        Building<String> lily = new Building<>("Nisarg Greens");
        System.out.println(utils.compareBuildings(orchid,lily));
    }
}
