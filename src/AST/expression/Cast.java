package AST.expression;

import AST.main.Expression;
import AST.main.Type;

public class Cast extends AbstractExpressionOneRelation{

    private Type type;
    public Cast(int line, int column, Expression expression, Type type) {
        super(line, column, expression);
        this.type = type;
    }

    public Type getType(){
        return this.type;
    }

    public void setType(Type type){
        this.type=type;
    }
}
