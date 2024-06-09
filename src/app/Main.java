package app;

public class Main {
    private static final double CONV_K = 1.60934;

    public static void main(String[] args) {
        double km = 1000;
        double mls = 2000;

        System.out.println("App for measures converting ");
        System.out.println("Converter App.");
        System.out.println("Version 2.0.");
        double kilometers= convMlsToKilometers(mls);
        double miles = convKmToMiles(km);

        System.out.println("Result is " + miles + " mls and " + kilometers + " km .");

    }
    private static double convMlsToKilometers(double mls) {
        return mls * CONV_K;
    }

    private static double convKmToMiles(double km) {
        return km / CONV_K;
    }


}



