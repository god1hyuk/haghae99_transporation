package model;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("대중교통을 선택 해주세요.");
        System.out.println("①Bus ②Taxi");
        System.out.print("번호 입력 : ");

        int choiceType = scanner.nextInt();

        System.out.println();
        System.out.println("===============================================");
        System.out.println();

        switch (choiceType) {
            case 1: testBus();
                break;
            case 2: testTaxi();
                break;
        }
    }

    public static void testBus() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("bus 고유번호(UUID) 테스트를 시작합니다.");

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(버스 2대 생성)");
        Bus bus1 = new Bus();
        System.out.print("bus1 번호 = ");
        String bus1_num = bus1.showCarNum();
        System.out.println(bus1_num);

        Bus bus2 = new Bus();
        System.out.print("bus2 번호 = ");
        String bus2_num = bus2.showCarNum();
        System.out.println(bus2_num);

        System.out.println();
        if (!bus1_num.equals(bus2_num)) {
            System.out.println("bus1과 bus2의 번호가 중복되지 않습니다. (성공)");
        } else {
            System.out.println("bus1과 bus2의 번호가 중복됩니다. (실패)");
        }

        System.out.println();
        System.out.println("bus1 시나리오를 시작 하시려면 Enter키를 눌러주세요. ↵");
        scanner.nextLine();

        System.out.println("===============================================");
        System.out.println();

        System.out.println("bus1 시나리오를 시작합니다.");

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(승객 +2)");
        bus1.setPass(2);

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(주유량 -50)");
        System.out.println("주유량 = " + bus1.setFuel(-50));

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(상태 변경, → \"차고지 행\")");
        System.out.println(bus1.setState() ? "운행 중" : "차고지 행");

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(주유 +10)");
        System.out.println("주유량 = " + bus1.setFuel(10));

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(상태 변경, → \"운행 중\")");
        System.out.println(bus1.setState() ? "운행 중" : "차고지 행");

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(승객 +45)");
        bus1.setPass(45);

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(승객 +5)");
        bus1.setPass(5);

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(주유량 -55)");
        System.out.println("주유량 = " + bus1.setFuel(-55));

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(속도 -70)");
        bus1.setSpeed(-70);

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(속도 30)");
        bus1.setSpeed(30);

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(주유량 +30)");
        System.out.println("주유량 = " + bus1.setFuel(30));

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(속도 50)");
        bus1.setSpeed(50);

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(속도 -50)");
        bus1.setSpeed(-50);

        System.out.println();
        System.out.println("bus1 테스트를 종료합니다.");
    }

    public static void testTaxi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("taxi 테스트를 시작합니다.");
        System.out.println();

        System.out.println("(택시 2대 생성)");
        Taxi taxi1 = new Taxi();
        System.out.print("taxi1 번호 = ");
        String taxi1_num = taxi1.showCarNum();
        System.out.println(taxi1_num);

        Taxi taxi2 = new Taxi();
        System.out.print("taxi2 번호 = ");
        String taxi2_num = taxi2.showCarNum();
        System.out.println(taxi2_num);

        System.out.println();
        if (!taxi1_num.equals(taxi2_num)) {
            System.out.println("taxi1과 taxi2의 번호가 중복되지 않습니다. (성공)");
        } else {
            System.out.println("taxi1과 taxi2의 번호가 중복됩니다. (실패)");
        }

        System.out.println();
        System.out.println("taxi1 시나리오를 시작 하시려면 Enter키를 눌러주세요.");
        scanner.nextLine();

        System.out.println("===============================================");
        System.out.println();

        System.out.println("taxi1 시나리오를 시작합니다.");
        System.out.println();

        System.out.println("(taxi1 기본 정보)");
        taxi1.getDefaultInfo();

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(승객 +2)");
        taxi1.setPass(2, "서울역", 2);

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(주유량 -80)");
        System.out.println("주유량 = " + taxi1.setFuel(-80));
        System.out.println("(요금 결제)");
        System.out.println("누적 요금 = " + taxi1.total_fare);

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(승객 +5)");
        taxi1.setPass(5, "홍대입구역", 3);

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("(승객 +3)");
        taxi1.setPass(3, "구로디지털단역", 12);

        System.out.println();
        System.out.println("Enter ↵");
        scanner.nextLine();

        System.out.println("주유량 -20");
        System.out.println("주유량 = " + taxi1.setFuel(-20));
        System.out.println("(요금 결제)");
        System.out.println("누적 요금 = " + taxi1.total_fare);

        System.out.println();
        System.out.println("taxi1 테스트를 종료합니다.");
    }
}
