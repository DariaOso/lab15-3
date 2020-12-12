import java.util.ArrayList;
public class ArrList {

    public ArrList() {

    }
    public void go() {
        ArrayList<String> myList = new ArrayList();
        System.out.println("Добавим имен котиков в базу питомника");
        myList.add("Ron");
        myList.add("Meow");
        myList.add("Kit");

        int size = myList.size();
        System.out.println("Количество котиков: " + size);
        boolean check = myList.isEmpty();
        if (check == false) {
            System.out.println("Список не пустой");
        } else {
            System.out.println("Список пустой");
        }
        myList.remove(0);

        System.out.println(myList);
    }
}
