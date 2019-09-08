package study.recursion;

class Euclid {
    static int euclid(int num1, int num2) {
        if(num2 == 0) {
            return num1;
        }
        return euclid(num2, num1%num2);
    }
}
