 java-basics
 ========================
##  总结java基础知识

## 工厂模式
    什么是工厂模式:
        实现了创建者和调用者分离，
        工厂模式分为:简单工厂、工厂方法、抽象工厂模式

### 工厂模式好处
    工厂模式是我们最常用的实例化对象模式了，是用工厂方法代替new操作的一种模式。
    利用工厂模式可以降低程序的耦合性，为后期的维护修改提供了很大的便利。
    将选择实现类、创建对象统一管理和控制。从而将调用者跟我们的实现类解耦。
    工厂与容器概念.
    
## 一.简单工厂的实现:
**简单工厂的定义**：提供一个创建对象实例的功能，而无须关心其具体实现。被创建实例的类型可以是接口、抽象类，也可以是具体的类</br>
 **1.具体操作接口**
 ```
 public interface Operation {

    void run(String name);
}
 ```
 **2.实现操作类接口-宝马**
 ```
 public class BaoMa implements Operation {
    @Override
    public void run(String name) {
        System.out.println("宝马");
    }
}
 ```
 **3.实现操作类接口-奔驰**
 ```
 ublic class BenChi implements Operation {
    @Override
    public void run(String name) {
        System.out.println("奔驰");
    }
}
 ```
 **4.创建简单工厂**
 ```
 public class SimpleFactory {

    /**
     * 简单工厂的创建
     * @param name
     * @return
     */
    public void factoryCreate(String name){
        if("baoma".equals(name)){
             new BaoMa().run(name);
        }else if("benchi".equals(name)){
            new BenChi().run(name);
        }

    }

}

 ```
 **5.测试类**
 ```
 public class SimpleUser {
    public static void main(String[] args){
        SimpleFactory factory = new SimpleFactory();
        factory.factoryCreate("benchi");
    }
}
 ```
## 二.工厂方法
**1.工厂方法接口**
```
//定义一个工厂接口，功能就是生产汽车
public interface Factory {

    public String getCar();
}
```
**2.定义奔驰工厂**
```
public class BenChi implements Factory {
    @Override
    public String getCar() {
        return "奔驰";
    }
}
```
**3.定义宝马工厂**
```
public class BaoMa implements Factory {
    @Override
    public String getCar() {
        return "宝马";
    }
}
```
**4.测试类**
```
public class MethodUser {
    public static void main(String[] args){
        String car1 = new BenChi().getCar();
        System.out.println("=======car的名字"+car1);
        String car2 = new BaoMa().getCar();
        System.out.println("=======car的名字"+car2);
    }
}
```
## 三.抽象工厂
```
//抽象的人类,为所有的人造人提供一个相同的人造人属性
public abstract class Man {
    public abstract void eat();
}

public class AsiaMan extends Man {  
    @Override
    public void eat() {
    System.out.println("亚洲人用筷子吃");
    }
}

public  class AmericanSuperMan extends Man  {
    @Override
    public void eat() {
    System.out.println("美国人用刀叉吃");
    }
}


//抽象工厂,为所有的不同的工厂提供一个制作人造人的相同方法
public abstract class Factory {
    public abstract *Man* product();
}

public class AsiaManFactory extends Factory {
    @Override
    public Man product() {
        Man anAisaMan = new AsiaMan();
        return anAisaMan;
    }
}

public class AmericanFactory extends Factory {
    @Override
    public Man product() {
        AmericanSuperMan anAmericanSuperMan = new AmericanSuperMan();
        return anAmericanSuperMan;
    }
}   
public static void main(String[] args) {
    
    AsiaManFactory asiaManFactory = new AsiaManFactory();
    AmericanFactory americanFactory = new AmericanFactory();
    
    Man anAmericanSuperMan = americanFactory.product();
    Man anAsia = asiaManFactory.product();
    
    anAsia.eat();
    anAmericanSuperMan.eat();   

}
```



 
 
