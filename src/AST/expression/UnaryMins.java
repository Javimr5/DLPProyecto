package AST.expression;

import AST.main.Expression;

public class UnaryMins extends AbstractExpressionOneRelation{
    public UnaryMins(int line, int column, Expression expression) {
        super(line, column, expression);
    }
}
