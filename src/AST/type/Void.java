package AST.type;

import AST.main.AbstractASTNode;
import AST.main.Type;

public class Void extends AbstractASTNode implements Type {
    public Void(int line, int column) {
        super(line, column);
    }
}
