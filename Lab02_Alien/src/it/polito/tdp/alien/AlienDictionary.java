package it.polito.tdp.alien;

import java.util.List;
import java.util.TreeMap;

public class AlienDictionary {
	
	private List<Word> dictionary;
	
	public AlienDictionary(List<Word> dictionary) {
	
		this.dictionary = dictionary;
	}

	public void addWord(String alienWord, String translation) {
		
		Word w = new Word (alienWord, translation);
		
		
		for(Word ww : dictionary) {
			if(ww.equals(w)) {
				dictionary.add(w);
				dictionary.remove(ww);	
			}else {
				dictionary.add(w);
			}
		}
		
	}
	


	public String translateWord (String alienWord) { 
		for(Word s : dictionary) {
			if(s.equals(alienWord)) {
				return s.getTranslate();
			}
		}return "il dizionario non contiene la parola";
		
	}
	

}
