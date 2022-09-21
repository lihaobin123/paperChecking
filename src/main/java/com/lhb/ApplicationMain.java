package com.lhb;

import com.lhb.util.FileUtil;
import com.lhb.util.TokenizerUtil;

import java.util.List;
import java.util.Map;

/**
 * @Description main方法
 * @Author LHB
 **/
public class ApplicationMain {
    public static void main(String[] args) {
//        String[] arg = {"orig.txt","orig_add.txt","C:\\Users\\86155\\Desktop\\大三上\\软件工程\\res.txt"};
        String file1 = args[0];
        String file2 = args[1];
        Map<String, List<Integer>> stringListOriginMap = TokenizerUtil.CountWord(file1);
        Map<String, List<Integer>> stringListCopyMap = TokenizerUtil.CountWord(file2);
        Double similarity = TokenizerUtil.CosCount(stringListOriginMap, stringListCopyMap);
        System.out.println("文本相似度为" + similarity);
        FileUtil.writeFile(args[2], String.valueOf(similarity));
    }
}
