public class Main_VectorList {
    public static void main(String[] args) {
        VectorList<String> vectorList = new VectorList<>();
        vectorList.add("2");
        vectorList.add("4w");
        vectorList.add("3");
        vectorList.add("4");
        vectorList.add("dfff");
        vectorList.add("664t");
        for (String item : vectorList) {
            System.out.println(item);
        }
    }
}