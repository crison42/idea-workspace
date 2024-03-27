package JW.sy2;


import java.util.List;

public interface SignonDao {
    int add(Signon entity);
    int delete(String username);
    int update(Signon entity);
    List<Signon> findAll();
    boolean login(Signon entity);
    String login1(Signon entity);
}
