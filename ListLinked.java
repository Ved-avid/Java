import java.io.*;
import java.util.*;
import java.lang.*;

class ListLinked{
    static public void main(String[] args){
        LinkedList<String> placeToVisit = new LinkedList<>();
        addInorder(placeToVisit, "dhanbad");
        addInorder(placeToVisit, "jharia");
        addInorder(placeToVisit, "bokaro");
        addInorder(placeToVisit, "ballia");
        addInorder(placeToVisit, "ranchi");
        addInorder(placeToVisit, "kolkata");
        printList(placeToVisit);

    }

    static public void printList(LinkedList<String> list){
        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+"  ");
        }
        System.out.println();
    }

    static public boolean addInorder(LinkedList<String> list, String newCity){
        ListIterator<String> i = list.listIterator();
        while(i.hasNext()){
            int compare = i.next().compareTo(newCity);
            if(compare == 0){
                System.out.println("City is already in the list");
                return false;
            }
            else if(compare>0){
                i.previous();
                i.add(newCity);
                return true;
            }
            else if(compare<0){
            }
        }
        i.add(newCity);
        return true;
    }
}
