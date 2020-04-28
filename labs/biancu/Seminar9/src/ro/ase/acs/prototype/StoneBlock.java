package ro.ase.acs.prototype;

public class StoneBlock implements BuildingBlock {
	private Object stoneTexture = new Object();
	private int x;
	private int y;
	
	public StoneBlock(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public BuildingBlock cloneBlock() {
		StoneBlock copy = new StoneBlock(x, y);
		copy.stoneTexture = stoneTexture;
		return copy;
	}
	
	
}
