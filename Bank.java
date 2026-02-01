// class != file

public class Bank {
    // 要用 main
    int balance; 
    
    // 建議方法：初始化
    Bank() { // 建構方法（OOP Construction Method）
        balance = 100;
    }
    
    void printInfo() {
        System.out.println("Current Balance: " + balance);
    }
    
}