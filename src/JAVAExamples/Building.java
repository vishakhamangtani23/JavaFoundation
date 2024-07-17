package JAVAExamples;

public class Building<T> {
//    why writing static was important here in inner class
//    because we are using it in main method which is static in nature and static methods can only access static members

    public static class BuildingMain{
        @Override
        public String toString() {
            return "BuildingMain{}";
        }

        public static void main(String[] args) {
            Building<Integer> b1 = new Building<>(123);
            Building<Integer> b2 = new Building<>(123);

            System.out.println(utils.compareBuildings(b1,b2));
            System.out.println("------");
            Building<String> b3 = new Building<>("Vish");
            Building<String> b4 = new Building<>("Vish");
            System.out.println(utils.compareBuildings(b3,b4));

            BuildingMain bm = new BuildingMain();
            System.out.println(bm);

        }


    }
    private T flat;

    public T getFlat() {
        return flat;
    }

    public Building(T flat) {
        this.flat = flat;
    }

    public void setFlat(T flat) {
        this.flat = flat;
    }
}

