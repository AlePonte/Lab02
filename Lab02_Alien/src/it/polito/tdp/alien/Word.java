package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String translate;
	
	
	public Word(String alienWord, String translate) {
		
		this.alienWord = alienWord;
		this.translate = translate;
	}
	public String getAlienWord() {
		return alienWord;
	}
	public String getTranslate() {
		return translate;
	}
	
	public boolean equals(String alien) {
		if(this.alienWord.compareTo(alien)==0) {
		return true;
	}else {
		return false; }
	}
	
	

	
	

}
