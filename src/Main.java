//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public static void main(String[] args) {

    public class Client {
        private int idNumber;
        private String firstName;
        private String lastName;
        private int age;
        private Card card;

        public Client() {}

        public Client(int idNumber, String firstName, String lastName, int age, Card card) {
            this.idNumber = idNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.card = card;
        }

        public int getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(int idNumber) {
            this.idNumber = idNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Card getCard() {
            return card;
        }

        public void setCard(Card card) {
            this.card = card;
        }

        public void displayClientDetails() {
            System.out.println("Client ID: " + idNumber);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Age: " + age);
            if (card != null) {
                card.displayCardDetails();
            }
        }

        public void displayCardInformationOnly() {
            if (card != null) {
                card.displayCardDetails();
            }
        }
    }

    public class Card {
        private int cardNumber;
        private double balance;
        private int pin;
        private boolean status;

        public Card() {}

        public Card(int cardNumber, double balance, int pin, boolean status) {
            this.cardNumber = cardNumber;
            this.balance = balance;
            this.pin = pin;
            this.status = status;
        }

        public int getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(int cardNumber) {
            this.cardNumber = cardNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public int getPin() {
            return pin;
        }

        public void setPin(int pin) {
            this.pin = pin;
        }

        public boolean getStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public void displayCardDetails() {
            System.out.println("Card Number: " + cardNumber);// display method for card
            System.out.println("Balance: " + balance);
            System.out.println("PIN: " + pin);
            System.out.println("Status: " + status);
        }

        public void updateCardAttributes() {
            this.status = true;
            this.pin = 45678;
            displayCardDetails();
        }
    }

// Client object
    public class Main {
        public static void main(String[] args) {
            Card card = new Card(12345678, 1000.00, 1234, false);
            Client client = new Client(1, "John", "Smith", 30, card);

            client.displayClientDetails();
        }
    }



    public class Main {
        public static void main(String[] args) {
            Client client = inputClientDetails();
            client.displayClientDetails();
        }

        public static Client inputClientDetails() {
            Scanner scanner = new Scanner(System.in);
            Client client = new Client();
            Card card = new Card();

            System.out.print("Enter Client ID: ");
            client.setIdNumber(scanner.nextInt());
            scanner.nextLine();  // Consume newline

            System.out.print("Enter First Name: ");
            client.setFirstName(scanner.nextLine());

            System.out.print("Enter Last Name: ");
            client.setLastName(scanner.nextLine());

            System.out.print("Enter Age: ");
            client.setAge(scanner.nextInt());

            System.out.print("Enter Card Number: ");
            card.setCardNumber(scanner.nextInt());

            System.out.print("Enter Balance: ");
            card.setBalance(scanner.nextDouble());

            System.out.print("Enter PIN: ");
            card.setPin(scanner.nextInt());

            System.out.print("Enter Status (true/false): ");
            card.setStatus(scanner.nextBoolean());

            client.setCard(card);

            return client;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Client client = inputClientDetails();
            client.displayClientDetails();

            System.out.println("Modifying card attributes...");
            client.getCard().updateCardAttributes();
        }
    }




    public class Main {
        public static void main(String[] args) {
            Client client = inputClientDetails();
            client.displayClientDetails();
        }

        public static Client inputClientDetails() {
            Scanner scanner = new Scanner(System.in);
            Client client = new Client();
            Card card = new Card();

            System.out.print("Enter Client ID: ");
            client.setIdNumber(validateInput(scanner));

            System.out.print("Enter First Name: ");
            client.setFirstName(scanner.nextLine());

            System.out.print("Enter Last Name: ");
            client.setLastName(scanner.nextLine());

            System.out.print("Enter Age: ");
            int age = validateInput(scanner);
            if (age < 0) {
                System.out.println("Age cannot be negative. Setting age to 0.");
                age = 0;
            }
            client.setAge(age);

            System.out.print("Enter Card Number: ");
            card.setCardNumber(validateInput(scanner));

            System.out.print("Enter Balance: ");
            double balance = validateDoubleInput(scanner);
            if (balance < 0) {
                System.out.println("Balance cannot be negative. Setting balance to 0.0.");
                balance = 0.0;
            }
            card.setBalance(balance);

            System.out.print("Enter PIN: ");
            card.setPin(validateInput(scanner));

            System.out.print("Enter Status (true/false): ");
            card.setStatus(scanner.nextBoolean());

            client.setCard(card);

            return client;
        }

        public static int validateInput(Scanner scanner) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            return scanner.nextInt();
        }

        public static double validateDoubleInput(Scanner scanner) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            return scanner.nextDouble();
        }
    }
