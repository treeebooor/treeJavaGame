package treegame;

public  class Thing {
	
	private int id;
	private String image;
	
	public Thing(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return this.id;
	}
	public void setImage(String image)
	{
		this.image = image;
	}
	public String getImage()
	{
		return image;
	}
	
}
