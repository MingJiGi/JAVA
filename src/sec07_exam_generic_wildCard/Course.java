package sec07_exam_generic_wildCard;
//과정(Courese)을 수강할 수 있는 대상을 제네릭타입(T) 로 선언함.
// 아울러, 어떤 대상이 수강을 할지 아무도 모르는 상태임을 나타냄.


public class Course <T>{

    private String name; // 과정명
    private T[] students; // 과정을 들을수 있는 수강생 수

    public Course(String name, int size) {
        this.name = name;
        //T 타입이 결정되지 않아서 new 연산자를 사용할수 없음
//        this.students = new T[size];
        // 이 부분을 필히 보고 숙지를 해야된다. 이런 코드들이 종종 등장.
        this.students = (T[])new Object[size];
    }

    public String getName() {
        return name;
    }

    public T[] getStudents() {
        return students;
    }

    // 수강생을 추가 시켜주는 메서드
    public void add(T t){
        for (int i = 0; i < this.students.length; i++) {
            if (students[i] == null){
                students[i] = t;
                break;

            }
        }
    }
}
