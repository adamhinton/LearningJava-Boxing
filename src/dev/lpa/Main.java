package dev.lpa;

public class Main {

    public static void main(String[] args) {

        // IDE flags these as unnecessary or deprecated
        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); // deprecated since Java 9
        int unboxedInt = boxedInt.intValue(); // unnecessary

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        // Can't use methods on primitives
//        System.out.println(autoUnboxed.getClass().getName());


        double resultBoxed = getLiteralDouble();
        double resultUnboxed = getDoubleObj();
    }


    private static Double getDoubleObj  () {
        // Unnecessary
        return Double.valueOf(100.00);
    }

    private static double getLiteralDouble (){
        return 100.00;
    }

}