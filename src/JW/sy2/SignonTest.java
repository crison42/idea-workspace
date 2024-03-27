package JW.sy2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SignonTest {
    SignonDaoImp sdi=null;
    @Before
    public void init(){
        sdi=new SignonDaoImp();
        System.out.println("before...");
    }
    @Test
    public void testAdd(){
        Signon entity=new Signon();
        entity.setUsername("zhuba");
        entity.setPassword("123");
        int result= sdi.add(entity);
        if(result>0){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
    @Test
    public void testDelete(){
        int result= sdi.delete("tianqi");
        if(result>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
    @Test
    public void testFindAll(){
        List<Signon> list=sdi.findAll();
        for (Signon signon : list) {
            System.out.println(signon);
        }
    }
    @After
    public void end(){
        sdi.close();
        System.out.println("end");
    }
}
