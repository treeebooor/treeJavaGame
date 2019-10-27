package treegame;

public class Card extends Thing {
	
	public  Card(int id)
	{
		super(id);
		switch(super.getId())
		{
		case 0:
			super.setImage("/Pictures/draw2.png");
		case 1:
			super.setImage("/Pictures/electricCars.png");
		case 2:
			super.setImage("/Pictures/solarPanels.png");
		case 3: 
			super.setImage("/Pictures/verticalFarming.png");
		case 4:
			super.setImage("/Pictures/plant3.png");
		}

	}
	
	
	
	
	
	
}
