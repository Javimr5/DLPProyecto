package AST.expression;

import AST.main.AbstractASTNode;
import AST.main.Expression;

public class AbstractExpressionTwoRelation extends AbstractASTNode implements Expression{

    private Expression right;
    private Expression left;
    public AbstractExpressionTwoRelation(int line, int column, Expression right, Expression left) {
        super(line, column);
        this.right=right;
        this.left=left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }
}
