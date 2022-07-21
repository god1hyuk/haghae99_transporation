import java.util.UUID;

public class Transporation {
    /* fields */
    static String car_num;
    static int MAX_PASS;
    static boolean isDrive = false;
    static int pass, fuel, speed;
    static boolean state;

    /* constructor */
    public Transporation () {
        this.fuel = 100;
        this.speed = 0;
        this.car_num = UUID.randomUUID().toString();
    }

    /* methods */
    public String showCarNum() {
        return car_num;
    }

    public void setPass(int pass) {
        this.pass += pass;
        System.out.println("탑승 승객 수 = " + pass);
    }

    public int setFuel(int fuel) {
        this.fuel += fuel;

        if (this.fuel < 10) {
            System.out.println("(!) 주유가 필요합니다.");
            this.setState();
        }

        if (this.fuel <= 0) {
            this.fuel = 0;
            System.out.println("(!) 운행 불가");
            this.setDrive();
            this.setState();
        }

        return this.fuel;
    }

    public void setDrive() {
        isDrive = !isDrive;

        if (this.speed <= 0) {
            isDrive = false;
        } else if (this.fuel < 10) {
            isDrive = false;
            System.out.println("(!) 주유가 필요합니다.");
        }

        if (!isDrive) this.speed = 0;

        System.out.println(isDrive ? "주행 시작" : "정지");
    }

    public void setSpeed(int speed_change) {
        this.speed += speed_change;

        if ((this.speed + speed_change) <= 0) {
            this.speed = 0;
        }

        setDrive();

        System.out.println("속도 = " + this.speed);
    }

    public boolean setState() {
        this.state = !this.state;

        return this.state;
    }
}
