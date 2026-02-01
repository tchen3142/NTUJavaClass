// Filename must be same as Class

public class ch1 {
    // 要用 main
    public static void main(String args[]) {
        int x = 10;
        int y = 25;
        int z = x + y;
        
        System.out.println("Sum of x + y = " + z);
        
        // There has to be meaning behind your naming 
        // Java variable naming convention = first letter of first word is lowercase, then first letter of second word is capitalized
        int x1 = 20;
        int y1 = 30;
        int z1 = x + y;
        System.out.println("Sum of x + y = " + z1);
        
        int hour168Salary; // ok
        int hourSalary168; // ok
        // cannot initialize int 168hourSalary; 
        
        // 大小寫是不一樣的變數
        int sum = 15;
        int SUM = 20;
        System.out.println("綜合" + SUM);
        
        // 變數可以是中文
        int 時薪 = 100;
        
        // 加底線 (doesn't matter how many lines) 可以
        // 特殊符號
        int _hourSalary;
        int __hourSalary;
        int $hourSalary;
        
        // exception: % and ^ doesn't work
        //int %hourSalary;
        //int ^hourSalary
        
        // 資料型態 int, float, double, boolean, char
        // int: 整數
        // float, double: 浮點數
        // boolean: 
        
        double d = 1.11;
        System.out.println("d = " + d);
        
        double d1 = 1;
        System.out.println("d1 = " + d1);
        
        float f = 1.11f; // Only in Java --> you have to add f to assigned float 
        System.out.println("f = " + f);
        
        char c = 'c';
        System.out.println("c = " + c);
        
        // 四捨五入 (Rounding)
        int m = -10;
        int result;
        result = -(m + 6)*3;
        System.out.println("result = " + result);
        
        // 
        double d2;
        d2 = -100.0 / 0;
        System.out.println("d2 = " + d2);
        
        int i2;
        i2 = 100/0;
        System.out.println("i2 = " + i2);

    }
}