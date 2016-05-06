import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xcl.dao.AuthorMapper;
import org.xcl.model.Author;
import org.xcl.model.AuthorCriteria;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xcl on 16/5/6.
 */
public class t2 {

    @Test
    public void t1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorMapper dao = context.getBean(AuthorMapper.class);
        Author author= new Author();
        author.setUsername("zz03---109");
        author.setPassword("zzoopwd");
       // author.setEmail("zz@qq.com");
        author.setBio("kk_bio");
        author.setFavouriteSection("vvff");
        author.setId(109);
       // int z = dao.insert(author);
        AuthorCriteria crit = new AuthorCriteria();
        crit.or().andIdEqualTo(109);
        int z = dao.updateByExampleSelective(author,crit);
        //int z = dao.updateByPrimaryKey(author);
      //  dao.insertSelective(author);
        System.out.println(z);
        System.out.println(author);
    }

    @Test
    public void t2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorMapper dao = context.getBean(AuthorMapper.class);
        AuthorCriteria example = new AuthorCriteria();
        example.or().andIdEqualTo(7).andUsernameLike("%003%");
        example.setLimitStart(1);
        example.setLimitLength(10);
        List<Author> a = dao.selectByExample(example);
        int count = dao.countByExample(example);
        System.out.println(a);
        System.out.println(count);

    }

    @Test
    public void t3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        AuthorMapper dao = context.getBean(AuthorMapper.class);
        AuthorCriteria example = new AuthorCriteria();
        example.or().andIdEqualTo(7);
        example.or().andUsernameLike("%003%");
        example.setOrderByClause(" id desc");
        List<Author> a = dao.selectByExample(example);
        System.out.println(a);
    }

    @Test
    public void t4() {
        String oldType ="Example";
        String searchString = "e";
        String replaceString="E";
        Pattern pattern = Pattern.compile(searchString);
        Matcher matcher = pattern.matcher(oldType);
        oldType = matcher.replaceAll(replaceString);
        System.out.println(oldType);
    }
}
