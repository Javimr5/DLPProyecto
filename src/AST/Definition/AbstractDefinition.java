package AST.Definition;

import AST.main.AbstractASTNode;
import AST.main.Definition;
import AST.main.Type;


public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

    private String name;
    private Type type;
    public AbstractDefinition(int line, int column, Type type, String name) {
        super(line, column);
        this.name=name;
        this.type=type;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
