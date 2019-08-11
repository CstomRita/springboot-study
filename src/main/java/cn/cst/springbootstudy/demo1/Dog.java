package cn.cst.springbootstudy.demo1;

import java.util.List;
import java.util.Map;

/**
 * @ Author     ：ChangSiteng
 * @ Date       ：Created in 15:33 2019-08-11
 * @ Description：Dog
 * @ Modified By：
 * @Version: $
 */
public class Dog {
    private String dogName;
    private Integer dogAge;
    private Map<String,Object> dogMaps;
    private List<Object> dogList;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public Integer getDogAge() {
        return dogAge;
    }

    public void setDogAge(Integer dogAge) {
        this.dogAge = dogAge;
    }

    public Map<String, Object> getDogMaps() {
        return dogMaps;
    }

    public void setDogMaps(Map<String, Object> dogMaps) {
        this.dogMaps = dogMaps;
    }

    public List<Object> getDogList() {
        return dogList;
    }

    public void setDogList(List<Object> dogList) {
        this.dogList = dogList;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogAge=" + dogAge +
                ", dogMaps=" + dogMaps +
                ", dogList=" + dogList +
                '}';
    }
}
