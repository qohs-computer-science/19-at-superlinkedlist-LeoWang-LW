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