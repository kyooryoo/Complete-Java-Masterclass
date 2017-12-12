public class Flow {
    public static void main(String[] args) {
        int x;
        String name;

        x = 1;
        name = "Adam";
        evaluate(name, withIf(x));

        x = 2;
        name = "Eva";
        evaluate(name, withSwitch(x));

        x = 5;
        System.out.println("Build a size " + x + " matrix with for loop:");
        withFor(x);

        x = 100;
        System.out.println("Find the first " + x + " prime numbers with for loop:");
        findPrime(x);

        x = 10;
        System.out.println("Count down to " + x + " with while loop:");
        countDownWithWhile(x);
        System.out.println("Count to " + x + " with do-while loop:");
        countToWithWhileDo(x);
    }

    public static void evaluate(String name, String gender) {
        System.out.println("The gender of " + name + " is: " + gender);
    }

    public static String withIf(int gender) {
        if(gender==1){
            return "man";
        } else if(gender==2){
            return "woman";
        } else {
            return "unknown";
        }
    }

    public static String withSwitch(int gender) {
        switch(gender){
            case 1:
                return "man";
            case 2:
                return "woman";
            default:
                return "unknown";
        }
    }

    public static void withFor(int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i==j){
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int x){
        if(x==1) return false;
        for(int i=2; i <= (long)Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }
        return true;
    }

    public static void findPrime(int n){
        int count=0;
        for(int i=1; i<=Long.MAX_VALUE; i++){
            if(isPrime(i)) {
                System.out.print(i + ", ");
                count++;
            }
            if(isPrime(i) && count>1 && count%10==0)
                System.out.println();
            if(count==n) break;
        }
    }

    public static void countDownWithWhile(int x) {
        while(x!=0){
            System.out.println("Current value is: " + x);
            x--;
        }
    }

    public static void countToWithWhileDo(int x) {
        int z = 1;
        do {
            System.out.println("Current value is: " + z);
            z++;
        } while(z <= x);
    }
}
