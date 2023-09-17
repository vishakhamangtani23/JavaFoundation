package JAVAExamples;


import JAVAExamples.Building;

public class utils {
    public static boolean compareStrings(String s1 , String s2)
    {
        return s1.equals(s2);
    }
    public static<K,V> boolean comparePairValues(Pair p1, Pair p2)
    {
        return p1.getValue().equals(p2.getValue());
    }

    public static <T> boolean compareBuildings(Building b1,Building b2)
    {
        return b1.getFlat().equals(b2.getFlat());
    }
}
