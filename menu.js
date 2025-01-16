menu_sets = []
//메뉴 생성기 시작 S==============================
class Menu{
    constructor(mtitle){
        this.mtitle=mtitle;
    }
    mtitle;url;tips;
}
//?menu=0 의 쿼리스트링은 데이터 생성함수 data_sets 객체의 push 순서와 일치합니다.
menu0 = new Menu("1. 개발환경구축")//1. 개발목적/언어-선정/요구사항명세/분석 2. 구현도구/라이센스 3. 테스트도구(junit,mockobj)  4. 형상관리도구  5. 빌드도구
menu0.url = "?menu=0"
menu0.tips = ["1.1 요구사항명세서","1.2 개발언어선정","1.3 개발환경"]
menu1 = new Menu("2. 공통모듈 구현")
menu1.url = "?menu=1"
menu1.tips = ["2.1 공통모듈구현","2.2 테스트케이스 작성","2.3 단위테스트"] //로그인 로그아웃 기능
menu2 = new Menu("3. 서버프로그램 구현")
menu2.url = "?menu=2"
menu2.tips = ["3.1 회원가입 구현","3.2 회원 로그인 구현","3.3 회원 로그아웃 구현","3.4 회원 리스트 출력 구현 ","3.5 테스트케이스","3.6 Mock Object 테스트","3.7 테스트 결과보고서"]
menu3 = new Menu("4. 배치프로그램구현")
menu3.url = "?menu=3"
menu3.tips = ["4.1 배치스케줄구성 및 테스트"]// (5분마다 프로그램 정상 작동유무 출력 메시지 스케줄링 확인)



menu_sets.push(menu0)
menu_sets.push(menu1)
menu_sets.push(menu2)
menu_sets.push(menu3)

