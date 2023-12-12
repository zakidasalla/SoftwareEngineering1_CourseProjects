package singletonPattern;

import java.util.*;

public class QueueSys {

    private static QueueSys instance;
    private String deskStation;
    private boolean isDeskStation;
    private Deque<Integer> queue = new LinkedList<>();

    private QueueSys() {

    }

    public static synchronized QueueSys getInstance() {
        if (instance == null)
            instance = new QueueSys();
        return instance;
    }

    public synchronized boolean isDeskStation() {
        return isDeskStation;
    }

    public synchronized void addNumberToQueue() {
        if (!queue.isEmpty()) {
            queue.add(queue.getLast() + 1);
            System.out.println("Your Queue Number is " + queue.getLast());
            System.out.println();
        } else {
            queue.add(1);
            System.out.println("Your Queue Number is " + queue.getLast());
            System.out.println();
        }
    }

    public synchronized void removeNumberFromQueue(int number) {
        if (isDeskStation) {
            List<Integer> list = new ArrayList<>(queue);
            list.remove(Integer.valueOf(number));
            queue.clear();
            queue.addAll(list);
            System.out.println("Removed " + number);
            displayQueue();
        } else {
            System.out.println("You are not authorized to do that!");
        }
    }

    public synchronized void clearQueue(){
        queue.clear();
        System.out.println("Queue has Reset!");
    }

    public synchronized void displayQueue() {
        System.out.println(queue);
    }

    public synchronized void nextInQueue() {
        if (isDeskStation) {
            if (!queue.isEmpty()) {
                queue.poll();
            }
            System.out.println("Assist " + queue.getLast());
            displayQueue();
            System.out.println();
        } else {
            System.out.println("You are not authorized to do that!");
        }
    }

    public synchronized void loginDesk(String desk){
        if (!isDeskStation){
            isDeskStation = true;
            this.deskStation = desk;
            System.out.println(deskStation +"  is logged in!");
        }
        else
            System.out.println("Only Desks can Login");
    }

    public synchronized void logoutDesk(){
        isDeskStation = false;
        System.out.println(deskStation + " is logged out!");
    }

}
