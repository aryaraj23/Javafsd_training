package com.ust.examples;

abstract interface MusicPlayer {
	public static final int defaultVolume = 30;
	
	public abstract void play();
	public abstract void stop();
}

class KMPlayer implements MusicPlayer {
	public void play() {
		System.out.println("Starting the player..");
	}
	public void stop() {
		System.out.println("KM Player is off");
	}
}

public class MusicPlayerDemo {

	public static void main(String[] args) {
		KMPlayer kp = new KMPlayer();
		kp.play();
		kp.stop();

	}

}
