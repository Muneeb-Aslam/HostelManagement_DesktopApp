import java.text.DecimalFormat;
import java.util.Scanner;

class q1 {

    static float convert(float f) {
        return (((5.0f / 9.0f) * (f - 32.0f)));
    }

    public static void main(String[] args) {
        DecimalFormat answer = new DecimalFormat("#.##");
        System.out.println("Enter the temperature in Farenheit: ");
        Scanner in = new Scanner(System.in);
        float temp = in.nextFloat();
        System.out.println("Temperature in Celcius is: " + answer.format(convert(temp)));

    }
}