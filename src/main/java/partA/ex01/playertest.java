package partA.ex01;

public class playertest{
    public static void main(String[] args) {

        Player Stephen_Curry = new Player("Stephen_Curry",13,"6'3");
        Player Michael_Jordan  = new Player("Michael Jordan",15,"6'6");

        System.out.print(
                "Player 1 "+
                        "\n"+
                "Player Name: " + Stephen_Curry.name +
                        "\n "+
                "Height: "+ Stephen_Curry.height+
                "\n"+
                        "Yeats in the League: " + Stephen_Curry.yearsInLeague +
                        "\n"


        );
        System.out.print(
                "\n"+
                "Player 2"+
                        "\n"+
                        "Player Name: " + Michael_Jordan.name +
                        "\n"+
                        "Height: "+ Michael_Jordan.height+
                        "\n"+
                        "Yeats in the League: " + Michael_Jordan.yearsInLeague


        );
    }
}
