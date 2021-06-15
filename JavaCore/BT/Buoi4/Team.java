import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name, stadium, coach;
    private int established_year;
    private ArrayList<Player> listPlayer;
    private long budget; //số tiền trong quỹ

    public Team(String name, String stadium, String coach, int established_year) {
        this.name = name;
        this.stadium = stadium;
        this.coach = coach;
        this.established_year = established_year;
        listPlayer=new ArrayList<Player>();
    }

    public Team() {
        this("", "", "", 0);
        listPlayer=new ArrayList<Player>();
    }

    public void setListPlayers(List<Player> listPlayers) {
        this.listPlayer.addAll(listPlayers);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public int getEstablished_year() {
        return established_year;
    }

    public void setEstablished_year(int established_year) {
        this.established_year = established_year;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        String str = "Team [coach=" + coach + ", established_year=" + established_year + ", name=" + name + ", stadium="
                + stadium + "]\nList Playper:\n";

        for (Player p : listPlayer) {
            str += p;
        }
        return str;
    }
}