package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
//위에 4개를 묶어서 Data라고 함.
@Data

public class Student {
	
	
	private int studentCode;
	@NonNull
	private String name;
	private  final int studentYear;
	private int age;
	
	/*RequiredArgsConstructor를 사용하려면
	 *final, NonNull 있는 상태에서 써야함
     */
	}

