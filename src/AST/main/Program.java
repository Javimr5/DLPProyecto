package AST.main;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractASTNode {

    private List<Definition> definitionList;
    public Program(int line, int column, List<Definition> definitionList) {
        super(line, column);
        this.definitionList=new ArrayList<Definition>(definitionList);
    }

    public List<Definition> getDefinitionList() {
        return definitionList;
    }

    public void setDefinitionList(List<Definition> definitionList) {
        this.definitionList = definitionList;
    }
}
