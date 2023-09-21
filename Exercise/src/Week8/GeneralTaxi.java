package Week8;

public class GeneralTaxi extends Taxi {

    private double farePerKilometer;
    private double baseDistance = 3;
    private double baseFee = 3;

    public GeneralTaxi(int carNum, double farePerKilometer) {
        super(carNum);
        this.farePerKilometer = farePerKilometer;
        if(farePerKilometer < baseFee/baseDistance){
            System.out.println("error");
            System.exit(0);
        }
    }

    @Override
    public String toString(){
        return "차량 번호: " + carNum + " 거리당 요금: " + farePerKilometer + " 기본 거리: " + baseDistance +  " 기본 요금: " + baseFee +"\n"+ " 오늘 수익: " + income + " 총 주행거리: " + distance + "\n";
    }

    @Override
    public void getPaid(double dis) {
        super.distance += dis;
        if(dis >= this.baseDistance){
            super.income += this.baseFee + (this.farePerKilometer*(dis-baseDistance));
        }
        else
            super.income += baseFee;
    }
}
