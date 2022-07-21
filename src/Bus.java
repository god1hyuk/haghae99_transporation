public class Bus extends Transporation {
    /* fields */
    static final int PER_FARE = 1000;

    int pass, cur_pass;

    /* constructor */
    public Bus() {
        super();
        this.MAX_PASS = 30;
        this.state = true;
    }

    /* methods */
    public void setPass(int pass) {
        if ((this.cur_pass + pass) < MAX_PASS) {
            this.pass = pass;
            this.cur_pass += pass;

            System.out.println("탑승 승객 수 = " + pass);
            System.out.println("현재 승객 수  = " + this.cur_pass);
            System.out.println("잔여석 = " + (this.MAX_PASS - pass));
            this.getFare();
        } else {
            this.cur_pass = 0;

            System.out.println("최대 승객 수를 초과 하였습니다.");
        }
    }

    public int getFare() {
        int fare = this.PER_FARE * this.pass;
        System.out.println("요금 확인 = " + fare);
        return fare;
    }
}
