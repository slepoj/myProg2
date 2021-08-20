package task2.myTask7;

public class Excel {

    public static int str2int(String number) {
        int k = 0;
        int c = 1;
        int res = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            switch (number.charAt(i)) {
                case 'A':
                    res += k * 1 + 1 * c;
                    break;
                case 'B':
                    res += k * 2 + 2 * c;
                    break;
                case 'C':
                    res += k * 3 + 3 * c;
                    break;
                case 'D':
                    res += k * 4 + 4 * c;
                    break;
                case 'E':
                    res += k * 5 + 5 * c;
                    break;
                case 'F':
                    res += k * 6 + 6 * c;
                    break;
                case 'G':
                    res += k * 7 + 7 * c;
                    break;
                case 'H':
                    res += k * 8 + 8 * c;
                    break;
                case 'I':
                    res += k * 9 + 9 * c;
                    break;
                case 'J':
                    res += k * 10 + 10 * c;
                    break;
                case 'K':
                    res += k * 11 + 11 * c;
                    break;
                case 'L':
                    res += k * 12 + 12 * c;
                    break;
                case 'M':
                    res += k * 13 + 13 * c;
                    break;
                case 'N':
                    res += k * 14 + 14 * c;
                    break;
                case 'O':
                    res += k * 15 + 15 * c;
                    break;
                case 'P':
                    res += k * 16 + 16 * c;
                    break;
                case 'Q':
                    res += k * 17 + 17 * c;
                    break;
                case 'R':
                    res += k * 18 + 18 * c;
                    break;
                case 'S':
                    res += k * 19 + 19 * c;
                    break;
                case 'T':
                    res += k * 20 + 20 * c;
                    break;
                case 'U':
                    res += k * 21 + 21 * c;
                    break;
                case 'V':
                    res += k * 22 + 22 * c;
                    break;
                case 'W':
                    res += k * 23 + 23 * c;
                    break;
                case 'X':
                    res += k * 24 + 24 * c;
                    break;
                case 'Y':
                    res += k * 25 + 25 * c;
                    break;
                case 'Z':
                    res += k * 26 + 26 * c;
                    break;
                default:
                    ;
            }
            if (k == 0) {
                k = 26;
                c = 0;
            } else k *= 26;
        }
        return res;
    }

    public static String int2str(int number) {
        String res = "";
        int k = 1;
        while (number > 0) {
            switch (number / k % 26) {
                case 1:
                    number = number / k - 1;
                    res = "A" + res;
                    break;
                case 2:
                    number = number / k - 2;
                    res = "B" + res;
                    break;
                case 3:
                    number = number / k - 3;
                    res = "C" + res;
                    break;
                case 4:
                    number = number / k - 4;
                    res = "D" + res;
                    break;
                case 5:
                    number = number / k - 5;
                    res = "E" + res;
                    break;
                case 6:
                    number = number / k - 6;
                    res = "F" + res;
                    break;
                case 7:
                    number = number / k - 7;
                    res = "G" + res;
                    break;
                case 8:
                    number = number / k - 8;
                    res = "H" + res;
                    break;
                case 9:
                    number = number / k - 9;
                    res = "I" + res;
                    break;
                case 10:
                    number = number / k - 10;
                    res = "J" + res;
                    break;
                case 11:
                    number = number / k - 11;
                    res = "K" + res;
                    break;
                case 12:
                    number = number / k - 12;
                    res = "L" + res;
                    break;
                case 13:
                    number = number / k - 13;
                    res = "M" + res;
                    break;
                case 14:
                    number = number / k - 14;
                    res = "N" + res;
                    break;
                case 15:
                    number = number / k - 15;
                    res = "O" + res;
                    break;
                case 16:
                    number = number / k - 16;
                    res = "P" + res;
                    break;
                case 17:
                    number = number / k - 17;
                    res = "Q" + res;
                    break;
                case 18:
                    number = number / k - 18;
                    res = "R" + res;
                    break;
                case 19:
                    number = number / k - 19;
                    res = "S" + res;
                    break;
                case 20:
                    number = number / k - 20;
                    res = "T" + res;
                    break;
                case 21:
                    number = number / k - 21;
                    res = "U" + res;
                    break;
                case 22:
                    number = number / k - 22;
                    res = "V" + res;
                    break;
                case 23:
                    number = number / k - 23;
                    res = "W" + res;
                    break;
                case 24:
                    number = number / k - 24;
                    res = "X" + res;
                    break;
                case 25:
                    number = number / k - 25;
                    res = "Y" + res;
                    break;
                case 0:
                    number = number / k - 26;
                    res = "Z" + res;
                    break;
                default:
                    ;
            }
            if (!res.isEmpty()) {
                k = 26;
            }

        }
        return res;
    }

    public static String rightColumn(String number) {
        return int2str(str2int(number) + 1);
    }

    public static int str2intV2(String number) {
        int k = 0;
        int c = 1;
        int res = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            res += k * ((int) number.charAt(i) - 64) + ((int) number.charAt(i) - 64) * c;
            if (k == 0) {
                k = 26;
                c = 0;
            } else k *= 26;
        }
        return res;
    }

    public static String int2strV2(int number) {
        String res = "";
        int k = 1;
        int buf = 0;
        while (number > 0) {
            if (number / k % 26 != 0) {
                buf = number / k % 26;
            } else {
                buf = 26;
            }
            number = number / k - buf;
            res = ((char) (buf + 64)) + res;
            if (!res.isEmpty()) {
                k = 26;
            }

        }
        return res;
    }
}
