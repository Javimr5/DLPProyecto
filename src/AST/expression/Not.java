package AST.expression;

import AST.main.Expression;

public class Not extends AbstractExpressionOneRelation{
    public Not(int line, int column, Expression expression) {
        super(line, column, expression);
    }
}
