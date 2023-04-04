package j03_연산자;

public class Operation4 {

	public static void main(String[] args) {
		
		/*
		 *  윤년
		 *  해당 년도가 4의 배수이고 100의 배수가 아니거나 400의 배수일 때
		 *  조건식 : 어쩌구 ?  : ;
		 * 
		 */
		
//		
		int year = 1999;
		
		String result = year % 4 == 0  
				&& (year % 100 != 0 || year % 400 == 0)? "윤년" 
						: "윤년아님";
	    System.out.println(result);
//		
	    
//	    삼항 연산자는 중복이 가능함
	
		
		
	    System.out.println(year > 2000 ? "20000보다 큼"
		         : year > 1000 ? "1000보다 큼"
		                 :year > 500 ? "500보다 큼"
		                		 :"500이하");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
