public class HashServer {

    public static void main (String[] args) throws InterruptedException{
        // TODO: bootstrap
        // we get the dictionnary from the load balancer
        //
        // then we wait for incoming connections
        // servers communicate between themselves with rings

        getDictionnaryPart();
        waitForClients();
        propagateResults();
    }

    public static void getDictionnaryPart(){
        // TODO: get dictionnary part from the load balancer
    }

    public static void waitForClients(){
        // TODO: wait for connection, when the work is done,
        // or when someone found the result, we propagate them
        while (true){
            System.out.println("[SERVER] Waiting...");
            Thread.sleep(1000);
        }
    }

    public static void propagateResults(){
        // TODO: we send to the other servers the result of our clients
    }
}
