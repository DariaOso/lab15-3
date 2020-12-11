
    import java.util.LinkedList;
    public class LinkList {

        public void go() {
            LinkedList<String> name = new LinkedList<>();
            System.out.println("Добавим имен в коллекцию");
           name.add("Kim");
            name.add("Day");
            name.add("Blue");
            int size = name.size();
            System.out.println("Полученный размер: " + size);
            boolean check = name.isEmpty();
            if (check == false) {
                System.out.println("Список не пустой");
            } else {
                System.out.println("Список пустой");
            }
            name.addLast("Don");

            System.out.println(name);
        }
    }
