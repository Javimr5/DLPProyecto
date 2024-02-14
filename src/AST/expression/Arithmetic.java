package AST.expression;

import AST.main.Expression;

public class Arithmetic extends AbstractExpressionTwoRelation{

    private String operatic;


    public Arithmetic(int line, int column, Expression right, Expression left, String operatic) {
        super(line, column, right, left);
        this.operatic=operatic;
    }

    public String getOperatic() {
        return operatic;
    }

    public void setOperatic(String operatic) {
        this.operatic = operatic;
    }
}
