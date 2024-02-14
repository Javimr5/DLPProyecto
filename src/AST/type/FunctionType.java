package AST.type;

import AST.Definition.VarDefinition;
import AST.main.AbstractASTNode;
import AST.main.Type;

import java.util.List;

public class FunctionType extends AbstractASTNode implements Type {

    private Type returnType;
    private List<VarDefinition> params;
    public FunctionType(int line, int column, Type returnType, List<VarDefinition> params) {
        super(line, column);
        this.returnType=returnType;
        this.params=params;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public List<VarDefinition> getParams() {
        return params;
    }

    public void setParams(List<VarDefinition> params) {
        this.params = params;
    }
}
