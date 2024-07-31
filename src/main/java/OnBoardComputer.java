public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        if (status.getVelocity() == 2){
            burn = 100;
        } else if (status.getAltitude() > 6000) {
            burn = 100;
        } else if (status.getVelocity() > 100) {
            burn = 200;
        } else if (status.getAltitude() > 100) {
            burn = 100;
        } else {
            burn = 198;
        }

        System.out.println(burn); /*hack!*/
        return burn;
    }

}
