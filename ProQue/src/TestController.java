import objectdraw.Location;
import objectdraw.WindowController;

public class TestController extends WindowController{
	
	public void begin()
	{
		this.setSize(100,400);
	}
	public void onMouseClick(Location point)
	{
		this.setSize(200,100);
	}

}
