package AST.expression;

import AST.main.AbstractASTNode;
import AST.main.Expression;

import java.util.ArrayList;
import java.util.List;

public class FunCall extends AbstractASTNode implements Expression {

    private Variable variable;
    private List<Expression> expressionList;
    public FunCall(int line, int column, List<Expression> expressions, Variable variable) {
        super(line, column);
        this.variable=variable;
        this.expressionList=new ArrayList<Expression>(expressions);
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }
}
