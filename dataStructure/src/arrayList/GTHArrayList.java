package arrayList;

import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;

// <T>는 배열에 들어갈 타입을 설정한다.
// Integer, String 등의 타입이 들어간다.
public class GTHArrayList<T> {
    private int size;     // ArrayList 초기 사이즈 설정 변수
    private int pointer;  // ArrayList 초기 포인터 위치 변수

    // 클래스 생성자
    GTHArrayList(){
        // 1. 포인터의 기본 세팅을 설정
    }

    // 클래스 생성자 Overiding
    GTHArrayList(int size){
        // 2. 클래스의 size 초기 세팅 진행
    }

    public void add(T data){
        // 3. add method 구현
        // 현재 포인터의 위치에 데이터를 추가
        // 데이터 추가 후 인덱스+1
    }

    public void remove(int index){
        // 4. remove method 구현
        // 해당 인덱스의 데이터를 제거
        // 중간 데이터를 제거한 경우 뒤에 있는 데이터를 앞으로 밀어주어야 함.
    }

    public int indexOf(T data){
        // 5. indexOf method 구현
        // 해당 데이터가 있는 위치의 인덱스를 반환
        return 0;
    }

    public int size(){
        // 6. size method 구현
        // ArrayList의 크기를 반환
        return 0;
    }

    public boolean contains(T data){
        // 7. 해당 데이터가 ArrayList 내부에 존재 여부를 반환
        // 있으면 true, 없으면 false
        return false;
    }

    // 클래스를 테스트 해 볼 수 있는 메인 함수
    public static void main(String args[]){
        GTHArrayList<Integer> aryList = new GTHArrayList<Integer>();
        System.out.println("데이터 출력");
    }
}
