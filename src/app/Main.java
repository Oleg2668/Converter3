package app;

public class Main {
    private static final double CONV_K = 1.60934;

    public static void main(String[] args) {

        double mls = 2000;

        System.out.println("App for measures converting ");
        System.out.println("Converter App.");
        System.out.println("Version 2.0.");
        double kilometers= convMlsToKilometers(mls);


        System.out.println("Result is "  + kilometers + " km .");

    }
    private static double convMlsToKilometers(double mls) {
        return mls * CONV_K;
    }


    }





