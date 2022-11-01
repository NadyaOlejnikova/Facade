public class BinOps {

    private String a;
    private String b;

    public BinOps(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        int resultSum = x + y;
        String resultStringSum = Integer.toBinaryString(resultSum);
        return resultStringSum;
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        int resultMult = x * y;
        String resultStringMult = Integer.toBinaryString(resultMult);
        return resultStringMult;
    }
}