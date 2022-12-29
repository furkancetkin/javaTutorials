public class Main {
    public static void main(String[] args) {
        String[] students = new String[]{"Furkan","Ahmet","Mehmet"};

        for (int i=0; i<students.length; i++){
            System.out.println("Hi " + students[i]);
        }
        for (String student : students){
            System.out.println("Hello " + student);
        }
    }
}