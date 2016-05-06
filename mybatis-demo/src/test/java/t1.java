import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xcl.dao.AuthorDao;
import org.xcl.dao.BlogDao;
import org.xcl.model.Author;
import org.xcl.model.Blog;

/**
 * Created by xcl on 16/5/5.
 */
public class t1 {

    @Test
    public void t1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        SqlSessionTemplate session = context.getBean(SqlSessionTemplate.class);

        System.out.println(session);
    }

    @Test
    public void t2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorDao dao = context.getBean(AuthorDao.class);
        Author author = new Author();

        author.setUsername("t003");
        author.setPassword("t002pwd");
        author.setEmail("vt@qq.com");
        author.setBio("bio");
        author.setFavourite_section("fav-sec");

        Long iret = dao.save(author);
        System.out.println(iret);
    }

    @Test
    public void t2_1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorDao dao = context.getBean(AuthorDao.class);
        for (int i=0;i<100;i++){
            Author author = new Author();

            author.setUsername("v00"+i);
            author.setPassword("v002pwd"+i);
            author.setEmail("kk"+i+"@qq.com");
            author.setBio("kk_bio"+i);
            author.setFavourite_section("kk-fav-sec");

            Long iret = dao.save(author);
            System.out.println(iret);
        }

    }
    @Test
    public void t3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        BlogDao dao = context.getBean(BlogDao.class);
        Blog b = new Blog();
        b.setAuthor_id(2l);
        b.setTitle("2 blog 2");
        dao.save(b);

    }

    @Test
    public void t4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        BlogDao dao = context.getBean(BlogDao.class);
        System.out.println(dao.select(2l));
    }

    @Test
    public void t4_1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        BlogDao dao = context.getBean(BlogDao.class);
        System.out.println(dao.blogs());
        for(Blog b: dao.blogs()){
            System.out.println(b.getClass());
        }

    }

    @Test
    public void t4_2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        BlogDao dao = context.getBean(BlogDao.class);
        System.out.println(dao.select(1l));
        System.out.println(dao.select(1l));
       // System.out.println(dao.selectBlog(1l));
    }

    @Test
    public void t5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorDao dao = context.getBean(AuthorDao.class);
        Author author = new Author();
        author.setId(1l);
        author.setUsername("t002");
        author.setPassword("t002pwd");
        author.setEmail("vt_new@qq.com");
        author.setBio("bio");
        author.setFavourite_section("fav-sec");

        Long iret = dao.update(author);
        System.out.println(author);
    }

    @Test
    public void t6(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorDao dao = context.getBean(AuthorDao.class);

        System.out.println(dao.delete(3l));
    }



    @Test
    public void t7(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorDao dao = context.getBean(AuthorDao.class);

        System.out.println(dao.findById(1l));
    }

    @Test
    public void t8(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorDao dao = context.getBean(AuthorDao.class);

        System.out.println(dao.findAll());
    }

    @Test
    public void t9(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorDao dao = context.getBean(AuthorDao.class);

        System.out.println(dao.authors());
    }
}
