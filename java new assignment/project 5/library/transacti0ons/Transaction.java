package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public void issueBook(Book b, Member m) {
        System.out.println("Issued Book '" + b.title + "' to Member " + m.name);
    }
}
