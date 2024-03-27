package JW.sy2;

import java.util.List;

public interface ProductDao {
    int add(Product entity);

    int update(Product entity);

    int delete(String pid);

    //public List<Product> findAll();
    List<Product> findByCatid(String catid);

    List<Product> findByName(String name);
}
