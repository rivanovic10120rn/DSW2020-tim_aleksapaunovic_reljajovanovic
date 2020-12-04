package dsw.rudok.repository.node;


import dsw.rudok.observer.Publisher;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public abstract class RuNode implements Publisher {

    private String name;
    @ToString.Exclude
    private RuNode parent;

    public RuNode(String name, RuNode parent){
        this.name = name;
        this.parent = parent;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof RuNode){
            RuNode otherObj = (RuNode) obj;
            return this.getName().equals(otherObj.getName());
        }
        return false;
    }


    public void setName(String name){
        this.name = name;
        notifySubscriber(name);
    }
}
