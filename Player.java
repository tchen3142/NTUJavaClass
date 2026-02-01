// class != file

public class Player {
    // 要用 main
    int age; 
    
    // 建議方法：初始化
    Player(int a) { // 建構方法（OOP Construction Method）
        age = a;
    }
    
    void printInfo() {
        System.out.println("Current Age: " + age);
    }
    
}