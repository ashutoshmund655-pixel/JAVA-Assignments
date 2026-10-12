import java.util.*;

class PassengerInfo {
    int id;
    String name;
    int age;
    String seat;

    PassengerInfo(
        int id,
        String name,
        int age,
        String seat
    ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.seat = seat;
    }

    void display() {

        System.out.println(
            "ID: " + id +
            " | Name: " + name +
            " | Age: " + age +
            " | Seat: " + seat
        );
    }
}

public class TrainReservation {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<PassengerInfo> passengers =
        new ArrayList<>();

    static int nextId = 1;

    static String generateSeat() {

        int seatNumber =
            passengers.size() + 1;

        return "S" + seatNumber;
    }

    static void bookTicket() {

        if (passengers.size() >= 50) {

            System.out.println(
                "Train is fully booked."
            );

            return;
        }

        sc.nextLine();

        System.out.print(
            "Passenger name: "
        );

        String name = sc.nextLine();

        System.out.print(
            "Age: "
        );

        int age = sc.nextInt();

        String seat = generateSeat();

        passengers.add(
            new PassengerInfo(
                nextId++,
                name,
                age,
                seat
            )
        );

        System.out.println(
            "\nTicket booked successfully."
        );

        System.out.println(
            "Seat Number: " + seat
        );
    }

    static void cancelTicket() {

        System.out.print(
            "Enter passenger ID: "
        );

        int id = sc.nextInt();

        for (PassengerInfo p : passengers) {

            if (p.id == id) {

                passengers.remove(p);

                System.out.println(
                    "Ticket cancelled."
                );

                return;
            }
        }

        System.out.println(
            "Passenger not found."
        );
    }

    static void showPassengers() {

        if (passengers.isEmpty()) {

            System.out.println(
                "No passengers."
            );

            return;
        }

        System.out.println(
            "\n========== PASSENGERS =========="
        );

        for (PassengerInfo p : passengers) {
            p.display();
        }
    }

    static void searchPassenger() {

        sc.nextLine();

        System.out.print(
            "Enter passenger name: "
        );

        String name = sc.nextLine();

        boolean found = false;

        for (PassengerInfo p : passengers) {

            if (p.name.equalsIgnoreCase(name)) {

                p.display();
                found = true;
            }
        }

        if (!found) {

            System.out.println(
                "Passenger not found."
            );
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println(
                "\n========== TRAIN RESERVATION =========="
            );

            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Show Passengers");
            System.out.println("4. Search Passenger");
            System.out.println("0. Exit");

            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bookTicket();
                    break;

                case 2:
                    cancelTicket();
                    break;

                case 3:
                    showPassengers();
                    break;

                case 4:
                    searchPassenger();
                    break;

                case 0:
                    System.out.println(
                        "Reservation system closed."
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice."
                    );
            }

        } while (choice != 0);
    }
}


















































