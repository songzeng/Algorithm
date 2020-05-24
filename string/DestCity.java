package cn.maxzeng.algorithm.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DestCity
 * @Description 旅行终点站
 * @Author max.zeng
 * @Date 2020/5/21 23:36
 */
public class DestCity {
    public String destCity(List<List<String>> paths) {

        List<String> begin = new ArrayList<String>();
        for(int i = 0; i < paths.size(); i++) {
            begin.add(paths.get(i).get(0));
        }
        for(int i = 0; i < paths.size(); i++) {
            if(!begin.contains(paths.get(i).get(1))) {
                return paths.get(i).get(1);
            }
        }
        return "";
    }
}
