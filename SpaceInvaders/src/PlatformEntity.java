
public class PlatformEntity extends Entity {

	private Game game;
	
	PlatformEntity (Game g, String r, int newX, int newY) {
		super(r, newX, newY);  // calls the constructor in Entity
	    game = g;
	} // constructor
	
	public void collidedWith(Entity other) {
	     if (other instanceof ShipEntity) {
	        //floor = y - 26;
	        other.y = y - 26;
	        //
	        jumped = false;
	    	other.jump();
	     } // if
	   } // collidedWith
}
