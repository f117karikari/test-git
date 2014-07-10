package main;
public class Calc {
	public int x;
	public int y;
	
	public void reset(){
		x = 0;
		y = 0;
		return;
	}
	
	public int tashi(int x,int y){
		return x + y;
	}
	
	public int hiki(int x,int y){
		return x - y;
	}
	
	public int kake(int x,int y){
		return x * y;
	}

	public int wari(int x,int y){
		if(y == 0 ){
			return 0;
		}
		return x / y;
	}
	
}
