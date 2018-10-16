package options;

import org.apache.commons.cli.*;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/2.
 */

public class OptionsTest {



    public static void main(String[] args) throws ParseException {
        Options options = new Options();
        options.addOption("e", "email", true, "Which email will send to")
                .addOption("d", "jobDir", true, "Job desc file directory");

        CommandLineParser paser = new DefaultParser();
        CommandLine cmd = paser.parse(options, args);


        String email = cmd.getOptionValue("email");
        String jobDescPath = cmd.getOptionValue("d");

        System.out.println("email : " + email);
        System.out.println("jobDescPath : " + jobDescPath);

    }
}
