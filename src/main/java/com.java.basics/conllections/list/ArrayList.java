package com.java.basics.conllections.list;


import com.java.basics.User;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayList {
    /**
     * Arraylist去重顺序一致
     */
    @Test
    public void oneList(){
        List<String> beforeList = new java.util.ArrayList<String>();
        List<User> userList = new java.util.ArrayList<>();

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        user1.setName("小红");
        user1.setAge("18");

        user2.setName("小红");
        user2.setAge("18");

        user3.setName("小东");
        user3.setAge("20");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
       /* beforeList.add("sun");
        beforeList.add("star");
        beforeList.add("moon");
        beforeList.add("earth");
        beforeList.add("sun");
        beforeList.add("earth");*/

        Set<User> middleLinkedHashSet = new LinkedHashSet<User>(userList);

        List<User> afterHashSetList = new java.util.ArrayList(middleLinkedHashSet);

        System.out.println(userList);
        System.out.println(afterHashSetList);
    }
}
