package by.it.pkochubei.jd01_09;

class Var implements Operation {

    static Var create(String strVar) {
        strVar = strVar.trim().replace(" ", "");
        if (strVar.matches(Patterns.SCALAR))
            return new Scalar(strVar);
        else if (strVar.matches(Patterns.VECTOR))
            return new Vector(strVar);
        else if (strVar.matches(Patterns.MATRIX))
            return new Matrix(strVar);
        else
            return null;

    }

    @Override
    public Var add(Var other) {
        System.out.println("Операция "+this+" + "+other+" невозможна");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Операция "+this+" - "+other+" невозможна");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Операция "+this+" * "+other+" невозможна");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Операция "+this+" / "+other+" невозможна");
        return null;
    }

    @Override
    public String toString() {
        return "abstract Var";
    }
}
