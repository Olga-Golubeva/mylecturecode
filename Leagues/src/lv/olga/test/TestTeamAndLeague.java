package lv.olga.test;

import java.util.ArrayList;

import lv.olga.module.League;
import lv.olga.module.Team;

public class TestTeamAndLeague {

	
	
	public static void main(String[] args) {
		
		ArrayList<Team> arrTeam = new ArrayList<>();
		
		
		Team ska = new Team("SKA");
		Team cska = new Team("CSKA");
		arrTeam.add(ska);
		arrTeam.add(cska);
		
		League khl = new League("KHL");
//		khl.nameOfTeam.add(cska);
		khl.setNameOfTeam(arrTeam);
		
		System.out.println(khl.toString());
		
		
	}

}