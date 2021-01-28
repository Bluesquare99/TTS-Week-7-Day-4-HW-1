public class Main {

    public static void main(String[] args) {

        Pet tiger = new Pet("Sandra", 3, "Boston", "Dangerous");
        System.out.println(tiger.getName());
        tiger.setName("Placid");
        System.out.println(tiger.getName());

        Game chess = new Game("Chess", "Strategy", 2);
        System.out.println(chess);
        System.out.println(chess.isGoodForGroups());
    }
}
