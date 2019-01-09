package com.vtalent.hanu.classtask;

public class MatchImpl implements Match{

	

	

	public double score(Team team) {
		// TODO Auto-generated method stub
		double ov=team.getOvers();
		double rr=team.getRunrate();
		// TODO Auto-generated method stub
		return ov*rr;
		
	}

	public String winner(Team t1, Team t2) {
		// TODO Auto-generated method stub
		double d1=t1.getOvers()*t1.getRunrate();
		double d2=t2.getOvers()*t2.getRunrate();
		String s="";
		if (d1>d2) {
			double d=d1-d2;
			s= t1.getTeam()+" win the match by "+d+" runs";
		}else if (d1<d2) {
			double d=d2-d1;
			s= t2.getTeam()+" Win the match by "+d+" runs";
		}
		return s;
		
	}

	
	
	

}
