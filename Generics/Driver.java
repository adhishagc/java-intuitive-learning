public class Driver {
    public static void main(String[] args){
        
        //Creating a Node
        Pebble<Integer> node = new Pebble<>(3);

        //Creating Wire
        Wire firstWire = new Wire(node);

        //System.out.println(firstWire.getHead().getValue());

        firstWire.addNode(new Pebble<>(5));
        firstWire.addNode(new Pebble<>(8.1));
        firstWire.addNode(new Pebble<>(-13.432523));

        System.out.println(firstWire.search(8.1));

        //  Integer xxx = new Integer(3);
        //  Number fff = new Integer(3);
        //  System.out.println(xxx.toString().equalsIgnoreCase(fff.toString()));

    }
}
