package jcommander;

import com.beust.jcommander.JCommander;
import org.testng.Assert;

import java.util.Arrays;

/**
 *
 * @author dz on 2018/9/4.
 */

public class Test {
    public static void main(String[] args) {
        JCommanderTest jct = new JCommanderTest();
        String[] argv = { "-log", "2", "-groups", "unit1,unit2,unit3",
                "-debug", "-Doption=value", "a", "b", "c" };
        new JCommander(jct, argv);

        Assert.assertEquals(2, jct.verbose.intValue());
        Assert.assertEquals("unit1,unit2,unit3", jct.groups);
        Assert.assertEquals(true, jct.debug);
        Assert.assertEquals("value", jct.dynamicParams.get("option"));
        Assert.assertEquals(Arrays.asList("a", "b", "c"), jct.parameters);

        System.out.println("over ");
    }
}
