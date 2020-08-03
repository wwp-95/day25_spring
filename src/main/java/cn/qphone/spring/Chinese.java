package cn.qphone.spring;

public class Chinese extends Person {
    public Chinese() {
    }
    public Chinese(String name,int age,String feature){
        setName(name);
        setAge(age);
        setFeature(feature);
    }

    public void showinfo() {
        System.out.println("姓名："+getName()+" 年龄："+getAge()+" 特征:"+getFeature());
    }
}
