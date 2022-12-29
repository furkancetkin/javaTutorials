public class Main {
    public static void main(String[] args) {
        String message = "    Bugün hava çok güzel.    ";

        System.out.println(message);
        System.out.println("Count of element : " + message.length());
        System.out.println("5. char of element : " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın"));
        System.out.println(message.startsWith("b"));
        System.out.println(message.endsWith("."));
        char[] chars = new char[5];
        message.getChars(0, 5, chars, 0);
        System.out.println(chars);
        System.out.println(message.indexOf("av"));
        System.out.println(message.lastIndexOf("a"));

        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);
        System.out.println(message.substring(2, 5));

        for (String word : message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}