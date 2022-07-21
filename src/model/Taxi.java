package model;

public class Taxi extends Transporation {
    /* fields */
    static final int BASE_DIST = 1;
    static final int FARE_DIST = 1000;
    static final int BASE_FARE = 3000;

    String dest;
    int cur_pass, dist_dest, result_fare, total_fare;

    /* constructor */
    public Taxi() {
        super();
        this.MAX_PASS = 4;
        this.state = false;
    }

    /* methods */
    public void getDefaultInfo() {
        System.out.println("주유량 = " + this.fuel);
        System.out.println("상태 = " + (this.state ? "운행 중" : "일반"));
    }

    public void setPass(int pass, String dest, int dist_dest) {
        if ((this.cur_pass + pass) < MAX_PASS) {
            this.setState();
            this.cur_pass += pass;
            this.dest = dest;
            this.dist_dest = dist_dest;

            System.out.println("탑승 승객 수 = " + pass);
            System.out.println("잔여석 = " + (this.MAX_PASS - pass));
            System.out.println("기본 요금 = " + this.BASE_FARE);
            System.out.println("목적지 = " + this.dest);
            System.out.println("목적지까지 거리 = " + this.dist_dest + "km");
            System.out.println("지불할 요금 = " + setFare());
            System.out.println("상태 = " + (this.state ? "운행 중" : "일반"));
        } else {
            this.cur_pass = 0;

            System.out.println("최대 승객 수를 초과 하였습니다.");
        }
    }

    public int setFare() {
        this.result_fare = this.BASE_FARE + ((this.FARE_DIST * this.dist_dest) - this.FARE_DIST);
        this.addTotalFare();
        return this.result_fare;
    }

    public void addTotalFare() {
        this.total_fare += this.result_fare;
    }
}
