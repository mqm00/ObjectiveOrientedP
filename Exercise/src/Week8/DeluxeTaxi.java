package Week8;

public class DeluxeTaxi extends Taxi{

    public DeluxeTaxi(int carNum, double farePerKilometer) {
        super(carNum);
        this.farePerKilometer = farePerKilometer;
        if(farePerKilometer < baseFee/baseDistance){
            System.out.println("Error");
            System.exit(0);
        }
    }

    private double farePerKilometer;
    private double baseDistance = 3;
    private double baseFee = 5;


    @Override
    public String toString(){
        return "차량 번호: " + carNum + " 거리당 요금: " + farePerKilometer + " 기본 거리: " + baseDistance + " 기본 요금: " + baseFee +"\n"+ " 오늘 수익: " + income + " 총 주행거리: " + distance + "\n";
    }

    @Override
    public void getPaid(double dis) {
        super.distance += dis;
        if(dis >= this.baseDistance){
            this.income += baseFee + (farePerKilometer*(dis-baseDistance));
        }
        else
            this.income += baseFee;
    }

}
