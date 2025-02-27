package pertemuan4;

public class ListMain {
    public static void main(String[] args) {
        
    	// Latihan 3
    	StrukturList list = new StrukturList();
    	list.addTail(3);
    	list.addTail(4);
    	list.addMid(7,2);
    	list.addMid(8,2);
    	list.addHead(5);
    	System.out.print("Elemen(Latihan 3) : " );
    	list.displayElement();
    	System.out.println();
    	
        // Tugas 2.a
        StrukturList list1 = new StrukturList();
        list1.addTail(4.5);
        list1.addMid(3.4,1);
        list1.addHead(2.1);
        System.out.print("Elemen(Tugas 2a) : " );
        list1.displayElement();
        System.out.println();
      
        // Tugas 2.b
        StrukturList list2 = new StrukturList();
        list2.addTail(4.5);
        list2.addTail(5.5);
        list2.addMid(1.1,1);
        list2.addMid(2.1,1);
        list2.addHead(3.4);
        System.out.print("Elemen(Tugas 2b) : " );
        list2.displayElement();   
    }   
} 