public class Converter {

    private static final String HEX = "0123456789abcdef";
    private int decimalNumber = Integer.MAX_VALUE;

    public int detToOct(int decimalNumber) {
        int octalNumber = 0;
        if (decimalNumber <= 0) {
            return octalNumber;
        } else {
            int i = 0;
            while (decimalNumber != 0) {
                octalNumber = octalNumber + (decimalNumber % 8) * (int) Math.pow(10, i);
                decimalNumber = decimalNumber / 8;
                i++;
            }
        }
        return octalNumber;
    }

    public String decToBin(int decimalNumber) {
        String binaryNumber = "";
        if (decimalNumber <= 0) {
            return binaryNumber;
        }

        while (decimalNumber != 0) {
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }

    public String decToHex(int decimalNumber) {
        String hexNumber = "";
        if (decimalNumber <= 0) {
            return hexNumber;
        } else {
            while (decimalNumber != 0) {
                hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
                decimalNumber = decimalNumber / 16;
            }
        }
        return hexNumber;
    }

    public static void main(String[] args) {
        Converter cv = new Converter();
        System.out.println(cv.decToHex(3610));
        System.out.println(cv.decToBin(3610));
        System.out.println(cv.detToOct(3610));
    }
}
