package AST.expression;

import AST.main.Expression;

public class FieldAccess extends AbstractExpressionOneRelation{

    private String field;
    public FieldAccess(int line, int column, Expression expression, String field) {
        super(line, column, expression);
        this.field=field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
