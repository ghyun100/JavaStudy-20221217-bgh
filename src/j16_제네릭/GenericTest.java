package j16_제네릭;

import lombok.Data;

@Data
public class GenericTest<T, E> {

	private T number;
//	private String data;
	private E data;
	
}
