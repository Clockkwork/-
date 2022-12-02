public class Main {
        public static void main(String[] args) {
            task1();
        }

        public static void task1 () {
            System.out.println("Задача из самостоятельной работы ");
            float a = 9.57f;
            float b = 8.53f;
            int c = 10;
            boolean d = (b > a && a < c && b < c);
            if (d) {
                System.out.println("Ближайшее число к проверяемому " + b);
            }else  if (a == b){
                System.out.println("Введенные числа не должны биыть равны");
            }else if (a >= c || b >= c) {
                System.out.println("Введенное число не должно быть больше или равно проверяемого");
            }else {
                System.out.println("Ближайшее число к проверяемому " + a);
            }
        }
    }
