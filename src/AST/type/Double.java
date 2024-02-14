package AST.type;

import AST.main.AbstractASTNode;
import AST.main.Type;

public class Double extends AbstractASTNode implements Type {
    public Double(int line, int column) {
        super(line, column);
    }
}
