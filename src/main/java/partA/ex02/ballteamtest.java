package partA.ex02;

public class ballteamtest{
    public static void main(String[] args) {

        BballTeamPt1  Stephen_Curry = new BballTeamPt1 ("Stephen_Curry",13,"6'6");
        BballTeamPt1  Michael_Jordan  = new BballTeamPt1 ("Michael Jordan",13,"6'6");

        if(Stephen_Curry.height == Michael_Jordan.height || Stephen_Curry.yearsInLeague == Michael_Jordan.yearsInLeague ){
            System.out.println( "True" );}
        else System.out.println(
                "False");;


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
