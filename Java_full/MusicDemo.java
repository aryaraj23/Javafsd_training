package com.ust.examples;

abstract interface MusicPlayer1{
public static final int defaultVolume = 30;
	
	public abstract void play(String s);
	public abstract void stop(String s); 
}

class VLC implements MusicPlayer1 {
	
	public void play(String s) {
		if(s == "melody" || (s == "dance") ) {
			if(defaultVolume == 30) {
				System.out.println("Appro Sound");
			}
			System.out.println("Play");
	}else {
		System.out.println("Stop");
	}
		
	}
	
	public void stop(String s) {
		if(s == "jazz") {
			System.out.println("Stop");
	}else {
		System.out.println("Play");
		}
	}
		
	
}

public class MusicDemo {

	public static void main(String[] args) {
		VLC v1 = new VLC();
		v1.play("melody");
		v1.stop("jazz");

	}

}


