import java.util.Scanner;

public class LunchRoulette {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println(" 오늘 뭐 먹지? 점심 메뉴 랜덤 추천 프로그램");
        System.out.println("=======================================");
        System.out.println("[지금 기분이나 상황은 어떤가요?]");
        System.out.println("1. 스트레스 만땅 (매콤하고 자극적인 음식)");
        System.out.println("2. 지갑이 텅텅 (가성비 좋은 음식)");
        System.out.println("3. 다 귀찮다 (빠르게 먹을 수 있는 음식)");
        System.out.print(">> 번호를 입력하세요: ");

        int mood = sc.nextInt();

        // 1~10 사이의 난수 생성
        int randomNum = (int)(Math.random() * 10) + 1;
        String resultMenu = "";

        // 입력받은 상황 번호에 따라 1차 분류
        switch (mood) {
            case 1:
                // 1번 선택 시 메뉴 10가지
                switch (randomNum) {
                    case 1: resultMenu = "엽기떡볶이"; break;
                    case 2: resultMenu = "마라탕"; break;
                    case 3: resultMenu = "직화 쭈꾸미"; break;
                    case 4: resultMenu = "불닭볶음면"; break;
                    case 5: resultMenu = "양념치킨"; break;
                    case 6: resultMenu = "얼큰한 짬뽕"; break;
                    case 7: resultMenu = "돼지고기 김치찌개"; break;
                    case 8: resultMenu = "얼큰 뼈해장국"; break;
                    case 9: resultMenu = "낙곱새"; break;
                    case 10: resultMenu = "매운 카레"; break;
                }
                break;

            case 2:
                // 2번 선택 시 가성비 메뉴 10가지
                switch (randomNum) {
                    case 1: resultMenu = "학식 제육덮밥"; break;
                    case 2: resultMenu = "편의점 컵라면과 삼각김밥"; break;
                    case 3: resultMenu = "한솥 치킨마요 도시락"; break;
                    case 4: resultMenu = "동네 짜장면"; break;
                    case 5: resultMenu = "길거리 토스트"; break;
                    case 6: resultMenu = "김밥천국 라면 세트"; break;
                    case 7: resultMenu = "학식 돈까스"; break;
                    case 8: resultMenu = "패스트푸드 런치 세트"; break;
                    case 9: resultMenu = "냉동 볶음밥"; break;
                    case 10: resultMenu = "구내식당 백반"; break;
                }
                break;

            case 3:
                // 3번 선택 시 간편 메뉴 10가지
                switch (randomNum) {
                    case 1: resultMenu = "초코 에너지바"; break;
                    case 2: resultMenu = "우유와 씨리얼"; break;
                    case 3: resultMenu = "햄치즈 샌드위치"; break;
                    case 4: resultMenu = "소시지빵"; break;
                    case 5: resultMenu = "프로틴 쉐이크"; break;
                    case 6: resultMenu = "편의점 핫바"; break;
                    case 7: resultMenu = "바나나 2개"; break;
                    case 8: resultMenu = "전자레인지 컵밥"; break;
                    case 9: resultMenu = "구운 계란과 두유"; break;
                    case 10: resultMenu = "그냥 굶기 (물 마시기)"; break;
                }
                break;

            default:
                // 1, 2, 3 이외의 숫자를 입력했을 경우 예외 처리
                System.out.println("잘못된 번호입니다. 프로그램을 종료합니다.");
                return;
        }

        System.out.println("\n메뉴 고르는 중...");

        // 최종 결과 출력
        System.out.println("=======================================");
        System.out.println(" 오늘의 추천 메뉴: [" + resultMenu + "]");
        System.out.println("=======================================");

        sc.close();
    }
}
