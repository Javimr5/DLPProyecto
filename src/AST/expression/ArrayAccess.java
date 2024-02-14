package AST.expression;

import AST.main.Expression;

public class ArrayAccess extends AbstractExpressionTwoRelation{
    public ArrayAccess(int line, int column, Expression right, Expression left) {
        super(line, column, right, left);
    }
}
