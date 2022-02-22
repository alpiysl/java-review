package Day3.Tasks;

import Day3.Tasks.Trader;
import Day3.Tasks.Transaction;
import Day3.Tasks.TransactionData;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {

    public static void main(String[] args) {
        //1- find all transactions in 2011 and sort by value
        System.out.println("Task 1 -----");
        TransactionData.getAll().stream().
                filter(transaction -> transaction.getYear() == 2011).
                sorted(comparing(Transaction::getValue)).
                forEach(System.out::println);

        //2- What are all the unique cities where the traders work
        System.out.println("Task 2 -----");
        TransactionData.getAll().stream().
                map(transaction -> transaction.getTrader().getCity()).
                distinct().
                forEach(System.out::println);

        //3- Find all traders from Cambridge and sort them by name
        System.out.println("Task 3 -----");
        TransactionData.getAll().stream().
                map(Transaction::getTrader).
                filter(trader -> trader.getCity().equals("Cambridge")).
                distinct().
                sorted(comparing(Trader::getName)).
                forEach(System.out::println);

        //4- Return a string of all traders names sorted alphabetically
        System.out.println("Task 4 -----");
        String result = TransactionData.getAll().stream().
                map(transaction -> transaction.getTrader().getName()).
                distinct().
                sorted().
                reduce("", (name1, name2) -> name1 + name2 + " ");
        System.out.println("result = " + result);

        //5- Are any traders based in Milan
        System.out.println("Task 5 -----");
        boolean milanMatch = TransactionData.getAll().stream().
                anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println("milanMatch = " + milanMatch);

        //6- Print the values  of all transactions from the traders living in Cambridge
        System.out.println("Task 6 -----");
        TransactionData.getAll().stream().
                filter(transaction -> transaction.getTrader().getCity().equals("Cambridge")).
                map(Transaction::getValue).
                forEach(System.out::println);

        //7- what is the highest value of all the transactions
        System.out.println("Task 7 -----");
        Optional<Integer> highest = TransactionData.getAll().stream().
                map(Transaction::getValue).
                reduce(Integer::max);
        System.out.println("highest = " + highest);
        System.out.println("highest = " + highest.get());

        //8-Find the transaction with the smallest value
        System.out.println("Task 7 -----");
        Optional<Transaction> sValue= TransactionData.getAll().stream().
                reduce((t1,t2) -> t1.getValue()< t2.getValue() ? t1 : t2);
        System.out.println("sValue.get() = " + sValue.get());

        Optional<Transaction> sValue2= TransactionData.getAll().stream().
                min(comparing(Transaction::getValue));
        System.out.println("sValue2.get() = " + sValue2.get());

    }
}
