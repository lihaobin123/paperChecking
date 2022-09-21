package com.lhb;

import com.lhb.util.FileUtil;
import com.lhb.util.TokenizerUtil;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class TestApplicationMain {
    //相同性测试
    @Test
    public void testSame(){
        String path = "orig.txt";
        String path2 = "orig_add.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( "C:\\Users\\86155\\Desktop\\大三上\\软件工程\\res.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }
}
