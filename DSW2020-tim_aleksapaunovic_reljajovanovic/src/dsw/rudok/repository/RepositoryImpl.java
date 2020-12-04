package dsw.rudok.repository;

import dsw.rudok.app.Repository;
import lombok.Getter;

@Getter
public class RepositoryImpl implements Repository {

    private Workspace root;

    public RepositoryImpl (){
        root = new Workspace("Workspace");
    }

    @Override
    public Workspace getWorkspace(){
        return root;
    }
}
