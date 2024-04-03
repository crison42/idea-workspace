package JW.sy3;

import java.util.List;

public interface categoryDao {
    int add(category entity);

    int update(category entity);

    int delete(String pid);

    //public List<category> findAll();
    List<category> findByCatid(String catid);

    List<category> findByName(String name);
}
