package ro.ase.acs.observer;

public class YouTubeChannel extends Observable {
	private int videoId;
	
	public void uploadVideo(int videoId) {
		this.videoId = videoId;
		notifySubscribers();
	}
	
	public int getVideoId() {
		return videoId;
	}
}
