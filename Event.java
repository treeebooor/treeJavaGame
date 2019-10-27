package treegame;

public class Event extends Thing {

	public Event(int id)
	{
		super(id);
		switch(super.getId())
		{
		case 0:
			super.setImage("/Pictures/fire.png");
		case 1:
			super.setImage("/Pictures/oilSpill.png");
		case 2:
			super.setImage("/Pictures/negativePolicy.png");
		case 3: 
			super.setImage("/Pictures/pressConference.png");
		case 4:
			super.setImage("/Pictures/factoryExplode.png");
		}
	}
}
