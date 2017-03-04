import com.home.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhiwen.cao on 2017/2/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc.xml")
public class LoginTest {
    @Autowired
    private UserService userService;

    @Test
    public void login() {
        System.out.print("hello world!");
    }

    @Test
    public void equalTest(){
        Integer var = 300;
        int num = 300;
        Assert.assertTrue(var.equals(num));
    }

    @Test
    public synchronized void StrTest(){
        String str = "a,b,c,,";
        String[] array = str.split(",");
        System.out.print(str.length() + "..." + array.length);
    }

    @Test
    public void arrayTest(){
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        for (String temp : a) {
            if("2".equals(temp)){
                a.remove(temp);
            }
        }
        System.out.print(a);
    }

    @Test
    public void iteratorTest(){
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        Iterator<String> it = a.iterator();
        while(it.hasNext()){
            String temp = it.next();
            if("2".equals(temp)){
                it.remove();
            }
        }
    }

    @Test
    public void VarargsTest(){
        userService.get("zhiwen.cao");
        userService.testVarargs(1,2,3);
    }
}
