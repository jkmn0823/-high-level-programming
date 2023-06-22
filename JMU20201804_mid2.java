package game_project;
import java.util.Random;
import java.util.Scanner;

class JMU20201804_mid2 {
	 public static void main(String[] args) {
		 
		 
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        String[] item = {"가위", "바위", "보"};

	        while (true) {		//반복문 while 사용
	            System.out.println("가위바위보 중 하나를 선택하세요 (가위, 바위, 보):");
	            String me = scanner.nextLine();
	           
	            
	            								// 사용자가 올바른 선택을 했는지 확인
	            if (!Choice_play(me)) {			//Choice 앞에 있는 느낌표 = false를 표현
	                System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
	                continue;
	            }
	            
	            
	            int computer_Index = random.nextInt(3);
	            String computer = item[computer_Index];

	            System.out.println("사용자: " + me);
	            System.out.println("컴퓨터: " + computer);

	            String result = Game_Result(me, computer);

	            if (result == "win") {
	                System.out.println("이겼습니다. 오늘의 행운번호를 알려드리겠습니다!");
	                // 로또 번호 추첨
	                
	                int[] lotto_Num = Lotto();		//Lotto메소드를 불러와 결과값을 출력해주는 코드
	                System.out.print("행운 번호: ");
	                for (int number : lotto_Num) {
	                    System.out.print(number + " ");
	                }
	                System.out.println();
	                break;
	            } 
	            
	            
	            else if (result=="draw") {
	                System.out.println("비겼습니다. 다시 가위바위보를 진행하세요!");
	            } 
	            
	            
	            else if (result=="lose"){
	                System.out.println("패배했습니다. 다음에 다시 시도하세요!");
	                break;
	            }
	        }
	    }

	 
	 
	    public static boolean Choice_play(String choice) { 		//답변이 '가위,바위,보'가 맞는지 확인하는 메소드
	        return choice.equals("가위") || choice.equals("바위") || choice.equals("보");
	    }

	  //== 연산자는 비교하는 대상들의 주소를 비교 하고, equals는 객체의 내용끼리 비교 할 수 있게 해준다.
	    
	    public static String Game_Result(String user, String computer) {
	        if (user.equals(computer)) {	
	            return "draw"; // 비김
	        } else if (
	            (user.equals("가위") && computer.equals("보")) ||		//&&(and연산자), ||(or연산자)
	            (user.equals("바위") && computer.equals("가위")) ||
	            (user.equals("보") && computer.equals("바위"))
	        ) {
				return "win"; // 이김
	        } 
	        else {
	            return "lose"; // 짐
	        }
	    }

	    
	    
	    public static int[] Lotto() {		//로또번호를 출력해주는 메소드
	    	int[] lotto_Num = new int[6];		//길이 6인 배열을 생성
            for (int i = 0; i < lotto_Num.length; i++) {
                int temp = (int) (Math.random() * 45) + 1;  //+1을 한 이유 : 1.0이상 46.0(45.0+1)미만의 난수를 번을수있다
                lotto_Num[i] = temp;		
 
                for (int j = 0; j < i; j++) {		// 중복제거
                    if (lotto_Num[j] == temp) {		//temp배열을 num에 입력된 모든 원소와 비교.
                        i--;		//중복된 원소라면 i값을 하나 줄여주고, break를 통해 반복문을 빠져나감.
                        break;		//다시 난수를 추출하고, i값이 하나줄었으므로 중복된 숫자가 들어갔던 인덱스는 새로운 난수로 덮어씌워진다.
                    }
                }
 
            }
			return lotto_Num;
	    }
}