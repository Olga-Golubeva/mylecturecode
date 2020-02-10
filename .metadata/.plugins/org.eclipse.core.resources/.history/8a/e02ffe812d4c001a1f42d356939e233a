package lv.olga.module;

import java.util.ArrayList;

public class League {

	private String name;
	private ArrayList<Team> nameOfTeam;
	
	public League(String leagueName){
		this.name = leagueName;
		this.nameOfTeam = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Team> getNameOfTeam() {
		return nameOfTeam;
	}
	public void setNameOfTeam(ArrayList<Team> nameOfTeam) {
		this.nameOfTeam = nameOfTeam;
	}
	
	
	public void recordWinAndLoss(Team winner, Team loser){
		winner.setWins(1);
		loser.setLosses(1);
	}

	@Override
	public String toString() {
		return "League [name=" + name + ", nameOfTeam=" + nameOfTeam + "]";
	}
	
	
}
