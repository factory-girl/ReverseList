public class ReverseListTest
{
   public static void main(String[] args)
   {
       ReverseList myList = new ReverseList();
       myList.addFirst("aaa");
       myList.addFirst("bbb");
       myList.addFirst("ccc");
       myList.addFirst("ddd");
       System.out.println(myList);
       myList.reverse();
       System.out.println(myList);
   }
}