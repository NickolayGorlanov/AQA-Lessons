public class HomeWork1 {

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 7;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }


    public static void checkPositiveOrNegative(int num) {

        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void isNegative(int num) {
        if (num < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


        public static void printString(String text, int count) {
            for (int i = 0; i < count; i++) {
                System.out.println(text);
            }
        }

        
        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

    
    public static int[] createBinaryArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; 

        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }


    
        public static int[] fillArray() {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
            return arr;
        }

        
        public static int[] modifyArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] *= 2;
                }
            }
            return arr;
        }

        
        public static int[][] createDiagonalArray(int size) {
            int[][] matrix = new int[size][size];
            for (int i = 0; i < size; i++) {
                matrix[i][i] = 1; 
                matrix[i][size - 1 - i] = 1; 
            }
            return matrix;
        }

        
        public static int[] createArray(int len, int initialValue) {
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
            }
            return arr;
        }


        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();

            System.out.println(isSumInRange(5, 15));
            checkPositiveOrNegative(5);
            isNegative(-5);

            printString("Hello", 3);
            System.out.println(isLeapYear(2024));
            int[] binaryArray = createBinaryArray();
            int[] filledArray = fillArray();
            int[] modifiedArray = modifyArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
            int[][] diagonalMatrix = createDiagonalArray(5);
            int[] initialArray = createArray(5, 10);

            
            System.out.println(java.util.Arrays.toString(binaryArray));
            System.out.println(java.util.Arrays.toString(filledArray));
            System.out.println(java.util.Arrays.toString(modifiedArray));
            for (int[] row : diagonalMatrix) {
                System.out.println(java.util.Arrays.toString(row));
            }
            System.out.println(java.util.Arrays.toString(initialArray));
        }

}

