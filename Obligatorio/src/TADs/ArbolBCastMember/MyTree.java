package TADs.ArbolBCastMember;

import Clases.CastMember;

public interface MyTree {
    public Node find(String key);
    public void insert (String id, CastMember value);
    public void delete (String id);
}
