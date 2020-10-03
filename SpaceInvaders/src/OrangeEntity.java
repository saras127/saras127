
public class OrangeEntity extends Entity {
	
	private Game game;
	
	OrangeEntity (Game g, String r, int newX, int newY) {
		super(r, newX, newY);  // calls the constructor in Entity
	    game = g;
	} // constructor
	
	public void collidedWith(Entity other) {
	     if (other instanceof ShipEntity) {
	        game.notifyFruitTouch();
	        game.removeEntity(this);
	        fruitCount[0] += 1;
	        System.out.println(fruitCount[0]);
	     } // if
	   } // collidedWith

}
