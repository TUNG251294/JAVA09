package Lesson09.TDDProject;

public class Calculator {                   //Enter + Alt => tạo class Test
    public int add(int num1, int num2){
        return num1 + num2;
//        throw new RuntimeException();
    }
    public int divide(int num1, int num2){
        if(num2==0) {
            throw new RuntimeException("Can not divide by 0");
        }
        return num1/num2;
//        throw new RuntimeException();

    }
}
