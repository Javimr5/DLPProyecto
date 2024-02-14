package AST.statement;

import AST.main.AbstractASTNode;
import AST.main.Expression;
import AST.main.Statement;



public class Assignment extends AbstractASTNode implements Statement {

    private Expression right;
    private Expression left;
    public Assignment(int line, int column, Expression right, Expression left) {
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
