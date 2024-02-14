package AST.type;

import AST.main.AbstractASTNode;
import AST.main.Type;

public class Int extends AbstractASTNode implements Type {
    public Int(int line, int column) {
        super(line, column);
    }
}
