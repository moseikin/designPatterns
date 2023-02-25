public class AdapterMain {

    public static void main(String[] args) {
        Ride ride = new RideImpl();
        Move move = new MoveImpl(ride);

        String moveString = move.doMoving();

        System.out.println(moveString);
    }
}
