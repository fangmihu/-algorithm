import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/14
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code207 {

    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            //bfs
            int[] mark = new int[numCourses];
            //记录依赖这个节点的数量
            ArrayList[] arr = new ArrayList[numCourses];
            for(int i = 0; i < arr.length; i ++){
                arr[i] = new ArrayList();
            }
            for(int i = 0; i <prerequisites.length; i++){
                arr[prerequisites[i][0]].add(prerequisites[i][1]);
                mark[prerequisites[i][1]] ++;
            }
            int res = 0;
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < mark.length; i ++){
                if (mark[i] == 0){
                    queue.add(i);
                    res ++;
                }
            }
            while (!queue.isEmpty()){
                int i = queue.poll();
                for (int j = 0; j < arr[i].size(); j++){
                    mark[(int) arr[i].get(j)] --;
                    if(mark[(Integer) arr[i].get(j)] == 0){
                        queue.add((Integer) arr[i].get(j));
                        res ++;
                    }
                }
            }
            return  res == numCourses;
        }
    }
}
