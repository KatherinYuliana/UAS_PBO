package Modul5;

public interface MessageStateInterface {
    final int read = 0;
    final int unread = 2;

    abstract void printMethodReadMessage(); // syntax abstract bisa dihapus karena abstract by default

    abstract void printMethodUnreadMessage(); // syntax abstract bisa dihapus karena abstract by default
}
