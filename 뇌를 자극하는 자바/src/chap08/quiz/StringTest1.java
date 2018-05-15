package chap08.quiz;

/*	long start =System.currentTimeMillis();//시작하는 시점 계산

*/
public class StringTest1 {

	public static void main(String[] args) {
		long start =System.currentTimeMillis();//시작하는 시점 계산

		for(int i=1; i<10000000;i++) {
		}
		//실행 시간:0.016
		// 실행시간을 측정하고 싶은 코드 시작
	  /*  String str ="산과 골짜기 위를";
			   str+="둥실 떠가는";
			   str+="구름처럼";*/
		String str ="산과 골짜기 위를"
	                 +"둥실 떠가는"
				     +"구름처럼";
		//실행 시간:0.015
		// 실행시간을 측정하고 싶은 코드 시작
		/*String str="          ";
		str+="역사는 흐른다                 ";
		str+="말목 자른 김유신 통일 문무왕  ";
		str+="원효대사 해골물 혜초 천축국   ";
		str+="바다의 왕자 장보고 발해 대조영";
		str+="귀주대첩 강감찬 서희 거란족   ";
		str+="무단 정치 정중부 화포 최무선  ";
		str+="죽림칠현 김부식               ";
		str+="지눌국사 조계종 의천 천태종   ";
		str+="대마도 정벌 이종무            ";
		str+="일편단심 정몽주 목화씨는 문익점";
		str+="해동공자 최충 삼국유사 일연   ";
		str+="역사는 흐른다                 ";
		str+="황금을 보기를 돌같이 하라     ";
		str+="최영 장군의 말씀 받들자       ";
		str+="황희 정승 맹사성 과학 장영실  ";
		str+="신숙주와 한명회 역사는 안다   ";
		str+="십만 양병 이율곡 주리 이퇴계  ";
		str+="신사임당 오죽헌               ";
		str+="잘 싸운다 곽재우 조헌 김시민  ";
		str+="나라 구한 이순신              ";
		str+="태정태세 문단세 사육신과 생육신";
		str+="몸바쳐서 논개 행주치마 권율   ";
		str+="역사는 흐른다                 ";
		str+="번쩍번쩍 홍길동 의적 임꺽정   ";
		str+="대쪽같은 삼학사 어사 박문수   ";
		str+="삼년 공부 한석봉 단원 풍속도  ";
		str+="방랑 시인 김삿갓 지도 김정호  ";
		str+="영조대왕 신문고 정조 규장각   ";
		str+="목민심서 정약용               ";
		str+="녹두 장군 전봉준 순교 김대건  ";
		str+="서화가무 황진이               ";
		str+="못살겠다 홍경래 삼일천하 김옥균";
		str+="안중근은 애국 이완용은 매국   ";
		str+="역사는 흐른다                 ";
		str+="별 헤는 밤 윤동주 종두 지석영 ";
		str+="삼십삼인 손병희               ";
		str+="만세 만세 유관순 도산 안창호  ";
		str+="어린이날 방정환               ";
		str+="이수일과 심순애               ";
		str+="장군의 아들 김두한            ";
		str+="날자꾸나 이상 황소 그림 중섭  ";
		str+="역사는 흐른다                 ";*/
		
		System.out.println(str);
		
		for(int i=1; i<10000000;i++) {
		}
		long end =System.currentTimeMillis();//프로그램이 끝나느 시점 계산
		//System.out.println("실행 시간:"+(end-start)/1000.0+"초");//실행시간 계산 및 출
		System.out.println("실행 시간:"+(end-start)/1000.0);


		
	}

}
