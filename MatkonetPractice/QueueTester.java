import java.util.Queue;
import java.util.LinkedList;
public class QueueTester {


    public static int size(Queue<Integer> q) //פונקציה שמחזירה גודל של תור
    {
        int count = 0;

        Queue<Integer> temp = new LinkedList<Integer>();

        while(!q.isEmpty())
        {
            count++;

            temp.insert(q.remove());
        }

        while(!temp.isEmpty())
        {
            q.insert(temp.remove());
        }

        return count;

    }
    public static void addNumber(Queue<Integer> q, int x) //פונקציה שמקבלת תור ממוין ומכניסה את הפרמטר איקס למיקום הסידורי שלו בתור
    {
        Queue<Integer> temp = new LinkedList<Integer>();
        int size = size(q);
        int y = 0;
        boolean flag = true;


        for(int i = 0; i<size; i++)
        {
            y = q.remove();
            if(flag && y < x)
            {
                q.insert(x);
                flag = false;
            }

            q.insert(y);
        }
    }

    public static Queue<Integer> twoQueues(Queue<Integer> q1, Queue<Integer> q2) //פונקציה שמחזירה תור חדש מתוך המספרים האי-זוגיים של התור הראשון והמספרים הזוגיים של התור השני
    {
        int size1 = size(q1);
        int size2 = size(q2);
        int x = 0;
        Queue<Integer> temp1 = new LinkedList<Integer>();
        Queue<Integer> temp2 = new LinkedList<Integer>();
        Queue<Integer> new_queue = new LinkedList<Integer>();

        for(int i = 0; i<size1; i++)
        {
            x = q1.remove();

            if(x % 2 != 0)
            {
                temp1.insert(x);
            }

            q1.insert(x);
        }

        for(int j = 0; j<size2; j++)
        {
            x = q2.remove();

            if(x % 2 == 0)
            {
                temp2.insert(x);
            }

            q2.insert(x);
        }

        while(!temp1.isEmpty())
        {
            new_queue.insert(temp1.remove());
        }

        while(!temp2.isEmpty())
        {
            new_queue.insert(temp2.remove());
        }

        return new_queue;
    }

    public static int lastRemove(Queue<Integer> q) //פונקציה שמחזירה ומוחקת את האיבר האחרון בתור
    {
        Queue<Integer> temp = new LinkedList<Integer>();
        int x = 0;
        int y = 0;
        int size = size(q);

        for(int i = 0; i<size - 1; i++)
        {
            x = q.remove();
            temp.insert(x);
        }

        y = q.remove();

        while(!temp.isEmpty())
        {
            q.insert(temp.remove());
        }

        return y;
    }
    public static Queue<Integer> reverseQueue(Queue<Integer> q) //פונקציה שנעזרת בפונקציה הקודמת על מנת להפוך את התור
    {
        int size = size(q);
        int x = 0;
        Queue<Integer> temp = new LinkedList<Integer>();

        for(int i = 0; i<size; i++)
        {
            x = lastRemove(q);
            temp.insert(x);
        }

        while(!temp.isEmpty())
        {
            q.insert(temp.remove());
        }

        return q;
    }
}
