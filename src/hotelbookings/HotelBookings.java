
package hotelbookings;

import java.util.Scanner;

public class HotelBookings {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean error = false;
        int board = 0;
        int bed = 0;
        int cater = 0;
        System.out.println("How many single rooms will you like?");
        int single = input.nextInt();
        if((single < 0)||(single %1 != 0)){
            System.out.println("Incorrect value, try again");
            error = true;
            while(error == true){
                single = input.nextInt();
                if((single < 0)||(single %1 != 0)){
                    System.out.println("Incorrect value, try again");
                } else {
                    error = false;
                }
            }
        }
        System.out.println("How many double rooms will you like?");
        int doble = input.nextInt();
                if((doble < 0)||(doble %1 != 0)){
            System.out.println("Incorrect value, try again");
            error = true;
            while(error == true){
                doble = input.nextInt();
                if((doble < 0)||(doble %1 != 0)){
                    System.out.println("Incorrect value, try again");
                } else {
                    error = false;
                }
            }
        }
                System.out.println("How many family rooms will you like?");
                System.out.println("");
                System.out.println("- Family rooms have 4 beds");
                int family = input.nextInt();
            if((family < 0)||(family %1 != 0)){
            System.out.println("Incorrect value, try again");
            error = true;
            while(error == true){
                family = input.nextInt();
                if((family < 0)||(family %1 != 0)){
                    System.out.println("Incorrect value, try again");
                } else {
                    error = false;
                }
            }
        }
            System.out.println("What type of board will you like?");
            System.out.println("");
            System.out.println("A - Self Catered");
            System.out.println("");
            System.out.println("B - Half Board");
            System.out.println("");
            System.out.println("C - Full Board");
            char ans = input.next().charAt(0);
            if((ans != 'a')&&(ans != 'b')&&(ans != 'c')){
            System.out.println("Incorrect value, try again");
            error = true;
            while(error == true){
                ans = input.next().charAt(0);
                if((ans != 'a')&&(ans != 'b')&&(ans != 'c')){
                    System.out.println("Incorrect value, try again");
                } else {
                    error = false;
                }
    }
    
}
            System.out.println("How many days will you be staying for?");
            System.out.println("");
            System.out.println("Stay longer than a week and you get 20% off");
            int days = input.nextInt();
            if((days < 0)||(days %1 != 0)){
            System.out.println("Incorrect value, try again");
            error = true;
            while(error == true){
                days = input.nextInt();
                if((days < 0)||(days %1 != 0)){
                    System.out.println("Incorrect value, try again");
                } else {
                    error = false;
                }
            }
        }
            
            if(single > 0){
                System.out.print("Singles: ");
                System.out.println("£" + single * 50 * days);
                System.out.println("");
                bed = single * 50 * days;
            }
            if(doble > 0){
                System.out.print("Doubles: ");
                System.out.println("£" + doble * 75 * days);
                System.out.println("");
                bed = bed + doble * 75 * days;
            }
            if(family > 0){
                System.out.print("Families: ");
                System.out.println("£" + family * 105 * days);
                System.out.println("");
                bed = bed + family * 105 * days;
            }
            if(ans == 'a'){
                System.out.print("Self Catering: ");
                System.out.println("£0");
                System.out.println("");
                cater = 0;
            } else if(ans == 'b'){
                System.out.print("Half Boarded: ");
                System.out.println("£" + 10 * days);
                System.out.println("");
                cater = 10 * days;
            } else {
                System.out.print("Full Boarded: ");
                System.out.println("£" + 20 * days);
                System.out.println("");
                cater = 20 * days;
            }
            if(days < 8){
            int price = bed + cater;
            System.out.println("Total price: £" + price);
            } else {
                int price = bed + cater;
                System.out.println("Price: £" + price);
                int discount = price / 5;
                price = price - discount;
                System.out.println("Discount: -£" + discount);
                System.out.println("Total price: £" + price);
            }
            
}
}
