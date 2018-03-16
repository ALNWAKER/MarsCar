public class Car{
	private String country;
	private String carName;
	
	private int xEnd;
	private int yEnd;
	

	public Car(String country,String carName){
		this.country = country;
		this.carName = carName;
		System.out.println("大家好，我来自"+country+"我叫"+carName);
	}

	
	public int moveForward(int target){
		this.xEnd = xEnd+target;
		return xEnd;
	}
	public int moveBack(int target){
		this.xEnd = xEnd-target;
		return xEnd;
	}
	public int turnLeft(int target){
		this.yEnd =yEnd+target;
		return yEnd;
	}
	public int turnRight(int target){
		this.yEnd =yEnd-target;
		return yEnd;
	}

	public int getxEnd(){
		return xEnd;
		
	}
	public int getyEnd(){
		return yEnd;
		
	}



}