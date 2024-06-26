package MatkonetPractice;

public class Node<T>
{
    private T info;
    private Node<T> next;
    /* הפעולה בונה ומחזירה חוליה שהערך שלה הוא info ואין לה חוליה עוקבת **/
    public Node(T info)
    {
        this.info = info;
        this.next = null;
    }
    /*הפעולה בונה ומחזירה חוליה, שהערך שלה הוא info
      והחוליה העוקבת לה היא החוליה next */
    public Node(T info, Node<T> next)
    {
        this.info = info;
        this.next = next;
    }
    /* הפעולה מחזירה את הערך של החוליה הנוכחית **/
    public T getValue()
    {
        return info;
    }
    /* הפעולה מחזירה את החוליה העוקבת לחוליה הנוכחית **/
    public Node<T> getNext()
    {
        return next;
    }
    /* הפעולה קובעת את ערך החוליה הנוכחית להיות  info **/
    public void setValue(T info)
    {
        this.info = info;
    }
    /* הפעולה קובעת את החוליה העוקבת לחוליה הנוכחית להיות החוליה next **/
    public void setNext(Node<T> next)
    {
        this.next = next;
    }
    /* הפעולה מחזירה מחרוזת המתארת את החוליה הנוכחית */


    public  String ToString()
    {
        return this.info.toString();
    }
}