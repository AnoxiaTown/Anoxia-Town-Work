package com.anoxiatown.ognl;

import com.anoxiatown.ognl.pojo.Job;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;

/**
 * 这里用的ognl-2.6.9; 新的版本用法区别很大;
 * <p>
 * Ognl取根元素不用#号,取非根元素要使用#号
 * <p>
 * Ognl.parseExpression(“language.toUpperCase()”); 方法调用
 * Ognl.parseExpression("@java.lang.Integer@toBinaryString(10)");等同于上面
 * Ognl.parseExpression(“@@min(10,4)”); Math类的方法直接调用,静态方法的调用
 * <p>
 * http://commons.apache.org/proper/commons-ognl/language-guide.html
 */
public class OgnlDemoTest {

    @Test
    public void testOgnlNonRoot() throws OgnlException {
        OgnlContext context = new OgnlContext();
        context.put("cn", "China");
        System.out.println(context.get("cn"));

        Job job = new Job();
        job.setCompanyName("anoxiatown");
        job.setSalary(32);

        context.put("job", job);

        System.out.println(context.get("job"));

        Object value = Ognl.getValue(Ognl.parseExpression("#job.companyName"), context, context.getRoot());
        System.out.println(value);

    }


    @Test
    public void testOgnlRoot() throws OgnlException {
        OgnlContext context = new OgnlContext();

        Job job = new Job();
        job.setCompanyName("anoxiatown");
        job.setSalary(32);

        context.setRoot(job);

        Object value = Ognl.getValue(Ognl.parseExpression("companyName"), context, context.getRoot());
        System.out.println(value);

    }

    @Test
    public void testOgnlStatic() throws Exception {
        OgnlContext context = new OgnlContext();

        Object value1 = Ognl.getValue(Ognl.parseExpression("@Math@floor(10.9)"), context, context.getRoot());
        System.out.println(value1);

        Object value2 = Ognl.getValue(Ognl.parseExpression("@@floor(10.9)"), context, context.getRoot());
        System.out.println(value2);
    }
}