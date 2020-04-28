package ro.ase.acs.prototype;

public class WoodBlock implements BuildingBlock {
	private Object woodTexture = new Object();
	private int x;
	private int y;
	private int z;
	
	public WoodBlock(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public BuildingBlock cloneBlock() {
		WoodBlock copy = new WoodBlock(x, y, z);
		copy.woodTexture = woodTexture;
		return copy;
	}

}
