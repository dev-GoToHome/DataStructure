package skeleton;

// 이 ArrayList는 Integer Type만 다룬다
public class GTHArrayList {
    private int size;     // ArrayList 초기 사이즈 설정 변수
    private int index;     // ArrayList 초기 포인터 위치 변수
    private int array[];     // 배열 선언용 변수

    // 클래스 생성자
    GTHArrayList() {
        // 1. 배열 선언
        // 2. 클래스의 size 초기 세팅 진행 => size 10으로
    }

    // 클래스 생성자 Overiding
    GTHArrayList(int size) {
        // 1. 배열 선언

    }

    public void add(int data) {
        // 3. add method 구현
        // 현재 포인터의 위치에 데이터를 추가
        // 데이터 추가 후 인덱스+1
    }

    public void remove(int index) {
        // 4. remove method 구현
        // 해당 인덱스의 데이터를 제거
        // 중간 데이터를 제거한 경우 뒤에 있는 데이터를 앞으로 밀어주어야 함.
    }

    public int indexOf(int data) {
        // 5. indexOf method 구현
        // 해당 데이터가 있는 위치의 인덱스를 반환
        return 0;
    }

    public int size() {
        // 6. size method 구현
        // ArrayList의 크기를 반환
        return this.size;
    }

    public boolean contains(int data) {
        // 7. 해당 데이터가 ArrayList 내부에 존재 여부를 반환
        // 있으면 true, 없으면 false
        return false;
    }

    public boolean isFull(){
        // 8. ArrayList가 꽉 찬 상태인지 반환
        return false;
    }

    public boolean isEmpty(){
        // 9. ArrayList가 비어있는 상태인지 반환
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GTHArrayList [ ");
        for(int i=0; i<this.index; i++){
            sb.append(this.array[i]);
            if(i != size() - 1){
                sb.append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }

    // 클래스를 테스트 해 볼 수 있는 메인 함수
    public static void main(String args[]){
        GTHArrayList aryList = new GTHArrayList();
        System.out.println("데이터 출력");
        System.out.println(aryList.toString());
    }
}
