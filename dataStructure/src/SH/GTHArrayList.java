package SH;

// 이 ArrayList는 Integer Type만 다룬다
public class GTHArrayList {
    private static final int DEFAULT_SIZE = 10;   // ArrayList 초기 사이즈 설정 변수
    private static final int DEFAULT_INDEX = 0;   // ArrayList 초기 인덱스 설정 변수
    private int size ;     // ArrayList 초기 사이즈 설정 변수
    private int index;     // ArrayList 초기 포인터 위치 변수
    private int[] array;     // 배열 선언용 변수

    // 클래스 생성자
    GTHArrayList(){
        // 1. 배열 선언
        setDefault(DEFAULT_SIZE);
    }

    // 클래스 생성자 Overiding
    GTHArrayList(int size){
        setDefault(size);
    }

    private void setDefault(int size){
        this.size = size;
        this.array = new int[this.size];
        this.index = DEFAULT_INDEX;
    }

    public void add(int data){
        // 3. add method 구현
        // 현재 포인터의 위치에 데이터를 추가
        // 데이터 추가 후 인덱스+1
        try{
            if(!isFull()){
                this.array[this.index] = data;
                this.index++;
                System.out.println(this.index);
            }else{
                throw new Exception("This ArrayList is full!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void remove(int index){
        // 4. remove method 구현
        // 해당 인덱스의 데이터를 제거
        // 중간 데이터를 제거한 경우 뒤에 있는 데이터를 앞으로 밀어주어야 함.
        try{
            if(!isValidIndex(index)){
                throw new Exception("Valid Index");
            }
            if(!isEmpty()){
                for(int idx=index; idx<this.index; idx++){
                    this.array[idx] = this.array[idx+1];
                }
                this.index--;
            }else{
                throw new Exception("This ArrayList is Empty!");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public int indexOf(int data){
        // 5. indexOf method 구현
        // 해당 데이터가 있는 위치의 인덱스를 반환
        for(int idx=0; idx<this.index; idx++){
            if(this.array[idx] == data){
                return idx;
            }
        }
        return -1;
    }

    public int size(){
        // 6. size method 구현
        // ArrayList의 크기를 반환
        return this.size;
    }

    public boolean contains(int data){
        // 7. 해당 데이터가 ArrayList 내부에 존재 여부를 반환
        // 있으면 true, 없으면 false
        return indexOf(data) != -1;
    }

    public boolean isFull(){
        // 8. ArrayList가 꽉 찬 상태인지 반환
        return this.size == this.index;
    }

    public boolean isEmpty(){
        // 9. ArrayList가 비어있는 상태인지 반환
        return this.index == 0;
    }

    public boolean isValidIndex(int index){
        return index >= 0 && index < this.index;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GTHArrayList [ ");
        for(int i=0; i<this.index; i++){
            sb.append(this.array[i]);
            if(i != this.index - 1){
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
        aryList.add(1);
        aryList.add(2);
        aryList.add(3);
        aryList.remove(0);
        System.out.println(aryList.indexOf(3));

        System.out.println("데이터 출력");
        System.out.println(aryList.toString());
        System.out.println("데이터 출력");

    }
}
