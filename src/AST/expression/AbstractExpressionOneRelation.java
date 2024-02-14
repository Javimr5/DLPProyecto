package AST.expression;

import AST.main.AbstractASTNode;
import AST.main.Expression;


public class AbstractExpressionOneRelation extends AbstractASTNode implements Expression {

    public Expression expression;
    public AbstractExpressionOneRelation(int line, int column, Expression expression) {
        super(line, column);
        this.expression=expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
