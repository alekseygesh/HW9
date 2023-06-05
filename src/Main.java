import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //чтение в буфер введенного значения
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        //регулярка на проверку, число или нет
        String reg = "^[0-9]+$";
        String regArray = "^[-+]?[0-9]*[.]?[0-9]+$";

        String size;
        do {
            System.out.println("Введите размер одномерного массива (0 нельзя): ");
            size = buffer.readLine();
        } while (!(size.matches(reg)) || size.equals("0"));
        int arraySize = Integer.parseInt(size);

        double[] myArray = new double[arraySize];

        String element;
        double sumElement = 0;
        for(int i = 0; i < arraySize; i++){
            do {
                System.out.printf("Введите %s элемент массива: ", i+1);
                element = buffer.readLine();
            } while (!(element.matches(regArray)));
            sumElement += Double.parseDouble(element);
            myArray[i] = Double.parseDouble(element);
        }

        double srArifm = sumElement / arraySize;

        System.out.println("\nРезультат:");

        int myCount=0;
        for(int i = 0; i < arraySize; i++){
            System.out.print(String.format("%.3f", (myArray[i] * srArifm)) + "    ");
        }

    }
}