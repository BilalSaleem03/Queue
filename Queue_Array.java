public class Queue_Array {

    static class Queue{
        static int [] arr;
        static int rear =-1;
        static int size;
        static int front =-1;
        Queue (int n)
        {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty()
        {
            return (rear==-1 && front==-1);
        }

        public static boolean isFull()
        {
            return ((rear+1) %size) == front;
        }

        public static void add(int data)
        {

            if(isFull())
            {
                System.out.println("full ....");
                return;
            }
            if(front ==-1)
            {
                front =0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;

        }

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Empty array...");
                return -1;
            }

            int ele = arr[front];
            if(rear == front)
            {
                front = rear =-1;
            }
            else{
                front = (front+1)%size;
            }
            return ele;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Empty array..");
                return -1;
            }

            return arr[front];
        }

    } 

    public static void main(String[] args)
    {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
