class Example {
   static void main(String[] args) {
      def lst = [13, 25, 100, 14]; 
      def sortedlist = lst.sort(); 
      def size = sortedlist.size();
      System.out.println (sortedlist[size-1]);
   }
}
