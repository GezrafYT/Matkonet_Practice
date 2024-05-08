package MatkonetPractice;
import MatkonetPractice.OOP.BankAccount;

import java.util.Queue;
import java.util.LinkedList;
public class queuePractice {


    public static int size(Queue<Integer> q) //פונקציה שמחזירה גודל של תור
    {
        int count = 0;

        Queue<Integer> temp = new LinkedList<Integer>();

        while(!q.isEmpty())
        {
            count++;

            temp.add(q.remove());
        }

        while(!temp.isEmpty())
        {
            q.add(temp.remove());
        }

        return count;

    }

    public static int sizeDouble(Queue<Double> q) //פונקציה שמחזירה גודל של תור
    {
        int count = 0;

        Queue<Double> temp = new LinkedList<Double>();

        while(!q.isEmpty())
        {
            count++;

            temp.add(q.remove());
        }

        while(!temp.isEmpty())
        {
            q.add(temp.remove());
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
                q.add(x);
                flag = false;
            }

            q.add(y);
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
                temp1.add(x);
            }

            q1.add(x);
        }

        for(int j = 0; j<size2; j++)
        {
            x = q2.remove();

            if(x % 2 == 0)
            {
                temp2.add(x);
            }

            q2.add(x);
        }

        while(!temp1.isEmpty())
        {
            new_queue.add(temp1.remove());
        }

        while(!temp2.isEmpty())
        {
            new_queue.add(temp2.remove());
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
            temp.add(x);
        }

        y = q.remove();

        while(!temp.isEmpty())
        {
            q.add(temp.remove());
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
            temp.add(x);
        }

        while(!temp.isEmpty())
        {
            q.add(temp.remove());
        }

        return q;
    }

    public static void middle(Queue<Double> q)
    {
        int size = sizeDouble(q);
        Queue<Double> temp = new LinkedList<Double>();
        double x = 0;

        if(size % 2 != 0)
        {
            for(int i = 0; i<size / 2; i++)
            {
                temp.add(q.remove());
            }

            q.remove();

            while(!q.isEmpty())
            {
                temp.add(q.remove());
            }

            while(!temp.isEmpty())
            {
                q.add(temp.remove());
            }
        }


        else
        {
            for(int j = 0; j<(size / 2) - 1; j++)
            {
                temp.add(q.remove());
            }

            if(sizeDouble(q) > 2)
            {
                q.remove();
                q.remove();
            }

            while(!q.isEmpty())
            {
                temp.add(q.remove());
            }

            while(!temp.isEmpty())
            {
                q.add(temp.remove());
            }
        }

    }

    public static double totalMoney(Queue<BankAccount> qb)
    {
        double sum = 0;
        BankAccount x;
        while(!qb.isEmpty())
        {
            x = qb.remove();

            sum += x.getMoney();
        }

        return sum;
    }

    public static String bestAccount(Queue<BankAccount> qb)
    {
        double max = 0;
        String targetName = "";
        BankAccount x;

        while(!qb.isEmpty())
        {
            x = qb.remove();
            if(x.getMoney() > max)
            {
                max = x.getMoney();
                targetName = x.getName();
            }
        }

        return targetName;
    }
}
