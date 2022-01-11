import coffee.Barista;
import coffee.Customer;
import coffee.Menu;

public class Main {
    public static void main(String[] args) {

        //테스트 카페
        Barista barista = new Barista();
        Menu menu = new Menu();

        //손님 입장
        Customer customer = new Customer();
        customer.order("녹차", menu, barista);
    }
}
