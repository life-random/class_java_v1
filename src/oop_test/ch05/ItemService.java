package oop_test.ch05;

public class ItemService {
    private ItemDao dao = new MemoryItemDao();

    public void obtainItem(String name, String grade){
        dao.insert(new Item(name, grade));
    }
    public void printInventory(){
        System.out.println("---[아이템 목록]---");
        for (Item item :dao.findAll()){
            System.out.println("["+item.getGrade()+"] - " + item.getName());
        }
    }
}
