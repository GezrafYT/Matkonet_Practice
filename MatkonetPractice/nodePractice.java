package MatkonetPractice;

import java.util.Queue;

public class nodePractice {

    public static int nodeSize(Node<Integer> n)
    {
        int count = 0;

        Node<Integer> pos = n;
        while(pos != null)
        {
            count++;
            pos = pos.getNext();
        }

        return count;
    }

    public static int nodeSum(Node<Integer> n)
    {
        int sum = 0;
        Node<Integer> pos = n;
        while(pos != null)
        {
            sum += pos.getValue();
            pos = pos.getNext();
        }

        return sum;
    }

    public static boolean isExist(Node<Integer> n, int x)
    {
        Node<Integer> pos = n;
        boolean flag = false;

        while(pos != null)
        {
            if(pos.getValue() == x)
            {
                flag = true;
            }

            pos = pos.getNext();
        }

        return flag;
    }

    public static int noKcount(Node<Integer> n, int k)
    {
        Node<Integer> pos = n;
        int count = 0;

        while (pos != null)
        {
            if(pos.getValue() != k)
            {
                count++;
            }

            pos = pos.getNext();
        }

        return count;
    }


    public static void addKdivisibles(Node<Integer> n, int k)
    {
        Node<Integer> pos = n;

        int count = 0;

        while(pos != null)
        {
            if(pos.getValue() % 3 == 0)
            {
                count++;
            }

            pos = pos.getNext();
        }

        pos = n;

        for(int i = 0; i<count; i++)
        {
            pos.setNext(new Node<Integer>(k, null));
            pos = pos.getNext();
        }

    }

    public static void printRecursionNode(Node<Integer> n)
    {
        Node<Integer> pos = n;

        if(pos != null)
        {
            System.out.println(pos.getValue());
            printRecursionNode(pos.getNext());
        }
    }

    public static Node<Integer> partEvenChain(Node<Integer> n)
    {
        Node<Integer> temp = null;
        Node<Integer> pos = n;

        while(pos != null)
        {
            if (pos.getValue() % 2 == 0)
            {
                if (temp == null)
                {
                    temp = new Node<Integer>(pos.getValue());
                }

                else
                {
                    temp.setNext(new Node<Integer>(pos.getValue()));
                    temp = temp.getNext();
                }
            }

            pos = pos.getNext();
        }

        return temp;
    }


    public static Queue<Integer> megaChain(Node<Integer> n, Queue<Integer> q)
    {

        if(n == null)
        {
            return q;
        }

        if (n.getValue() % 2 != 0)
        {
            q.add(n.getValue());
        }

        return megaChain(n.getNext(), q);
    }


    public static Node<Integer> arrToNode(int[] arr)
    {
        if(arr.length > 0) {
            Node<Integer> n = new Node<Integer>(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                n.setNext(new Node<Integer>(arr[i]));
                n = n.getNext();
            }

            return n;
        }

        return null;
    }


    public static void main(String[] args)
    {
        {}
    }
}
