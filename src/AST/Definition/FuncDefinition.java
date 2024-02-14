package AST.Definition;

import AST.main.Statement;
import AST.main.Type;


import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends AbstractDefinition {

    private List<Statement> statementList;


    public FuncDefinition(int line, int column, Type type, String name, List<Statement> statementList) {
        super(line, column, type, name);
        this.statementList=new ArrayList<>(statementList);
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }
}
