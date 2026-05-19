package com.github.EpochFeng.leetcode100;

import java.util.*;

/**
 * @author 冯纪元
 * @ClassName NumberTwelve
 * @description: TODO
 * @datetime 2026年 05月 19日 16:28
 * @version: 1.0
 */
public class NumberTwelve {
    public static void main(String[] args) {
        String s = "wegdtzwabazduwwdysdetrrctotpcepalxdewzezbfewbabbseinxbqqplitpxtcwwhuyntbtzxwzyaufihclztckdwccpeyonumbpnuonsnnsjscrvpsqsftohvfnvtbphcgxyumqjzltspmphefzjypsvugqqjhzlnylhkdqmolggxvneaopadivzqnpzurmhpxqcaiqruwztroxtcnvhxqgndyozpcigzykbiaucyvwrjvknifufxducbkbsmlanllpunlyohwfsssiazeixhebipfcdqdrcqiwftutcrbxjthlulvttcvdtaiwqlnsdvqkrngvghupcbcwnaqiclnvnvtfihylcqwvderjllannflchdklqxidvbjdijrnbpkftbqgpttcagghkqucpcgmfrqqajdbynitrbzgwukyaqhmibpzfxmkoeaqnftnvegohfudbgbbyiqglhhqevcszdkokdbhjjvqqrvrxyvvgldtuljygmsircydhalrlgjeyfvxdstmfyhzjrxsfpcytabdcmwqvhuvmpssingpmnpvgmpletjzunewbamwiirwymqizwxlmojsbaehupiocnmenbcxjwujimthjtvvhenkettylcoppdveeycpuybekulvpgqzmgjrbdrmficwlxarxegrejvrejmvrfuenexojqdqyfmjeoacvjvzsrqycfuvmozzuypfpsvnzjxeazgvibubunzyuvugmvhguyojrlysvxwxxesfioiebidxdzfpumyon";
        String p = "ozgzyywxvtublcl";
        String s1 = minWindow1(s, p);
        System.out.println(s1);
    }
    public static String minWindow(String s, String t) {
        int min = Integer.MIN_VALUE;
        char[] charArray = t.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char c : charArray) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int start=-1,end=s.length();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }
            if (isbig(map)){
                continue;
            }
            while (left<=i&&isSmall(map)){
                if (i-left<end-start){
                    start = left;
                    end = i;
                }
                char c1 = s.charAt(left);
                if (map.containsKey(c1)){
                    map.put(c1,map.get(c1)+1);
                }
                left++;
            }
        }
        return end-start>s.length()?"":s.substring(start,end+1);
    }
    public static boolean isbig(Map<Character,Integer> map){
        return map.values().stream().anyMatch(x->x>0);
    }
    public static boolean isSmall(Map<Character,Integer> map){
        return map.values().stream().allMatch(x->x<=0);
    }

    public static   String minWindow1(String s, String t) {
        int[] arryS = new int[125];
        int[] arryT = new int[125];
        for (int i = 0; i < t.length(); i++) {
            arryT[t.charAt(i)]++;
        }
        int start = -1,end = s.length();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            arryS[s.charAt(i)]++;
            while (checkArry(arryS,arryT)){
                if (i-left<end-start){
                    start = left;
                    end = i;
                }
                arryS[s.charAt(left)]--;
                left++;
            }
        }
        return end-start>s.length()?"":s.substring(start,end+1);
    }
    public static boolean checkArry(int[] arryS,int[] arryT){
        for (int i = 'a'; i <= 'z'; i++) {
            if (arryS[i]<=arryT[i]){
                return false;
            }
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            if (arryS[i]<=arryT[i]){
                return false;
            }
        }
        return true;
    }
}
