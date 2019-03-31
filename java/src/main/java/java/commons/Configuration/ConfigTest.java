package java.commons.Configuration;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * @author dz on 2018/11/4.
 */
public class ConfigTest {

    /**
     * 用来帮助处理配置文件的，支持很多种存储方式。
     * 1. Properties files
     * 2. XML documents
     * 3. Property list files (.plist)
     * 4. JNDI
     * 5. JDBC Datasource
     * 6. System properties
     * 7. Applet parameters
     * 8. Servlet parameters
     *
     * //举一个Properties的简单例子
     * # usergui.properties
     * colors.background = #FFFFFF
     * colors.foreground = #000080
     * window.width = 500
     * window.height = 300
     *
     * @param args
     * @throws ConfigurationException
     */
    public static void main(String[] args) throws ConfigurationException {
        PropertiesConfiguration config = new PropertiesConfiguration("usergui.properties");
        config.setProperty("colors.background", "#000000");
        config.save();

        config.save("usergui.backup.properties");//save a copy
        String str;
        str = config.getString("colors.background");
    }
}
