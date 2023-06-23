package hello.spring.basic;

public class Spring5App00 {
    private static void sayHello(String name){
        System.out.println(name+"입니다 Hello,World");
    }
    public static void main(String[] args){
        //첫번째 사례
        //간단한 인삿말을 출력하는 프로그램 작성
        // 인삿말을 출력하는 메서드가 현재 클래스안에 있기 때문에
        // 프로그램 확장성 측면에서 봤을때 제약이 존재
        // 즉, 유지보수의 어려움이 발생
        // 또한, 개발자가 여러명인 경우 업무분담의 어려움도 존재
        // 해결 : 인삿말 출력 기능을 담당하는 클래스를 따로 작성
        sayHello("jupiter");


    }



}