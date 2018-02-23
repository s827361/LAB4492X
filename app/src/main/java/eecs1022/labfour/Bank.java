package eecs1022.labfour;

/**
 * Created by user on 2/23/18.
 */
public class Bank
{
    Client client1;
    Client client2;
    Client client3;
    public Bank ( Client n1, Client n2, Client n3){
        client1 = n1;
        client2 = n2;
        client3 = n3;

    }
    public String toString() {
        String b1 = String.format("%.2f", client1.balance);
        String b2 = String.format("%.2f", client2.balance);
        String b3 = String.format("%.2f", client3.balance);
        return "Client " + client1.name + " has balance $" + b1
                + "\nClient " + client2.name + " has balance $" + b2
                + "\nClient " + client3.name + " has balance $" + b3;
    }
    public void trans(String service, String from, String to, double amount) {
        switch (service){
            case "withdraw":
                switch (from){
                    case "client1":
                        client1.balance -= amount;
                        break;
                    case "client2":
                        client2.balance -= amount;
                        break;
                    case "client3":
                        client3.balance -= amount;
                        break;
                }
                break;
            case "deposit":
                switch(to){
                    case "client1":
                        client1.balance += amount;
                        break;
                    case "client2":
                        client2.balance += amount;
                        break;
                    case "client3":
                        client3.balance += amount;
                        break;
                }
                break;
            case "transfer":
                switch (from){
                    case "client1":
                        client1.balance -= amount;
                        break;
                    case "client2":
                        client2.balance -= amount;
                        break;
                    case "client3":
                        client3.balance -= amount;
                        break;
                }

            switch(to){
                case "client1":
                    client1.balance += amount;
                    break;
                case "client2":
                    client2.balance += amount;
                    break;
                case "client3":
                    client3.balance += amount;
                    break;
            }
            break;
        }

    }
}
