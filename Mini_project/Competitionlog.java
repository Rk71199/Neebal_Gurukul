package Mini_project;

public class Competitionlog {
private int playerNumber ;
private String completeSets;
private String incompleteSets;
private int piecesBuilt;

//create constructor
public Competitionlog(int playerNumber, String completeSets, String incompleteSets, int piecesBuilt) {
	
	this.playerNumber = playerNumber;
	this.completeSets = completeSets;
	this.incompleteSets = incompleteSets;
	this.piecesBuilt = piecesBuilt;
}

//create getter & setter 
public String getCompleteSets() {
	return completeSets;
}


public void setCompleteSets(String completeSets) {
	this.completeSets = completeSets;
}


public String getIncompleteSets() {
	return incompleteSets;
}


public void setIncompleteSets(String incompleteSets) {
	this.incompleteSets = incompleteSets;
}


public int getPiecesBuilt() {
	return piecesBuilt;
}


public void setPiecesBuilt(int piecesBuilt) {
	this.piecesBuilt = piecesBuilt;
}


public int getPlayerNumber() {
	return playerNumber;
}

//create toString
public String toString() {
	return "Player "+playerNumber+" completed the following sets: "+completeSets+"\r\n"
			+ "Player "+playerNumber+" did not completed the following sets: "+incompleteSets+"\r\n"
			+ "Player "+playerNumber+" built total of "+piecesBuilt+" pieces";
}






}
