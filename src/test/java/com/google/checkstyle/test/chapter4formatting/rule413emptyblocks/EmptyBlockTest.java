package com.google.checkstyle.test.chapter4formatting.rule413emptyblocks;

import java.io.File;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.google.checkstyle.test.base.BaseCheckTestSupport;
import com.google.checkstyle.test.base.ConfigurationBuilder;
import com.puppycrawl.tools.checkstyle.api.CheckstyleException;
import com.puppycrawl.tools.checkstyle.api.Configuration;
import com.puppycrawl.tools.checkstyle.checks.blocks.EmptyBlockCheck;
import com.puppycrawl.tools.checkstyle.checks.blocks.LeftCurlyCheck;
import com.puppycrawl.tools.checkstyle.checks.blocks.RightCurlyCheck;

public class EmptyBlockTest extends BaseCheckTestSupport{
    
    static ConfigurationBuilder builder;
    
    @BeforeClass
    public static void setConfigurationBuilder() throws CheckstyleException {
        builder = new ConfigurationBuilder(new File("src/"),
                "checkstyle_google_style.xml");
    }

    @Test
    public void emptyTest() throws IOException, Exception {
        
    	String msg = getCheckMessage(EmptyBlockCheck.class, "block.noStmt");
    	
        final String[] expected = {
            "17:29: " + msg,
            "20:42: " + msg,
            "24:29: " + msg,
            };
        
        Configuration checkConfig = builder.getCheckConfig("EmptyBlock");
        String filePath = builder.getFilePath("EmptyBlockInput");
        
        verify(checkConfig, filePath, expected);
    }
}

