package AST.statement;

import AST.main.AbstractASTNode;
import AST.main.Expression;
import AST.main.Statement;

import java.util.ArrayList;
import java.util.List;

public class Print extends AbstractASTNode implements Statement {

    private List<Expression> expressionList;
    public Print(int line, int column, List<Expression> expressionList) {
        super(line, column);
        this.expressionList = new ArrayList<Expression>(expressionList);
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }
}
