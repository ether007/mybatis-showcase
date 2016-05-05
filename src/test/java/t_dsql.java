import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xcl.dao.AuthorDao;
import org.xcl.model.Author;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xcl on 16/5/5.
 */
public class t_dsql {

    @Test
    public void t1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorDao dao = context.getBean(AuthorDao.class);
        Author author = new Author();
        // author.setId(1l);
        author.setUsername("0");
        List<Author> authors = dao.dselect(author);
        System.out.println(authors);
    }


    @Test
    public void t2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorDao dao = context.getBean(AuthorDao.class);
        Author author = new Author();
        author.setId(1l);
        author.setUsername("xcl007");
        author.setEmail("xcl007@sina.com");
        long i = dao.dupdate(author);
        System.out.println(i);
    }

    @Test
    public void t3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorDao dao = context.getBean(AuthorDao.class);
        List<Long> list = new ArrayList<>();
        list.add(1l);
        list.add(2l);
        list.add(5l);
        // List<Author> rlist = dao.selectAuthorIn(list);
        List<Author> rlist2 = dao.selectAuthorOr(list);

        System.out.println(rlist2);
    }


}
