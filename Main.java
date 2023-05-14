import java.io.File;
import java.util.List;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //Refact1: Eliminació de variable sense usos
            /*
            String p = "Proves";
             */
            int opcio;
            do {
                System.out.println("1. ");
                System.out.println("2. ");
                System.out.println("3. ");
                System.out.println("4. ");
                System.out.println("5. ");
                System.out.println("0. Acabar");

                opcio = scan.nextInt();
                scan.nextLine();
                String intro = "intro: ";
                switch (opcio) {
                    //Refact2: Substitució de cadena redundant per variable
                    /*
                    case 1:
                        System.out.println("intro: ");
                        int num1 = scan.nextInt();
                        System.out.println("intro: ");
                        int num2 = scan.nextInt();
                        if (max(num1,num2)) {
                            System.out.println("aaa");
                        }
                     */
                    case 1:
                        System.out.println(intro);
                        int num1 = scan.nextInt();
                        System.out.println(intro);
                        int num2 = scan.nextInt();
                        //Refact3:Clarificació de codi
                        /*if (max(num1,num2)) {
                            System.out.println("aaa");
                        }

                        else System.out.println("bbb");
                         */
                        if (max(num1,num2)) {
                            System.out.println("A és major que B");
                        }

                        else System.out.println("B és major que A");
                        break;
                    case 2:
                        //Refact4:Clarificació de codi
                        /*
                        double a=2;
                        double b=3;
                        double c=1;
                         */
                        calcEquacioSegongrau(2, 3, 1);
                        break;
                    case 3:
                        List<OrderLineItem> lineItems = null;
                        Order asd = new Order(lineItems, 5.5);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
                }
            } while (opcio != 0);
        }
        //Refact5: Inline Code
        /*
        public static boolean max(int a, int b) {
            if(a > b) {
                return true;
            } else if (a == b) {
                return false;
            } else {
                return false;
            }
        }
         */
        public static boolean max(int a, int b) {
            if(a > b) {
                return true;
            } else {
                return false;
            }
        }

        //Refact6: Renombrar variable
        public static void calcEquacioSegongrau(double a, double b, double c) {
            //double D = b * b - 4 * a * c;
            double arrel = b * b - 4 * a * c;
            if (arrel > 0) {
                double x1, x2;
                x1 = (-b - Math.sqrt(arrel)) / (2 * a);
                x2 = (-b + Math.sqrt(arrel)) / (2 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
            else if (arrel == 0) {
                double x;
                x = -b / (2 * a);
                System.out.println("x = " + x);
            }
            else {
                System.out.println("Equation has no roots");
            }
        }

        //Refact7: Extracció de classe
        /*
        public static class Human {
            private String name;
            private String age;
            private String country;
            private String city;
            private String street;
            private String house;
            private String quarter;

            public String obtenirAdrecaCompleta() {
                //StringBuilder result = new StringBuilder();
                StringBuilder adreça = new StringBuilder();
                return adreça
                        .append(country)
                        .append(", ")
                        .append(city)
                        .append(", ")
                        .append(street)
                        .append(", ")
                        .append(house)
                        .append(" ")
                        .append(quarter).toString();
            }
        }
         */


        //Refact8: Extracció de classe
        /*
        public static class Order {
            private List<OrderLineItem> lineItems;
            private double taxRate;

            public Order(List<OrderLineItem> lineItems, double taxRate) {
                this.lineItems = lineItems;
                this.taxRate = taxRate;
            }

            public double calculateTotalPrice() {
                double subtotal = 0.0;
                for (OrderLineItem item : lineItems) {
                    subtotal += item.getPrice();
                }
                double tax = subtotal * taxRate;
                return subtotal + tax;
            }
        }
         */

        //Refact9: Extracció de classe
        /*
        public class OrderLineItem {
            private String productName;
            private int quantity;
            private double price;

            public OrderLineItem(String productName, int quantity, double price) {
                this.productName = productName;
                this.quantity = quantity;
                this.price = price;
            }
            public double getPrice() {
                return price * quantity;
            }
        }
         */

        //Refact10: Extracció de classe
        /*
        public class Customer {
            private String firstName;
            private String lastName;

            public Customer(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }
         */
    }

