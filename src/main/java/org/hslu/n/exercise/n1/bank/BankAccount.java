package org.hslu.n.exercise.n1.bank;

/**
 * Einfaches Bankkonto, das nur den Kontostand beinhaltet.
 */
public final class BankAccount {

    private int balance;

    /**
     * Erzeugt ein Bankkonto mit einem Anfangssaldo.
     *
     * @param balance Anfangssaldo
     */
    public BankAccount(final int balance) {
        this.balance = balance;
    }

    /**
     * Erzeugt ein Bankkonto mit Kontostand Null.
     */
    public BankAccount() {
        this(0);
    }

    /**
     * Gibt den aktuellen Kontostand zurück.
     *
     * @return Kontostand.
     */
    public int getBalance() {
        return this.balance;
    }

    /**
     * Addiert zum bestehen Kontostand einen Betrag hinzu.
     *
     * @param amount Einzuzahlender Betrag
     */
    public synchronized void deposite(final int amount) {
        this.balance += amount;
    }

    /**
     * Überweist einen Betrag vom aktuellen Bankkonto an ein Ziel-Bankkonto.
     *
     * @param target Bankkonto auf welches der Betrag überwiesen wird.
     * @param amount zu überweisender Betrag.
     */
    public void transfer(final BankAccount target, final int amount) {
        removeFromAccount(amount);
        target.deposite(amount);
    }

    private synchronized void removeFromAccount(final int amount) {
        this.balance -= amount;
    }
}
