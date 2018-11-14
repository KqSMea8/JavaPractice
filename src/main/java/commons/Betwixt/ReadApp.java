package commons.Betwixt;

public class ReadApp {

    public static final void main(String args[]) throws Exception{  
        /*// 先创建一个XML，由于这里仅是作为例子，所以我们硬编码了一段XML内容
        StringReader xmlReader = new StringReader(  
        "<?xml version=’1.0′ encoding=’UTF-8′ ?> <person><age>25</age><name>James Smith</name></person>");  
        //创建BeanReader  
        BeanReader beanReader  = new BeanReader();  
        //配置reader  
        beanReader.getXMLIntrospector().getConfiguration().setAttributesForPrimitives(false);  
        beanReader.getBindingConfiguration().setMapIDs(false);  
        //注册beans，以便betwixt知道XML将要被转化为一个什么Bean  
        beanReader.registerBeanClass("person", PersonBean.class);  
        //现在我们对XML进行解析  
        PersonBean person = (PersonBean) beanReader.parse(xmlReader);  
        //输出结果  
        System.out.println(person); */

    }
}