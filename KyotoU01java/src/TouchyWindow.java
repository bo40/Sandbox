import objectdraw.Location;
import objectdraw.Text;
import objectdraw.WindowController;

public class TouchyWindow extends WindowController {
	
	
	public void onMousePress( Location point ){
		canvas.clear();
		new Text( "I'm Touched", 50, 50, canvas);
		new Text("Pointer is on the window", 50, 20, canvas );
		
	}
	
	public void onMouseRelease( Location point ){
		canvas.clear();
		new Text( "I'm Released", 50, 70, canvas );
		new Text("Pointer is on the window", 50, 20, canvas );
		
	}
	
	public void onMouseEnter( Location point ){
		canvas.clear();
		new Text("Pointer is on the window", 50, 20, canvas );
		
	}
	public void onMouseExit( Location point ){
		canvas.clear();
		new Text( "Pointer is out of the window ", 50, 10, canvas );
		
	}
}