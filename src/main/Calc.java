package main;
public class Calc {
	// 足し算
	public int tashi(int x,int y){
		return x + y;
	}
	
	// 引き算
	public int hiki(int x,int y){
		return x + y;
	}
	
	// 掛け算
	public int kake(int x,int y){
		return x * y;
	}

	// 割り算
	public int wari(int x,int y){
		// 整数しか返せない
		if(x < y){
			return 0;			
		}
		// 数学上は正しくないが0を返す
		if(y == 0 ){
			return 0;
		}
		return x / y;
	}
	
}
