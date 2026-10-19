import java.util.*;

public class JAVAASS12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> orders = new ArrayList<>();
        LinkedList<String> recentOrders = new LinkedList<>();
        HashSet<String> customers = new HashSet<>();
        TreeSet<String> foodItems = new TreeSet<>();

        int choice;

        do{
            System.out.println();
            System.out.println("===========================");
            System.out.println("           System          ");
            System.out.println("===========================");
            System.out.println("1. Add Order");
            System.out.println("2. Show all orders");
            System.out.println("3. Show recent orders");
            System.out.println("4. show customers");
            System.out.println("5. show food items");
            System.out.println("6. Search order");
            System.out.println("7. Remove order");
            System.out.println("8. show total order");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter food name: ");
                    String food = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    double total = quantity * price;

                    String order = name + " | " + food + " | Qty: " + quantity + " | Rs." + total;

                    orders.add(order);
                    recentOrders.add(order);
                    customers.add(name);
                    foodItems.add(food);

                    System.out.println("Order added Successfully");
                    break;

                case 2:
                    System.out.println();
                    System.out.println("-------All Orders--------");

                    if(orders.size() == 0){
                        System.out.println("No orders found");
                    }else{
                        for (int i = 0; i < orders.size(); i++){
                            System.out.println((i+1) + ". " + orders.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("-------Recent Orders--------");

                    if(recentOrders.size() == 0){
                        System.out.println("No recent orders");
                    }else{
                        for(String item: recentOrders){
                            System.out.println(item);
                        }
                    }
                    break;

                case 4:
                    System.out.println();
                    System.out.println("-------Show Customers--------");

                    if (customers.size() == 0){
                        System.out.println("No customers found");
                    }else{
                        for(String customer: customers){
                            System.out.println(customer);
                        }
                    }
                    break;

                case 5:
                    System.out.println();
                    System.out.println("------Show food items------");

                    if (foodItems.size() == 0){
                        System.out.println("No food items found");
                    }else{
                        for(String foodItem: foodItems){
                            System.out.println(foodItem);
                        }
                    }
                    break;

                case 6:
                    System.out.println();
                    System.out.println("-------Search order-------");

                    System.out.print("enter food name to search");
                    String search = sc.nextLine();

                    boolean found = false;

                    for(String item : orders){
                        if(item.toLowerCase().contains(search.toLowerCase())){
                            System.out.println(item);
                            found = true;
                        }
                    }

                    if (found == false){
                        System.out.println("Order not found.");
                    }

                    break;

                case 7:
                    System.out.println();
                    System.out.println("------Remove Order--------");

                    if(orders.size() == 0 ){
                        System.out.println("No order found");
                        break;
                    }
                    for (int i = 0; i<orders.size(); i++){
                        System.out.println();
                        System.out.println((i+1) + ". " + orders.get(i));
                    }

                    System.out.println("enter order number: ");
                    int number = sc.nextInt();
                    sc.nextLine();

                    if(number >= 1 && number <= orders.size()){
                        String deletedOrder = orders.remove(number-1);

                        recentOrders.remove(deletedOrder);

                        System.out.println("Order removed Successfully");
                    }else{
                        System.out.println("Wrong order number");
                    }
                    break;

                case 8:
                    System.out.println();
                    System.out.println("-------- Show total order ----------");

                    System.out.println("Total orders: " + orders.size());
                    System.out.println("Total customers: " + customers.size());

                    System.out.println("Different food items: " + foodItems.size());
                    break;

                case 9:
                    System.out.println("thank you for choosing us");
                    break;

                default:
                    System.out.println("Please enter a correct number");
            }
        }while(choice != 9);

            sc.close();
    }
}
