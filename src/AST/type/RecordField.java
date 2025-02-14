package AST.type;

import AST.main.AbstractASTNode;
import AST.main.Type;

public class RecordField extends AbstractASTNode  {

    private Type type;
    private String name;
    public RecordField(int line, int column, Type type, String name) {
        super(line, column);
        this.type=type;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
