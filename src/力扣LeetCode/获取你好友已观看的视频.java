package 力扣LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
有 n 个人，每个人都有一个  0 到 n-1 的唯一 id 。
给你数组 watchedVideos和 friends，其中watchedVideos[i]和friends[i] 分别表示id = i的人观看过的视频列表和他的好友列表。
Level 1 的视频包含所有你好友观看过的视频，level 2 的视频包含所有你好友的好友观看过的视频，以此类推。
一般的，Level 为 k 的视频包含所有从你出发，最短距离为 k 的好友观看过的视频。
给定你的 id  和一个 level 值，请你找出所有指定 level 的视频，并将它们按观看频率升序返回。
如果有频率相同的视频，请将它们按名字字典序从小到大排列。

示例 1：
0-->1; 0->2; 1-->3; 2--3(图形)
输入：watchedVideos = [["A","B"],["C"],["B","C"],["D"]], friends = [[1,2],[0,3],[0,3],[1,2]], id = 0, level = 1
输出：["B","C"] 
解释：
你的 id 为 0 ，你的朋友包括：
id 为 1 -> watchedVideos = ["C"] 
id 为 2 -> watchedVideos = ["B","C"] 
你朋友观看过视频的频率为：
B -> 1 
C -> 2

示例 2：
0-->1; 0->2; 1-->3; 2--3(图形)
输入：watchedVideos = [["A","B"],["C"],["B","C"],["D"]], friends = [[1,2],[0,3],[0,3],[1,2]], id = 0, level = 2
输出：["D"]
解释：
你的 id 为 0 ，你朋友的朋友只有一个人，他的 id 为 3 。
 */
public class 获取你好友已观看的视频 {

	public static void main(String[] args) {
		List<List<String>> watchedVideos = new ArrayList<List<String>>();
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		watchedVideos.add(list1);
		List<String> list2 = new ArrayList<>();
		list2.add("C");
		watchedVideos.add(list2);
		List<String> list3 = new ArrayList<>();
		list3.add("B");
		list3.add("C");
		watchedVideos.add(list3);
		List<String> list4 = new ArrayList<>();
		list4.add("D");
		watchedVideos.add(list4);
		int[][] friends = {{1,2},{0,3},{0,3},{1,2}};
		int id = 0;
		int level = 1;
		List<String> list = watchedVideosByFriends(watchedVideos, friends, id, level);
		System.out.println(list);
	}
	
    public static List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	List<Integer> lastLevelIds = new ArrayList<>();
    	lastLevelIds.add(id);
    	map.put(id, 0);
    	List<Integer> currentLevelIds = new ArrayList<>();
    	//计算观看视频级别对应好友的数目，将id加入到map集合
    	for (int i = 1; i <= level; i++) {
            for (int j : lastLevelIds) {
                for (int tmpid : friends[j]) {
                    if (!map.containsKey(tmpid)) {
                        map.put(tmpid,i);
                        currentLevelIds.add(tmpid);
                    }
                }
            }
            lastLevelIds = currentLevelIds;
            currentLevelIds = new ArrayList<Integer>();
    	}
    	//通过上述计算，map={0=0,1=1,2=1}, lastLevelIds=[1,2], currentLevelIds=[]
    	//计算观看人及对应观看视频的数目
    	Map<String,Integer> videoMaps = new HashMap<String, Integer>();
        for (int tmpid : lastLevelIds) {
            for (String video : watchedVideos.get(tmpid)) {
                if (videoMaps.containsKey(video)) {
                    videoMaps.put(video, videoMaps.get(video) + 1);
                } else {
                    videoMaps.put(video, 1);
                }
            }
        }
        //通过上述计算,videoMaps={B=1,C=2}
        //按名字字典序从小到大排列
        Comparator<Map.Entry<String, Integer>> c = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue().intValue() == o2.getValue().intValue()) {
                    return o1.getKey().compareTo(o2.getKey());
                } else {
                    return o1.getValue() - o2.getValue();
                }
            }
        };
        List<Map.Entry<String, Integer>> ls = new ArrayList<Map.Entry<String, Integer>>(videoMaps.entrySet());
        //通过上述计算,ls=[B=1, C=2]
        Collections.sort(ls, c);
        //通过上述计算,ls=[B=1, C=2]
        List<String> r = new ArrayList<>();
        for (Map.Entry<String, Integer> item : ls) {
            r.add(item.getKey());
        }
        //通过上述计算,r=[B, C]
        return r;
    }

}
