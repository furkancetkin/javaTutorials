public class Main {
    public static void main(String[] args) {
        double[] myList = {1.4, 2.6, 3.5, 4.2, 5.5, 6.2};
        double total = 0;
        double max = myList[0];
        for(double number : myList){
            System.out.println(number);
            total += number;
            if(max < number){
                max = number;
            }
        }
        System.out.println("Total : " + total);
        System.out.println("Max : " + max);
    }
}