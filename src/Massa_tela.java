public class Massa_tela {
    public static void main(String[] args) {
        int m = 72;
        double h = 1.85;
        double umt = 0;
        double result = m/(h*h);
        System.out.println("Масса тела человека = " + m + "килограмм");
        System.out.println("Рост человека = " + h + "метров");
        System.out.println("Индекс массы тела человека = " + result);

        if (result == 22) {
            System.out.println("У Вас идеальный вес");
        } else if (result <= 21) {
            System.out.println("У Вас сильный избыток веса!!! К врачу быстро!!!");
        } else if (result >=25) {
            System.out.println("У Вас избыток веса!!!");
        }
    }
}
