public class ch5 {
    // 要用 main
    public static void main(String args[]) {
        // 依照模板開一個object
        //Bank b = new Bank(); // 右邊assign給左
        //b.printInfo(); // 物件導向
        
        // overload (多種定義)
        // 1. 相關名字，數量不一樣
        // 2. 數量一樣的情況下，形態要不一
        Math m1 = new Math(200); // think of it as 叫不一樣的社區名/房子
        m1.printInfo();
        
        Math m = new Math(5, 6);
        m.printInfo();
        
        Math m2 = new Math('a'); 
        m2.printInfoChar();
        
        
        // 修飾符號（public, private, protected...）
        // public: 公開，所有class都可以看到
        // private: 私人，自己class才可以看到
        Player player = new Player(50);
        player.printInfo();
        player.age = 51;
        
        // 包裝類別 Wrapper Class (bigger version)
        // int, float, double, char, short, long, boolean
        // Integer, Float, Double Char, Short, Long, Boolean <- Wrapped Class
        // boxing（封箱）, unboxing（拆箱） <-- can switch between the two
        // 可以小變大
        
        // Boxing Example
        int i =5;
        Integer iObj = i;

        // Unboxing Example（大的變小的）
        Integer jObj = 1;
        int j;
        j = jObj + 2;
    }
}

