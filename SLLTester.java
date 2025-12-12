// Leo Wang || Pd. 6 || 12/12/25 || CP3 

import java.util.ListIterator;
import java.util.LinkedList;
class SLLTester {
  public static void main(String[] args) {
    SuperLinkedList list1 = new SuperLinkedList(); 
    list1.add("a"); 
    list1.add("b"); 
    list1.add("c");
    list1.add("d"); 
    list1.add("e"); 

    SuperLinkedList list2 = new SuperLinkedList();
    list2.add("e"); 
    list2.add("d"); 
    list2.add("c"); 
    list2.add("b"); 
    list2.add("a"); 

    SuperLinkedList list3 = new SuperLinkedList(); 
    list3.add("A"); 
    list3.add("D"); 
    list3.add("C"); 
    list3.add("C"); 
    list3.add("D"); 
    list3.add("E"); 
    list3.add("B"); 

    System.out.println("This is the calling list after the mix:"); 
    System.out.println(list1); 

    System.out.println("This is the sent list after the mix");
    System.out.println(list2); 

    System.out.println("This is retLists, return value of the call to mix:");

    LinkedList <String> retLists = list1.mix(list2); 
    printList(retLists); 

    retLists = list3.removeDuplicates();     
    System.out.println("This is list3 after the removeDuplicates: "); 
    System.out.println(list3); 
    System.out.println("Returned from removeDuplicates:"); 
    printList(retLists); 
    
    System.out.println("Removed Vowels : " + list3.removeVowels()); 
    System.out.println("This is list3 after the removeVowels"); 
    System.out.println(list3); 


    System.out.println("Removed Consonants: " + list2.removeConsonants()); 
    System.out.println("This is list2 after the removeConsonants:"); 
    System.out.println(list2); 

    retLists = list3.concatenateStrings(); 
    System.out.println("This is list3 after the concatenateStrings: ");
    System.out.println(list3);
    System.out.println("This is retLists, return value of the call to concatenateStrings: "); 
    printList(retLists); 
    

  } // end main

  public static void printList(LinkedList <String> e)
  {
    ListIterator <String> iter1 = e.listIterator(); 
    while(iter1.hasNext()){
      System.out.println(iter1.next());
    } // end while loop 
  } // end printList 
} // end class