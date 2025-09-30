package sec07_exam_generic_wildCard;


import java.util.Arrays;

public class WildCardExample {

    //Course<T>란 제네릭 타입으로 선언된 부분에 와일드카(?)가 오면, 어떠한 객체가 들어가도 상관이 없다.
    public static void registerCourse(Course<?> course){
        System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
    }

    //Course<T>란 제네릭타입으로 선언된 부분에 <? extends Student>가 오면, Student 이거나.
    //Student의 자손클래스의 객체만 올 수 있다.
    public static void registerCourseStudent(Course<? extends Student> course){
        System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
    }


    //Course<T>란 제네릭타입으로 선언된 부분에 <? super Worker>가 오면, Worker 이거나.
    //Worker의 조상클래스의 객체만 올 수 있다.
    public static void registerCourseWorker(Course<? super Worker> course){
        System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {

        registerCourse(new Course<Person>("일반인 과정", 5));
        registerCourse(new Course<Student>("학생 과정", 5));
        registerCourse(new Course<Worker>("근로자 과정", 5));
        registerCourse(new Course<HighStudent>("고등학생 과정", 5));

        System.out.println("---------------------------------------------------");

        //아래와 같이 예외가 발생하는 이유는 타입을 Student로 제한하기 때문에 Student가 오거나
        //Student의 자손만 올수 있다 .
        // registerCourseStudent(new Course<Person>("일반인 과정", 5));
        registerCourseStudent((new Course<Student>("학생 과정", 5)));
        // registerCourseStudent((new Course<Worker>("근로자 과정", 5));
        registerCourseStudent((new Course<HighStudent>("고등학생 과정", 5)));

        System.out.println("---------------------------------------------------");


        registerCourseWorker(new Course<Person>("일반인 과정", 5));
        //registerCourseWorker((new Course<Student>("학생 과정", 5));
        registerCourseWorker((new Course<Worker>("근로자 과정", 5)));
        //registerCourseWorker((new Course<HighStudent>("고등학생 과정", 5));


        System.out.println("---------------------------------------------------");
        System.out.println("직접 생성 후 추가");

        //2. 직접 Course 생성해서 확인하는 과정
        Course<Person> personCourse = new Course<>("일반과정", 4);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Person("직장인"));
        personCourse.add(new Person("학생"));
        personCourse.add(new Person("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인 과정", 3);
        workerCourse.add(new Worker("슈틸리케"));
        workerCourse.add(new Worker("박지성"));

        Course<Student> studentCourse = new Course<>("학생 과정", 5);
        studentCourse.add(new Student("우민식"));
        studentCourse.add(new Student("송수경"));
        studentCourse.add(new Student("김두산"));
        studentCourse.add(new Student("정민재"));
        studentCourse.add(new Student("오세준"));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);


    }
}
