
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
        boolean result = Function_09(10, 0, arrayNumber.length - 1);
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
        System.out.println("Function_09: " + result);
    }
}