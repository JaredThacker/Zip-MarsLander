public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        //the kris solution
        int sp = status.getVelocity();
        int a = status.getAltitude();
        int burn = 100;
        int zz = 0; // burn delta from 100;

        // a = (speed * speed)/(2 * altitude) // from readme.
        zz = (sp * sp) / ( 2 * a);
        burn = zz + 99; // use 99 to always drift downward (due to integer div)
        //System.out.print("["+zz+"] "); /*print estimated burn above 100 */
        if (burn > 200) burn = 200; // if Newton wants more fuel than 200, deny it
        return burn;
    }

//    @Override
//    public int getNextBurn(DescentEvent status) {
//        int burn = 0;
//        if (status.getVelocity() == 2){
//            burn = 100; // check if at 2 ms
//        } else if (status.getAltitude() > 6000) {
//            burn = 100; // check how high to maintain to descend
//        } else if (status.getVelocity() > 100) {
//            burn = 200; // determines if u need to slow down
//        } else if (status.getAltitude() > 100) {
//            burn = 100; // re check altitude to see if at correct velocity
//        } else {
//            burn = 198; // slow down but not completely stop
//        }
//
//        System.out.println(burn); /*hack!*/
//        return burn;
//    }

//    @Override
//    public int getNextBurn(DescentEvent status){
//        int burn = 0;
//
//        if (status.Altitude > 1){
//            int acceleration = (status.getVelocity() * status.getVelocity()) / (2 * status.getAltitude());
//            burn = acceleration + 100;
//            if (burn > 200){
//                burn = 200;
//            }
//
//        } else {
//            burn = 100;
//        }
//
//        return burn;
//    }

}
