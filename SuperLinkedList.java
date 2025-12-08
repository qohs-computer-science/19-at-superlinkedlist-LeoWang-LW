import java.util.LinkedList;
import java.util.ListIterator;

public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
         ListIterator <String> iter = this.listIterator(); 
         boolean removed = false; 

         while(iter.hasNext()){
            if("AEIOUaeiou".indexOf(iter.next()) != -1)
                removed = true; 
                iter.remove();
            }
            return removed;
         }
         


        
    

    public boolean removeConsonants() {
        ListIterator <String> iter = this.listIterator(); 
        boolean removed = false; 

        while(iter.hasNext()){
            if("AEIOUaeiou".indexOf(iter.next()) == -1){
                removed = true; 
                iter.remove();
            }
        }

        return removed;
    }

    public LinkedList<String> removeDuplicates() {
        ListIterator <String> iter1 = this.listIterator(); 
        LinkedList <String> removed = new LinkedList <String>(); 
        int one = 0; 

        while(iter1.hasNext()){
            String e = iter.next(); 
            LinkedList <String> iter2 = new LinkedList <String>(); 
            
        }


        return null;
    }

    public LinkedList<String> concatenateStrings() {

        return null;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {

        return null;
    }

    public String toString() {

        return "";
    }
} // end SuperLinkedList