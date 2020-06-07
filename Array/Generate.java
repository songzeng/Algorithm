package cn.maxzeng.algorithm.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Generate
 * @Description 杨辉三角 https://leetcode-cn.com/problems/pascals-triangle/
 * @Author max.zeng
 * @Date 2020/6/6 23:24
 */
public class Generate {
    public List<List<Integer>> generate(int numRows) {
        if(numRows <= 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> listOne = new ArrayList<>();
        listOne.add(1);
        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(1);
        listTwo.add(1);
        list.add(listOne);
        if(numRows == 1) {
            return list;
        }
        list.add(listTwo);
        int i = 2;
        int j = 0;
        while(i < numRows) {
            List<Integer> tmpList = new ArrayList<>();
            j = 0;
            while(j <= i) {
                if(j == 0 || j == i) {
                    tmpList.add(1);
                } else {
                    tmpList.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
                j++;
            }
            i++;
            list.add(tmpList);
        }
        return list;
    }

    /**
     * 官方解 写法优雅很多 不过思路是一样的
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        if(numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);

            row.add(1);

            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
