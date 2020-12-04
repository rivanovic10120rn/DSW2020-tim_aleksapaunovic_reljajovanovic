package dsw.rudok.repository.node;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public abstract class RuNodeComposite extends RuNode{

    List<RuNode> children;

    public RuNodeComposite(String name, RuNode parent){
        super(name, parent);
        this.children = new ArrayList<>();
    }

    public RuNodeComposite(String name, RuNode parent, List<RuNode> children){
        super(name, parent);
        this.children = new ArrayList<>();
    }

    public abstract void addChild(RuNode child);

    public RuNode getChildByName(String name){
        for(RuNode child : this.getChildren()) {
            if(name.equals(child.getName()))   {
                return child;
            }
        }
        return null;
    }

}
