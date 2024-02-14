package AST.type;

import AST.main.AbstractASTNode;
import AST.main.Type;

public class Array extends AbstractASTNode implements Type {

    private int size;
    private Type of;
    public Array(int line, int column, int size, Type of) {
        super(line, column);
        this.of=of;
        this.size=size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Type getOf() {
        return of;
    }

    public void setOf(Type of) {
        this.of = of;
    }
}
