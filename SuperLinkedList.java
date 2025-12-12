// Leo Wang || Pd. 6 || 12/12/25 || CP3 

import java.util.LinkedList;
import java.util.ListIterator;

public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
         ListIterator <String> iter = this.listIterator(); 
         boolean removed = false; 

         while(iter.hasNext()){
            String s = iter.next(); 
            if("AEIOUaeiou".indexOf(s) != -1){
                iter.remove(); 
                removed = true; 
            } // end if statement 
            } // end while statement 
            return removed;
         } // end removedVowels 

    public boolean removeConsonants() {
        ListIterator <String> iter = this.listIterator(); 
        boolean removed = false; 

        while(iter.hasNext()){
            if("AEIOUaeiou".indexOf(iter.next()) == -1){
                removed = true; 
                iter.remove();
            } // end if statement 
        } // end while statement 

        return removed;
    } // end removeConsonants 

    public LinkedList<String> removeDuplicates() {
        LinkedList <String> removed = new LinkedList <String>(); 

        for(int i = 0; i < this.size(); i++){
            String current = this.get(i); 

            ListIterator<String> iter = this.listIterator(i+1); 

            while(iter.hasNext()){
                String val = iter.next(); 

                if(current.equals(val)){
                    removed.add(val); 
                    iter.remove(); 
                } // end if statement 
            } // end while statement 
        } // end for loop 

        return removed; 
    } // end removeDuplicates 

    public LinkedList<String> concatenateStrings() {
        LinkedList <String> concatenate = new LinkedList <String>();
        ListIterator <String> iter = this.listIterator(); 
        String combine = ""; 
        while(iter.hasNext()){
            combine += iter.next(); 
            concatenate.add(combine); 
        } // end while 


        return concatenate;
    } // end concatenateStrings 

    public LinkedList<String> mix(LinkedList<String> list2) {
        LinkedList <String> mixedList = new LinkedList <String>(); 
        ListIterator <String> iter1 = this.listIterator(); 
        ListIterator <String> iter2 = list2.listIterator(); 
        while (iter1.hasNext() && iter2.hasNext()){
            mixedList.add(iter1.next());
            mixedList.add(iter2.next());
        } // end while loop 
        return mixedList;
    } // end mix

    public String toString() {
    ListIterator <String> iter = this.listIterator(); 
    String current = ""; 
    while(iter.hasNext()){
        current += iter.next(); 
        if(iter.hasNext())
                current += ", ";
    } // end while statement 
        return current;
    } // end toString 
} // end SuperLinkedList