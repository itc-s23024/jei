enum Connection {OFFLINE, ONLINE}

class d48q22 {
   public static void main(String[] args) {
     Connection s = OFFLINE;
     if (s == Connection.OFFLINE) {
      s = Connection.ONLINE;
     }
     System.out.print(s);
   }
}
