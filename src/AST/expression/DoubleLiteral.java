package AST.expression;

import AST.main.Expression;

public class DoubleLiteral extends AbstractExpressionTwoRelation{

    private double value;
    public DoubleLiteral(int line, int column, Expression right, Expression left, Double value) {
        super(line, column, right, left);
        this.value=value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
