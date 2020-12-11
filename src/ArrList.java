import java.util.ArrayList;
public class ArrList {

    public ArrList() {

    }
    public void go() {
        ArrayList<Integer> myList = new ArrayList();
        System.out.println("Добавим чисел в коллекцию");
        myList.add(2);
        myList.add(4);
        int size = myList.size();
        System.out.println("Полученный размер: " + size);
        boolean check = myList.isEmpty();
        if (check == false) {
            System.out.println("Список не пустой");
        } else {
            System.out.println("Список пустой");
        }
        System.out.println(myList.get(0));
        System.out.println(myList);
    }
}
