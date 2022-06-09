public class Main {
    public static void main(String[] args) {
        // firstTask(5, 5);
        // secondTask(14,0.3);
        //thirdTask(3,5);
        System.out.println(fourTask(6));

    }

    //Метод генерирует двумерный массив произвольного размера и заполняет его случайными числами
    public static void firstTask(int a, int n) {
        int c = 0;
        int[][] arr = new int[a][n];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        //Цикл выводит полученный массив в консоль
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                System.out.print(arr[k][l] + "\t");
            }
            System.out.println();
        }
        //Цикл вычисляет сумму главной диагональ массива
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    c = c + arr[i][i];
                }
            }
        }
        System.out.println(c);
    }

    public static void secondTask(int a, double b) {
        double c = a * b;
        String[] z = String.valueOf(c).split("[.]");
        int whole = Integer.parseInt(z[0]);
        int part = Integer.parseInt(z[1]);
        System.out.println(whole + "\n" + part);
    }

    public static void thirdTask(int a, int b) {
        System.out.println(a + "\n" + b);
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;
        System.out.println(a + "\n" + b);

    }

    public static long fourTask(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b = b * i;
        }
        return b;
    }
}

