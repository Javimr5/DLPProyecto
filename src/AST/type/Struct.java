package AST.type;

import AST.main.AbstractASTNode;
import AST.main.Type;

import java.util.ArrayList;
import java.util.List;

public class Struct extends AbstractASTNode implements Type {

    private List<RecordField> recordFieldList;
    public Struct(int line, int column, List<RecordField> recordFieldList) {
        super(line, column);
        this.recordFieldList = new ArrayList<RecordField>(recordFieldList);
    }

    public List<RecordField> getRecordFieldList() {
        return recordFieldList;
    }

    public void setRecordFieldList(List<RecordField> recordFieldList) {
        this.recordFieldList = recordFieldList;
    }
}
