package Problem720;

import java.util.Arrays;
import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.List;
import java.util.Set;

public class problem{
    /**
     * 问题描述：
     * 给一个字符串数组words组成的一本英语词典，返回words中最长的一个单词，该单词是由words词典中其他单词逐步添加一个字母组成
     * 
     * 示例:
     * words = ["w", "wo", "wor", "worl", "world"]
     * Output: "world"
     * 
     * @param args
     */
    public static void main(String[] args) {
        problem problemInstance = new problem();
        String[] aStrings = {"w", "wo", "wor", "worl", "world"};
        String[] bStrings = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        System.out.println(problemInstance.longestWord(aStrings));
        System.out.println(problemInstance.longestWord(bStrings));

    }

    public String longestWord(String[] words){
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String res = "";
        for (String s : words){
            if(s.length() == 1 || set.contains(s.substring(0, s.length() - 1))){
                res = s.length() > res.length() ? s : res;
                set.add(s);
            }
        }

        return res;
    }

}