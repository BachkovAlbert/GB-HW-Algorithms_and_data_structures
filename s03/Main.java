// Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).

package s03;

public class Main {

    public static void main(String[] args) {
        ListD L = new ListD();
        for (int i = 3; i <= 7; i++)
            L.add(i);

        L.print();
        L.reversal();
        L.print();

    }
}
