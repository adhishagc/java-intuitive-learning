public class Pebble<T extends Number>{

    private T dataNode =  null;
    private Pebble nextNode = null;

    public Pebble(){

    }

    public Pebble(T dataNode){
        setDataNode(dataNode);
    }


    public T getDataNode() {
        return this.dataNode;
    }

    public void setDataNode(T dataNode) {
        this.dataNode = dataNode;
    }

    public Pebble getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Pebble nextNode) {
        this.nextNode = nextNode;
    }

    public String getValue(){
        return dataNode.toString();
    }

    
}