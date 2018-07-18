package Cash;

import java.util.WeakHashMap;

public class Cash {
    WeakHashMap<Integer, String> hm = new WeakHashMap<Integer, String>();

   void addUserInWHM(int age, String userName) {
       hm.put(age,userName);
       }
void getSize(){
    Integer size = hm.size();
    System.out.println("Размер WeakHashMap :"+size);
}
}
