package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		String names = "최연호님, 김소유님, 서정근님, 장나겸님";
		
		
//		문제1 : 결과가 
//		최연호/김소유/서정근/장나겸
//		로 나오게
		
		StringBuilder stringBuilder = new StringBuilder();

//		#1방법
		
		stringBuilder.append(names.substring(0, 3));
		stringBuilder.append("/");
		stringBuilder.append(names.substring(6, 9));
		stringBuilder.append("/");
		stringBuilder.append(names.substring(12, 15));
		stringBuilder.append("/");
		stringBuilder.append(names.substring(18, 21));
		
		System.out.println(stringBuilder.toString());
		
//		#2방법
		
		int index = names.indexOf("님");
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index +1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
	
		index = names.indexOf("님", index +1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
	
		index = names.indexOf("님", index +1);
		stringBuilder.append(names.substring(index - 3, index));
	
		System.out.println(stringBuilder.toString());
		
		
//		문제2 :
//		'님, ' 이 부분만 자워서 이름만 출력
		
		
		
//		방법1
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
		
		
		stringBuilder2.delete(3,6)
		.delete(6,9)
		.delete(9,12)
		.delete(12, 13)
		;
		
		
		
		System.out.println(stringBuilder2.toString());
		
		
		
		
		
//        방법2
		stringBuilder2.append(names);
		
		int index2 = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index2, index2 + 3);
		index2 = stringBuilder2.indexOf("님", index2 + 1);
		stringBuilder2.delete(index2, index2 + 3);
		
		index2 = stringBuilder2.indexOf("님", index2 + 1);
		stringBuilder2.delete(index2, index2 + 3);
		
		index2 = stringBuilder2.indexOf("님", index2 + 1);
		stringBuilder2.delete(index2, index2 + 3);
		
		System.out.println(stringBuilder2.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
