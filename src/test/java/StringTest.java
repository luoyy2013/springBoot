
/**
 * @author luosir
 * @belongto Zhejiang CoTEK Robotics CO.,Ltd
 * @date 2019/04/19
 */
public class StringTest {
    public static void main(String[] args) {
        long n = 313202505400L;
        printChineseNumber(n);
    }

    private static void printChineseNumber(long number) {
        StringBuilder cnChar = intToChinesChar(number);
        String[] classifier = {"十", "百", "千", "万", "亿"};
        int i = getNumberLength(number);
        StringBuilder result = new StringBuilder();


            System.out.println(cnChar);
    }

    private static StringBuilder intToChinesChar(long number) {
        String[] cnNumbers = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        StringBuilder stringBuffer = new StringBuilder();
        long[] numbers = new long[getNumberLength(number)];
        int i = 0;
        do {
            numbers[i++] = number % 10;
            number /= 10;
        } while (number != 0);
        for (long a : numbers) {
            stringBuffer.append(cnNumbers[(int) a]);
        }
        return stringBuffer.reverse();
    }

    private static int getNumberLength(long number) {
        int i = 0;
        do {
            number /= 10;
            i++;
        } while (number != 0);
        return i;
    }
}
