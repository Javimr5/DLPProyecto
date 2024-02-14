package AST.type;

import AST.main.AbstractASTNode;
import AST.main.Type;

public class Char extends AbstractASTNode implements Type {
    public Char(int line, int column) {
        super(line, column);
    }
}
