package AST.statement;

import AST.main.AbstractASTNode;
import AST.main.Expression;
import AST.main.Statement;

import java.util.ArrayList;
import java.util.List;


public class While extends AbstractASTNode implements Statement {

    private Expression expression;
    private List<Statement> statementList;
    public While(int line, int column, Expression expression, List<Statement> statementList) {
        super(line, column);
        this.expression=expression;
        this.statementList = new ArrayList<Statement>(statementList);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }
}
