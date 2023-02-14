public class CarTest {
    public static void main(String[] args) {
        
        //make a car, assign values
        Car client1Car = new Car();
        client1Car.year = 2001;
        client1Car.make = "Honda";
        client1Car.model = "Civic";
        client1Car.color = "White";

        //make another car, assign variables
        Car client2Car = new Car();
        client2Car.year = 2013;
        client2Car.make = "Toyota";
        client2Car.model = "Tacoma";
        client2Car.color = "Grey";

        System.out.println("----Car 1 Info----");
        System.out.printf("Car one is a %s, %s %s and is painted %s. \n",
        client1Car.year, client1Car.make, client1Car.model, client1Car.color);

        System.out.println("----Car 2 Info----");
        System.out.printf("Client 2's car is a %s, %s %s and is painted %s. \n ",
        client2Car.year, client2Car.make, client2Car.model, client2Car.color);
    }
}
