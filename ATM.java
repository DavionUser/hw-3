class ATM {
    public int countBanknotes(int sum) {
        int a = 500;
        int b = 200;
        int c = 100;
        int d = 50;
        int e = 20;
        int f = 10;
        int g = 5;
        int h = 2;
        int i = 1;
      
        int money = sum;
        
        int count = 0;
        while (money - a >= 0) {
            money = money - a;
            count++;
            
        }
        
        while (money - b >= 0) {
            money = money - b;
            count++;
            
        }
        
        while (money - c >= 0) {
            money = money - c;
            count++;
            
        }
      
        while (money - d >= 0) {
            money = money - d;
            count++;
        }
      
        while (money - e >= 0) {
            money = money - e;
            count++;
        }
    
        while (money - f >= 0) {
            money = money - f;
            count++;
        }
        
        while (money - g >= 0) {
            money = money - g;
            count++;
        }
        
        while (money - h >= 0) {
            money = money - h;
            count++;
        }
      
        while (money - i >= 0) {
            money = money - i;
            count++;
        }
        return count;
    }
}