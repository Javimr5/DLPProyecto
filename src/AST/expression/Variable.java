package AST.expression;

import AST.main.AbstractASTNode;
import AST.main.Expression;

public class Variable extends AbstractASTNode implements Expression {

    private String name;
    public Variable(int line, int column, String name) {
        super(line, column);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
