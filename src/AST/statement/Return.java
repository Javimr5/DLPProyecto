package AST.statement;

import AST.main.AbstractASTNode;
import AST.main.Expression;
import AST.main.Statement;

public class Return extends AbstractASTNode implements Statement {

    private Expression expression;
    public Return(int line, int column, Expression expression) {
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
