package hello.spring.bean;

public class Spring5Bean04Factory {
    //인사말을 출력하는 객체를 생성하는 create메소드
    public static Spring5Bean03 create(String bean) {
        Spring5Bean03 obj = null;
        if(bean.equals("kor") ){
            obj = new Spring5Bean03Kor();
        } else if (bean.equals("Jpn")) {
            obj = new Spring5Bean03Jpn();
        } else if (bean.equals("Eng")) {
            obj = new Spring5Bean03Eng();
        }
        return obj;
    }
}
