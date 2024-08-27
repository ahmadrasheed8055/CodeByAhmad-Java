public class bitManipulation {
    int number;
    static public void  convertToBinary(int n){
        System.out.println("Print in binary form: ");
        while (n != 0){

            System.out.print(n % 2 + " ");
            n = n >> 1;
        }

        System.out.println("\n");
    }

    static public  void get(bitManipulation n, int pos){
        int bitMask = 1 << pos;
        int ans = n.number & bitMask;
        if (ans == 0) {
            System.out.println("Answer: 0");
        }else{
            System.out.println("Answer: 1");
        }
    }

    static public  void set(bitManipulation n, int pos){
        int bitMask = 1 << pos;
        n.number = n.number | bitMask;
    }

    static  public  void clear(bitManipulation n, int pos){
        int bitMask = 1 << pos;
        int notValue = ~(bitMask);
        n.number = n.number & notValue;
        System.out.println(n.number);
    }

    public static void main(String[] args) {

        bitManipulation obj = new bitManipulation();
        obj.number = 5;

        convertToBinary(obj.number);
        get(obj, 1);
        convertToBinary(obj.number);

        set(obj, 1);
        convertToBinary(obj.number);

        obj.number = 5;
        clear(obj, 2);
        convertToBinary(obj.number);





//        int n = 5;
//        int pos = 3;
////        System.out.println(n % 2);
////        n = n >> 1;
////        System.out.println(n % 2);
//
//        System.out.println("Get Bit");
//        int bitMask = 1 << pos;
//        if ((bitMask & n ) == 0) {
//            System.out.println("Bit was zero");
//        } else {
//            System.out.println("Bit was one");
//        }
//        convertToBinary(n);
//        System.out.println("Set Bit");
////        0101
//        int pos2 = 0;
//        int bitMask2 = 1 << pos2;
////        System.out.println(bitMask2);
//        n = bitMask2 | n;
//        System.out.println(n);
//
//        convertToBinary(n);
//
//        System.out.println("\n Clear");
//        int bitMask3 =  1 << 1;
//        int ans = ~(bitMask3);
//        n = ans & n;
//        System.out.println( n);
//        convertToBinary(n);






    }
}
