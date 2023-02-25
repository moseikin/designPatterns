public class MoveImpl implements Move {
    private final Ride ride;

    public MoveImpl(Ride ride) {
        this.ride = ride;
    }

    @Override
    public String doMoving() {
        return ride.doRiding();
    }
}
