/*
 * Name: Erfan Emami
 * ASU ID: 121 525 2727
 * Assignment: Week 7 homework includes creating cse360assignment02, creating a local repository, and committing it to GitHub. This is to practice
 * version control
 */

package cse360assignment02;

public class AddingMachine
{

    private int total;
    private String history;

    public AddingMachine ()
    {
        history = "0";
        total = 0;  // not needed - included for clarity
    }

    /**
     * total added/subtracted
     */
    public int getTotal ()
    {
        return total;
    }

    /**
     * @param value value gets added to total
     */
    public void add (int value)
    {
        total += value;
        history += " + " + value;
    }

    /**
     * @param value value gets subtracted from total
     */
    public void subtract (int value)
    {
        total -= value;
        history += " - " + value;
    }

    /**
     * clear transaction history and total
     */
    public void clear()
    {
        history = "0"; // clear history
        total = 0; // reset total
    }

    /**
     * return transaction history
     */
    public String toString ()
    {
        return history;
    }

}
