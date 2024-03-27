package JW.sy2;

import org.junit.Test;

import java.util.List;

public class ProductTest {
    ProductDaoImp pdi=new ProductDaoImp();
    @Test
    public void testfindByCatidFenye(){
        List<Product> list= pdi.findByCatidFenye("2", 2, 10);
        for (Product product : list) {
            System.out.println(product);
        }
        pdi.close();
    }
    @Test
    public void testfindByName(){
        List<Product> list=pdi.findByName("%少年%");
        for (Product product : list) {
            System.out.println(product);
        }
        pdi.close();
    }
}