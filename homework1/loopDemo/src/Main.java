public class Main {
    public static void main(String[] args) {
        // for loop
        for (int i=2; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");

        // while loop
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti");

        // do-while loop
        int j = 0;
        do{
            System.out.println(j);
            j++;
        }while(j<10);
        System.out.println("Do-while döngüsü bitti");
    }
}