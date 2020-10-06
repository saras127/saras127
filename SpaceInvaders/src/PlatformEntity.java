
public class PlatformEntity extends Entity {

	private Game game;
	
	
	PlatformEntity (Game g, String r, int newX, int newY) {
		super(r, newX, newY);  // calls the constructor in Entity
	    game = g;
	    jumped = false;
	    floor = y;
   	 	
	} // constructor
	
	
	
	public void collidedWith(Entity other) {
	     if (other instanceof ShipEntity) {
	    	 
	    	 //only sets other.y if it has landed
	    	 if(!jumped){
	    	 other.y = y - 26;
	    	 }
	    	 
	    	 jump(other);
	         fall(other);
	    	 
	   }//if
	}//collidedWith
	
	
	
}

