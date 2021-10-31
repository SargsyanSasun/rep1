package pracicehomework;

public class PraciceHomework {
    long seconds;
    int days;
    int nextNum;
    int bolshe;
    boolean trueFalse;
    int[] lop={};
    int[] kol={};
    //convert minute o second
        long convert(int minutes) {
        return seconds = minutes * 60;
    }

// years to days
    int calcAge(int years) {
        return days = years * 365;

    }
   //return next number
    int nextNumber(int number) {
        return nextNum = number + 1;
    }

    // return bool if numbers are the same
    boolean isSameNum(int a, int b) {
        if (a == b) {
            return trueFalse = true;
        } else {
            return trueFalse = false;
        }
    }

    // less than or equal zero
    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return trueFalse = true;
        } else {
            return trueFalse = false;
        }
    }

    //reverse Boolean
    boolean reverseBool(boolean value) {
     return trueFalse = !value;
        }

    // max array length

        long maxlength(int[]lop, int[]kol) {
            if (lop.length > kol.length) {
                return bolshe= lop.length;
            }
            if (kol.length > lop.length){
                return bolshe= kol.length;
            }
            return 0;
        }
        }