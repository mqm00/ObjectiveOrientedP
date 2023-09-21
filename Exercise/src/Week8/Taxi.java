package Week8;

abstract class Taxi {

    public Taxi(int carNum){
        this.carNum = carNum;
        this.distance = 0;
        this.income = 0;
    }

    protected int carNum;
    protected double distance;
    protected double income;

    public String toString() {
        String info = "carNum: " + this.carNum + "distance: " + this.distance + "income: " + this.income;
        return info;
    }
    public abstract void getPaid(double distance);

    public void doDrive(double dis) {
        this.getPaid(dis);
    }
    public boolean earnMore(Taxi t){
        if(this.income > t.income){
            return true;
        }
        else
            return false;
        }
    }
