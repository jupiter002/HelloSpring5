package hello.spring.bean;

public class Spring5Bean02 {
    //세번째 사례
    //인삿말을 한국어,영어,일본어로 출력하도록 기능 추가
    public void sayHelloEng(String msg){
        System.out.println("Hello "+msg);
    }
    public void sayHelloKor(String msg){
        System.out.println("안녕 "+msg);
    }
    public void sayHelloJpn(String msg){
        System.out.println("こんにちは "+msg);
    }


}
