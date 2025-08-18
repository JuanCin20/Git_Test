
// import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Recursion {

    private static long Function_00(long number) {
        if (number < 0L) {
            System.err.println("Factorial is not Defined for Negative Numbers.");
            throw new IllegalArgumentException("Factorial is not Defined for Negative Numbers.");
        } else {
            if (number == 0L || number == 1L) {
                return 1L;
            } else {
                return number * Function_00(number - 1L);
            }
        }
    }

    private static String Function_01(long number) {
        String numberText = Long.toString(number);
        int numberLength = numberText.length();
        if (numberLength == 1) {
            return Character.toString(numberText.charAt(0));
        } else {
            return numberText.charAt(numberLength - 1)
                    + Function_01(Long.parseLong(numberText.substring(0, numberLength - 1)));
        }
    }

    private static long Function_02(long number) {
        if (number < 0L) {
            System.err.println("Only Allowed Positive Numbers.");
            throw new IllegalArgumentException("Only Allowed Positive Numbers.");
        } else {
            if (number == 0L) {
                return 0L;
            } else {
                return number + Function_02(number - 1);
            }
        }
    }

    public static String Function_03(String chainText) {
        int chainLength = chainText.length();
        if (chainLength == 1) {
            return Character.toString(chainText.charAt(0));
        } else {
            return chainText.charAt(chainLength - 1)
                    + Function_03(chainText.substring(0, chainLength - 1));
        }
    }

    public static long Function_04(long base, long exponent) {
        if (base <= 0) {
            System.err.println("Base must be Greater than 0.");
            throw new IllegalArgumentException("Base must be Greater than 0.");
        } else {
            if (exponent < 0) {
                System.err.println("Exponent must be Greater or Equal than 0.");
                throw new IllegalArgumentException("Exponent must be Greater or Equal than 0.");
            } else {
                if (exponent == 0L) {
                    return 1L;
                } else {
                    return base * Function_04(base, exponent - 1L);
                }
            }
        }
    }

    public static void Function_05(int[] arrayInteger_01, int begin, int end) {
        if (begin < end) {
            int temporal = arrayInteger_01[begin];
            arrayInteger_01[begin] = arrayInteger_01[end];
            arrayInteger_01[end] = temporal;
            Function_05(arrayInteger_01, begin + 1, end - 1);
        }
    }

    public static String Function_06(long number) {
        if (number > 0L) {
            return "Positivo";
        } else {
            if (number <= 0L) {
                return "Negativo";
            }
        }
        return null;
    }

    public static char[] arrayCharacter = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

    public static boolean Function_07(char character, int begin, int end) {
        if (begin == end) {
            return arrayCharacter[begin] == character ? true : false;
        } else {
            return arrayCharacter[begin] == character ? true : Function_07(character, begin + 1, end);
        }
    }

    public static long Function_08(long number_01, long number_02) {
        if (number_01 == number_02) {
            return number_01;
        } else {
            if (number_01 > number_02) {
                return number_01;
            } else {
                return Function_08(number_02, number_01);
            }
        }
    }

    public static int[] arrayNumber = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    public static boolean Function_09(int number, int begin, int end) {
        if (begin == end) {
            return arrayNumber[begin] == number ? true : false;
        } else {
            return arrayNumber[begin] == number ? true : Function_09(number, begin + 1, end);
        }
    }

    public static String getMensaje(String[] palabras) {
        StringBuffer mensaje = new StringBuffer();
        for (int i = 0; i < palabras.length; i++) {
            mensaje.append(" ");
            mensaje.append(palabras[i]);
        }
        return mensaje.toString();
    }

    public static void main(String[] args) {
        // long numberfactorial = Function_00(5L);
        // String numberInverted = Function_01(9876543210L);
        // long numberSum = Function_02(20L);
        // String chainText = Function_03("Juan Carlos");
        // long result = Function_04(3L, 8L);
        /*
         * int[] arrayInteger_01 = { 1, 2, 3, 4, 5 }; // int[] arrayInteger = new
         * int[5];
         * Function_05(arrayInteger_01, 0, arrayInteger_01.length - 1);
         */
        // String result = Function_06(5L);
        // boolean result = Function_07('r', 0, arrayCharacter.length - 1);
        // long result = Function_08(10L, 5L);
        // boolean result = Function_09(10, 0, arrayNumber.length - 1);
        // System.out.println("Function_00: " + numberfactorial);
        // System.out.println("Function_01: " + numberInverted);
        // System.out.println("Function_02: " + numberSum);
        // System.out.println("Function_03: " + chainText);
        // System.out.println("Function_04: " + result);
        /*
         * System.out.println("Function_05: ");
         * for (int i = 0; i < arrayInteger_01.length; i++) {
         * System.out.print(arrayInteger_01[i] + " ");
         * }
         * System.out.println();
         */
        // System.out.println("Function_06: " + result);
        // System.out.println("Function_07: " + result);
        // System.out.println("Function_08: " + result);
        // System.out.println("Function_09: " + result);

        /*
         * int biDimensionalArray[][] = {
         * { 1, 2, 3, 4 },
         * { 5, 6, 7, 8 }
         * };
         */

        // int biDimensionalArray[][] = new int[5][5];

        /*
         * System.out.println("Length: " + biDimensionalArray.length);
         * System.out.println("[0]: " + biDimensionalArray[0]);
         * System.out.println("[1]: " + biDimensionalArray[1]);
         * System.out.println("Length[0]: " + biDimensionalArray[0].length);
         * System.out.println("Length[1]: " + biDimensionalArray[1].length);
         */

        /*
         * for (int i = 0; i <= biDimensionalArray.length - 1; i++) {
         * for (int j = 0; j <= biDimensionalArray[i].length - 1; j++) {
         * System.out.print(biDimensionalArray[i][j] + "\t");
         * }
         * System.out.print("\n");
         * }
         */

        /*
         * System.out.println("PI: " + Math.PI);
         * System.out.println("E: " + Math.E);
         * System.out.println("Absolute Value: " + Math.abs(-10));
         * double angle = 45.0 * Math.PI / 180.0;
         * System.out.println("Cos(" + angle + ") is: " + Math.cos(angle));
         * System.out.println("Sin(" + angle + ") is: " + Math.cos(angle));
         * System.out.println("Tan(" + angle + ") is: " + Math.cos(angle));
         * System.out.println("Exp(1.0) is: " + Math.exp(1.0));
         * System.out.println("Exp(10.0) is: " + Math.exp(10.0));
         * System.out.println("Exp(0.0) is: " + Math.exp(0.0));
         * System.out.println("Log(1.0) is: " + Math.log(1.0));
         * System.out.println("Log(10.0) is: " + Math.log(10.0));
         * System.out.println("Log(Math.E) is: " + Math.log(Math.E));
         * System.out.println("Pow(10.0, 3.5) is: " + Math.pow(10.0, 3.5));
         * System.out.println("Sqrt(16) is: " + Math.sqrt(16));
         * double x = 72.3543;
         * double y = 0.3498;
         * System.out.println("x is Approximately: " + (double) Math.round(x * 100) /
         * 100);
         * System.out.println("y is Approximately: " + (double) Math.round(y * 100) /
         * 100);
         * int i = 7;
         * int j = -9;
         * System.out.println("Min(" + i + "," + j + ") is: " + Math.min(i, j));
         * System.out.println("Min(" + x + "," + y + ") is: " + Math.min(x, y));
         * System.out.println("Max(" + i + "," + j + ") is: " + Math.max(i, j));
         * System.out.println("Max(" + x + "," + y + ") is: " + Math.max(x, y));
         * System.out.println("Random Number: " + Math.random());
         * 
         * Scanner scanner = new Scanner(System.in);
         * 
         * int number01 = 0;
         * System.out.println("Insert an Int Number: ");
         * number01 = scanner.nextInt();
         * 
         * double number02 = 0.0;
         * System.out.println("Insert a Double Number: ");
         * number02 = scanner.nextDouble();
         * 
         * String string = "";
         * System.out.println("Insert a String: ");
         * string = scanner.nextLine();
         */

        /*
         * String string01 = new String("Hello World!");
         * String string02 = "Hello World!";
         * String string03 = "";
         * String string04 = new String();
         * 
         * int result01 = string01.length();
         * boolean result02 = string01.startsWith("Hello");
         * boolean result03 = string01.endsWith("World!");
         * int result04 = string01.indexOf("l");
         * int result05 = string01.indexOf("l", result04 + 1);
         * int result06 = string01.indexOf("el");
         * int result07 = ("Tom").compareTo("John");
         * String result08 = string01.substring(5);
         * String result09 = String.valueOf(10);
         * String result10 = (" 10").trim();
         * int result11 = Integer.parseInt(result10);
         * double result12 = Double.valueOf("20.50").doubleValue();
         * int result13 = Integer.valueOf("20").intValue();
         * 
         * System.out.println("result01: " + result01);
         * System.out.println("result02: " + result02);
         * System.out.println("result03: " + result03);
         * System.out.println("result04: " + result04);
         * System.out.println("result05: " + result05);
         * System.out.println("result06: " + result06);
         * System.out.println("result07: " + result07);
         * System.out.println("result08: " + result08);
         * System.out.println("result09: " + result09);
         * System.out.println("result10: " + result10);
         * System.out.println("result11: " + result11);
         * System.out.println("result12: " + result12);
         * System.out.println("result13: " + result13);
         */

        /*
         * String stringArray[] = { "Tom", "John" };
         * String result = getMensaje(stringArray);
         * System.out.println("result: " + result);
         */

        Date date = new Date();
        System.out.println("date: " + date.toString());
        String dateFormat = "hh:mm:ss dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        System.out.println(simpleDateFormat.format(date));
    }
}