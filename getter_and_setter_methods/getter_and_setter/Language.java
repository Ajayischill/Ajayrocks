package getter_and_setter;

/*
 * This demonstrates setter methods.
 *
 */
public class Language {
	
	// we start out by making our field variables private so they can't be changed by users. If they weren't set as 
	// private, then someone could basically instantiate the class and change the value of the variables (i think).
	// we want to let the user set these values anyway.
	private String level;
	private int difficulty;
	private String type;
	
	// this is a setter method. it accepts a parameter that the user passes in. then we use this.level to set the instance 
	// variable level for the object that the user creates. then the variable level for that object will have this value.
	// this is a super common pattern.
	public void setLevel(String level){
		this.level = level;
	}
	
	public void setDifficulty (int difficulty) {
		this.difficulty = difficulty;
	}
	
	public void setType (String type) {
		this.type = type;
	}
	
	
	// now let's create a getter method so the user can get the values.
	
	public String getLevel(){
		return level;
	}
	
	public int getDifficulty(){
		return difficulty;
	}
		public String getType(){
			return type;	
		}
		
}
