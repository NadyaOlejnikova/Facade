class Facade {

    BinOps binOps;
    String a;
    String b;

    public Facade(String a, String b) {
        this.binOps = new BinOps(a, b);
        this.a = a;
        this.b = b;
    }

    public String sumAndMult() {
        return "сложение в двоичной системе:    " + binOps.sum(a, b) + '\n' +
                "умножение в двоичной системе:     " + binOps.mult(a, b);
    }
}
