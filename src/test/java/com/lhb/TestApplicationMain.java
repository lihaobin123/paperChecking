package com.lhb;

import com.lhb.util.FileUtil;
import com.lhb.util.TokenizerUtil;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class TestApplicationMain {

    private static final String path = "orig.txt";
    private static final String outPath = "C:\\Users\\86155\\Desktop\\大三上\\软件工程\\";

    //相同性测试
    @Test
    public void testSame(){
        String path2 = "orig_add.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( this.path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( this.outPath+"res.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }

    //原先文本和增加文本的对比
    @Test
    public void testAdd(){
        String path2 = "orig_add_2.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( this.path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( this.outPath+"res2.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }

    //原先文本和删除部分文字的文本对比
    @Test
    public void testDelete(){
        String path2 = "orig_delete.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( this.path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( this.outPath+"res_delete.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }

    @Test
    public void testDelete_2(){
        String path2 = "orig_delete2.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( this.path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( this.outPath+"res_delete2.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }

    @Test
    public void test6(){
        String path2 = "orig6.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( this.path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( this.outPath+"res6.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }

    @Test
    public void test7(){
        String path2 = "orig7.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( this.path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( this.outPath+"res7.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }

    @Test
    public void test8(){
        String path2 = "orig8.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( this.path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( this.outPath+"res8.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }

    @Test
    public void test9(){
        String path2 = "orig9.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( this.path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( this.outPath+"res9.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }

    @Test
    public void test10(){
        String path2 = "orig10.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( this.path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( this.outPath+"res10.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }
}