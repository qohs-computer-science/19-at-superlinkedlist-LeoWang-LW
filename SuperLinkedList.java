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
            String e = iter1.next(); 
            ListIterator <String> iter2 = this.listIterator(); 
            int two = 0; 

            while(iter2.hasNext()){
                if(!(two == one) && e.equals(iter2.next()))
                    removed.add(e);
                two++;
            one++;
            }


            
        }
        return removed;
    }

    public LinkedList<String> concatenateStrings() {
        LinkedList <String> concatenate = new LinkedList <String>();



        return null;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {

        return null;
    }

    public String toString() {
    ListIterator <String> iter = this.listIterator(); 
    String current = ""; 
    while(iter.hasNext()){
        current += iter.next(); 
        if(iter.hasNext())
                current += ", ";
    }
        return current;
    }
} // end SuperLinkedList