public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(integer[i]);
        }
        System.out.println();
        double[] fractional = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractional.length; i++) {
            System.out.println(fractional[i]);
        }
        System.out.println();
        int[] custom = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        for (int i = 0; i < custom.length; i++) {
            System.out.println(custom[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i == integer.length - 1) {
                System.out.println(integer[i]);
                break;
            }
            System.out.print(integer[i] + ",");
        }
        System.out.println();
        double[] fractional = {1.57, 7.654, 9.986, 0};
        for (int a = 0; a < fractional.length; a++) {
            if (a == fractional.length - 1) {
                System.out.println(fractional[a]);
                break;
            }
            System.out.print(fractional[a] + ",");
        }
        System.out.println();
        int[] custom = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 0};
        for (int i = 0; i < custom.length; i++) {
            if (i == custom.length - 1) {
                System.out.println(custom[i]);
                break;
            }
            System.out.print(custom[i] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] integer = new int[8];
        integer[0] = 3;
        integer[1] = 1;
        int i = integer[0];
        for (; i >= 1; i--) {
            if (i == integer[1]) {
                System.out.println(integer[i]);
                break;
            }
            System.out.print(i + ",");
        }
        System.out.println();
        double[] fractional = {1.57, 7.654, 9.986, 0};
        int pad = 0;
        for (double element : fractional) {
            pad++;
        }
        for (int a = pad - 1; a >= 0; a--) {
            if (a == fractional[3]) {
                System.out.println(fractional[a]);
                break;
            }
            System.out.print(fractional[a] + ",");
        }
        System.out.println();
        int[] custom = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 0};
        int length = 0;
        for (int element : custom) {
            length++;
        }
        for (int b = length - 1; b >= 0; b--) {
            if (b == custom[11]) {
                System.out.println(custom[b]);
                break;
            }
            System.out.print(custom[b] + ", ");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        for (; i < a.length; i++) {
            if (a[i] % 2 != 0) a[i] += 1;
                System.out.print(a[i] + ", ");
        }
    }
}


