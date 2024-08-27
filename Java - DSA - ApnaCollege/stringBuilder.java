public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Ahmad");
        System.out.println(str);

        for (int i = 0; i < str.length() / 2; i++) {

            int front = i;
            int end = str.length() - 1 - i;

            char frontData = str.charAt(front);
            char endData = str.charAt(end);

            str.setCharAt(front , endData);
            str.setCharAt(end , frontData);

        }

        System.out.println(str);

    }
}
