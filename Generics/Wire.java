public class Wire{

    private Pebble head = null;
    private Pebble tail = null;

    public Wire(){
        
    }

    public Wire(Pebble node){
        this.head = node;
        this.tail = node;
    }

    //Add a Node
    public void addNode(Pebble node){

        if(this.tail == this.head){
            //only one node
            this.tail = node;
            this.head.setNextNode(node);
        }else{
            this.tail.setNextNode(node);
            this.tail = this.tail.getNextNode();
        }

    }

    //Search for a value
    public boolean search(Number value){
        
        return this.searchLoop(this.head, value);
        
    }

    private boolean searchLoop(Pebble node, Number value){
        boolean state = false;
        if(node.getValue().equalsIgnoreCase(value.toString())){
            state = true;
        }else if(node.getNextNode() != null){
            
            state = searchLoop(node.getNextNode(), value);
        }
        return state;
    }
    //Delete a Node

    //Print All

    public void showNode(){
        
    }

    public Pebble getHead(){
        return this.head;
    }

}
