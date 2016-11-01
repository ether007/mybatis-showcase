import com.jiuxing.drm.dao.VehicleOrderAdMapper;
import com.jiuxing.drm.model.VehicleOrderAd;
import com.jiuxing.drm.model.VehicleOrderAdCriteria;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by xcl on 16/7/13.
 */
public class TestOrderAd {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    VehicleOrderAdMapper dao = context.getBean(VehicleOrderAdMapper.class);

    @Test
    public void t1() {

        VehicleOrderAd ad = dao.selectByPrimaryKey(3261797);

        System.out.println(ad);
        System.out.println(ad.getSalesId());
    }

    @Test
    public void t2() {

        VehicleOrderAdCriteria e = new VehicleOrderAdCriteria();
        e.setLimitStart(10);
        e.setLimitLength(12);
        List<VehicleOrderAd> list = dao.selectByExample(e);
        List<VehicleOrderAd> list2 = dao.selectByExampleWithBLOBs(e);


        System.out.println(list);
        System.out.println(list2);
    }

    @Test
    public void t3() {
        VehicleOrderAdCriteria e = new VehicleOrderAdCriteria();

        e.createCriteria().andIdBetween(100,120);

        e.or().andIdBetween(102,150).andOrderIdEqualTo("0");


        List<VehicleOrderAd> list = dao.selectByExample(e);
        System.out.println(list);
    }


}
