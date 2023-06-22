package game_project;
import java.util.Random; 		/*java.util패키지에서 Random클래스를 'import'를 사용하여 가져온다*/


public class JMU20201804_mid1 {
	public static void main(String[] args) {
		
		String[] items = {"가위","바위","보"};		/*배열 사용*/
		
		Random rand = new Random();
		String a = items[rand.nextInt(3)]; /*배열에서 랜덤으로 변수 하나를 가져옴*/
		String b = items[rand.nextInt(3)];

		

		switch(a) {			/*switch-case 조건문 사용*/
		case("가위"):
			switch(b){
			case("가위"):
				System.out.printf("컴퓨터_1 : %s %n컴퓨터_2 : %s %n",a,b);		/*해당 위치에 string형을 삽입해주는 형식문자열 '%s' 사용*/
				System.out.printf("비겼습니다.");
				break;
			}
			switch(b){
			case("바위"):
				System.out.printf("컴퓨터_1 : %s %n컴퓨터_2 : %s %n",a,b);
				System.out.printf("승리자 : 컴퓨터_2");
				break;
			}
			switch(b){
			case("보"):
				System.out.printf("컴퓨터_1 : %s %n컴퓨터_2 : %s %n",a,b);
				System.out.printf("승리자 : 컴퓨터_1");
				break;
			}
				
		}
		switch(a) {
		case("바위"):
			switch(b){
			case("가위"):
				System.out.printf("컴퓨터_1 : %s %n컴퓨터_2 : %s %n",a,b);
				System.out.printf("승리자 : 컴퓨터_1");
				break;				}
			switch(b){
			case("바위"):
				System.out.printf("컴퓨터_1 : %s %n컴퓨터_2 : %s %n",a,b);
				System.out.printf("비겼습니다.");
				break;
			}
			switch(b){
			case("보"):
				System.out.printf("컴퓨터_1 : %s %n컴퓨터_2 : %s %n",a,b);
				System.out.printf("승리자 : 컴퓨터_2");
				break;
			}
				
		}
		switch(a) {
		case("보"):
			switch(b){
			case("가위"):
				System.out.printf("컴퓨터_1 : %s %n컴퓨터_2 : %s %n",a,b);
				System.out.printf("승리자 : 컴퓨터_2");
				break;				}
			switch(b){
			case("바위"):
				System.out.printf("컴퓨터_1 : %s %n컴퓨터_2 : %s %n",a,b);
				System.out.printf("승리자 : 컴퓨터_1");
				break;
			}
			switch(b){
			case("보"):
				System.out.printf("컴퓨터_1 : %s %n컴퓨터_2 : %s %n",a,b);
				System.out.printf("비겼습니다.");
				break;
			}
				
		}
	}
}

