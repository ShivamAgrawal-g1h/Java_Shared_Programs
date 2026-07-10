package Library.MAP;

import java.util.HashMap;

class UserData{
    private HashMap<Integer,Integer> map;
    UserData(){
        map = new HashMap<>();
    }
    void set(int id, int balance){
        map.put(id,balance);
    }
    int get(int id){
        return map.getOrDefault(id,-1);
    }
}