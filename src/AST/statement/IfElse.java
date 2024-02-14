package AST.statement;

import AST.main.AbstractASTNode;
import AST.main.Expression;
import AST.main.Statement;

import java.util.ArrayList;
import java.util.List;

public class IfElse extends AbstractASTNode implements Statement {

    private List<Statement> ifStatements;
    private List<Statement> elseStatements;
    private Expression condition;
    public IfElse(int line, int column, List<Statement> ifStatements, List<Statement> elseStatements
            , Expression condition) {
        super(line, column);
        this.condition = condition;
        this.ifStatements = new ArrayList<Statement>(ifStatements);
        this.elseStatements = new ArrayList<Statement>(elseStatements);
    }

    public List<Statement> getIfStatements() {
        return ifStatements;
    }

    public void setIfStatements(List<Statement> ifStatements) {
        this.ifStatements = ifStatements;
    }

    public List<Statement> getElseStatements() {
        return elseStatements;
    }

    public void setElseStatements(List<Statement> elseStatements) {
        this.elseStatements = elseStatements;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }
}
