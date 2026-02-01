// class != file

public class Math {
    // 要用 main
    int x, y; 
    char ch;
    
    // 建議方法：初始化
    // can think of it as 不同房子類別
    Math(int a) { // 建構方法（OOP Construction Method）
        x = a;
    }
    
    Math(int a, int b) {
        x = a;
        y = b;
    }
    
    Math(char c) {
        ch = c;
    }
    
    void printInfo() {
        System.out.println("加法結果 " + (x + y)); // have to put down parentheses for x + y
    }
    
    void printInfoChar() {
        System.out.println("字元: " + ch); // have to put down parentheses for x + y
    }
    
    
}