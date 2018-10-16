package xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

public class Test
{
	public static void main(String[] args)
	{
		Person bean=new Person("张三",19);
		XStream xstream = new XStream();
		//XML序列化
		String xml = xstream.toXML(bean);
		System.out.println(xml);
		//XML反序列化
		bean=(Person)xstream.fromXML(xml);
		System.out.println(bean);
		
		xstream = new XStream(new JettisonMappedXmlDriver());
		xstream.setMode(XStream.NO_REFERENCES);
		//Json序列化
		String json=xstream.toXML(bean);
		System.out.println(json);
		//Json反序列
		bean=(Person)xstream.fromXML(json);
		System.out.println(bean);
	}
}