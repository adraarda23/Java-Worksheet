package Day05.Task5;

import java.util.Scanner;

interface TemperatureConverter {
    double convert(double temperature);
}

class CelsiusToFahrenheitConverter implements TemperatureConverter {
    public double convert(double temperature) {
        return (temperature * 9/5) + 32;
    }
}

class CelsiusToKelvinConverter implements TemperatureConverter {
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}

class FahrenheitToCelsiusConverter implements TemperatureConverter {
    public double convert(double temperature) {
        return (temperature - 32) * 5/9;
    }
}

class FahrenheitToKelvinConverter implements TemperatureConverter {
    public double convert(double temperature) {
        return (temperature - 32) * 5/9 + 273.15;
    }
}

class KelvinToCelsiusConverter implements TemperatureConverter {
    public double convert(double temperature) {
        return temperature - 273.15;
    }
}

class KelvinToFahrenheitConverter implements TemperatureConverter {
    public double convert(double temperature) {
        return (temperature - 273.15) * 9/5 + 32;
    }
}

public class TemperatureConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sıcaklık Dönüştürücü");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Celsius to Kelvin");
        System.out.println("3: Fahrenheit to Celsius");
        System.out.println("4: Fahrenheit to Kelvin");
        System.out.println("5: Kelvin to Celsius");
        System.out.println("6: Kelvin to Fahrenheit");
        System.out.print("Bir seçenek girin: ");
        int choice = scanner.nextInt();

        System.out.print("Dönüştürülecek sıcaklığı girin: ");
        double inputTemperature = scanner.nextDouble();

        TemperatureConverter converter = null;

        switch (choice) {
            case 1:
                converter = new CelsiusToFahrenheitConverter();
                break;
            case 2:
                converter = new CelsiusToKelvinConverter();
                break;
            case 3:
                converter = new FahrenheitToCelsiusConverter();
                break;
            case 4:
                converter = new FahrenheitToKelvinConverter();
                break;
            case 5:
                converter = new KelvinToCelsiusConverter();
                break;
            case 6:
                converter = new KelvinToFahrenheitConverter();
                break;
            default:
                System.out.println("Geçersiz seçenek!");
                System.exit(0);
        }

        double result = converter.convert(inputTemperature);
        System.out.println("Sonuç: " + result);

        scanner.close();
    }
}

