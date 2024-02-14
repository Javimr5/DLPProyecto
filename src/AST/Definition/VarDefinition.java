package AST.Definition;

import AST.main.Statement;
import AST.main.Type;

public class VarDefinition extends AbstractDefinition implements Statement {
    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }
}
