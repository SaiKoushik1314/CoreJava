
public class Operators {

	public static void main(String[] args) {
		//arithmetic operators
		//addition
		
		double a=2,b=4;
		System.out.println("Addition:"+a+b);
		System.out.println("Subtarction:"+(b-a));
		System.out.println("Multiply:"+a*b);
		System.out.println("Division:"+b/a);
		System.out.println("Modulo Division:"+b%a);
		
		//preincrement
		double c;
		c=++b;//c=5,b=5
		System.out.println("c:"+c+"b"+b);
		//post increment
		c=a++;
		System.out.println("c:"+c+"a"+a);//c=2,a=3
		
		if(a>1&&b>1){
			System.out.println("They are high and we used AND and GREAT operator");
		}
		if(a>1||b>1){
			System.out.println("OR operator used");
		}if(a>=3){
			System.out.println("= operator");
		}
	}

}
