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
    
## 简单工厂的实现:
**简单工厂的定义**：提供一个创建对象实例的功能，而无须关心其具体实现。被创建实例的类型可以是接口、抽象类，也可以是具体的类
 **具体操作接口**
 ```
 public interface Operation {

    void run(String name);
}
 ```
 **实现操作类接口-宝马**
 ```
 public class BaoMa implements Operation {
    @Override
    public void run(String name) {
        System.out.println("宝马");
    }
}
 ```
 **实现操作类接口-奔驰**
 ```
 ublic class BenChi implements Operation {
    @Override
    public void run(String name) {
        System.out.println("奔驰");
    }
}
 ```
 **创建简单工厂**
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
 **测试类**
 ```
 public class SimpleUser {
    public static void main(String[] args){
        SimpleFactory factory = new SimpleFactory();
        factory.factoryCreate("benchi");
    }
}
 ```
