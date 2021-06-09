

public class Main {
    public static void main(String[] args) {
        Team teamManUtd= DataPlayer.manUtd(); 
        System.out.println("Budget: "+teamManUtd.getBudget());;
        System.out.println(teamManUtd);

        Team teamBayern= DataPlayer.bayern();
        System.out.println(teamBayern);

        Team teamReal= DataPlayer.real();
        System.out.println(teamReal);

        Team teamLiverpool= DataPlayer.liverpool();
        System.out.println(teamLiverpool);

        Team teamBarca= DataPlayer.barca();
        System.out.println(teamBarca);

    }
}
