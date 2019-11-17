package com.yoona;

import com.yoona.dao.StarMapper;
import com.yoona.entity.Star;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest(classes = Application.class)
class ApplicationTests {

    @Autowired
    private StarMapper starMapper;

    /**
     * 查询所有
     */
    @Test
    void contextLoads() {
        welcome();
        List<Star> list = starMapper.selectAll();
        list.forEach(n -> {
            System.out.println(n.toString());
        });
    }

    /**
     * 添加
     */
    @Test
    void addTests() {
        welcome();
        Star star = new Star();
        Date now = new Date();
        star.setStarName("李连杰");
        star.setStarSex(1);
        star.setMovie("黄飞鸿");
        star.setCreated(now);
        star.setUpdated(now);
        int n = starMapper.insert(star);
        if(n == 1) {
            System.out.println("添加成功*****************************");
        } else {
            System.out.println("添加失败*****************************");
        }
    }

    /**
     * 修改
     */
    @Test
    void updateTests() {
        welcome();
        int id = 3; // 开发时，这个id是从前台传过来的
        Star star = starMapper.selectByPrimaryKey(id);
        Date now = new Date();
        star.setMovie("少林寺"); // 设置修改的数据
        star.setUpdated(now);
        int n = starMapper.updateByPrimaryKey(star);
        if(n == 1) {
            System.out.println("修改成功*****************************");
        } else {
            System.out.println("修改失败*****************************");
        }
    }

    /**
     * 输出引导语
     */
    public void welcome() {
        System.out.println();
        System.out.println("   .  ._______.______. _____._______.__ _ _   ");
        System.out.println("  /\\\\ |__   __|  ____|/ ____|__   __|\\ \\ \\ \\  ");
        System.out.println(" ( ( )   | |  | |____/ /____   | |    \\ \\ \\ \\ ");
        System.out.println("  \\\\/    | |  |  ____| '___ \\  | |     ) ) ) )");
        System.out.println("   '     | |  | |____._____) | | |    / / / / ");
        System.out.println("  =======|_|==|______.\\_____/==|_|===/_/ /_/  ");
        System.out.println("  :: Spring Test ::            (v2.1.3.RELEASE)");
        System.out.println();
    }

}
