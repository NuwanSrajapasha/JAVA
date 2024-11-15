import java.util.Arrays;
class Student{
    String id;
    String name;
    int sub1;
    int sub2;

}
class objectArray{
    public static void main(String[] args) {
        Student[] studentArray=new Student[3];
        System.out.println(Arrays.toString(studentArray));


    }
}