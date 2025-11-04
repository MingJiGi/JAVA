package projectOsan;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeMethods extends coffeAbstract {
    private String name;
    private int size, pay;
    private static int ano;

    private static final List<CoffeMethods> menu = new ArrayList<>();
    private static final Scanner in = new Scanner(System.in);

    public CoffeMethods() {
    }

    public CoffeMethods(String name, int pay, int size) {
        this.name = name;
        this.pay = pay;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getPay() {
        return pay;
    }

    public int getSize() {
        return size;
    }

    public static int getAno() {
        return ano;
    }

    public List<CoffeMethods> getMenu() {
        return menu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    void rootLoging() {
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("--------- 자판기 관리 시스템 ---------");
            System.out.print("ID : ");
            String id = in.next();
            System.out.print("Password : ");
            String password = in.next();

            if (id.equals("MinSik") && password.equals("1234")) {
                System.out.println("로그인에 성공하셨습니다.");
                loggedIn = true;
            } else {
                System.out.println("ID 또는 Password 가 일치하지 않습니다. 다시 시도해 주세요.");
                run();
                return;
            }
        }

        while (loggedIn) {
            System.out.println("1. 제품 추가, 2. 판매취소, 3. 재고 확인, 4. 자판기 수익, 5. 제품수량추가, 6. 관리자페이지 종료, 7. 프로그램 종료");
            System.out.print("메뉴를 선택해 주세요 : ");
            int choice = -1;

            try {
                choice = in.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("메뉴 선택은 오로지 1~7번만 입력이 가능합니다.");
                in.next();
                continue;
            }

            switch (choice) {
                case 1: plus(); break;
                case 2: Remove(); break;
                case 3: show(); break;
                case 4: showMoney(); break;
                case 5: addSize(); break;
                case 6:
                    System.out.println("관리자 페이지를 종료하고 메인 화면으로 돌아갑니다.");
                    run();
                    return;
                case 7:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("유효하지 않은 메뉴 번호입니다. 1~7 사이의 숫자를 입력해 주세요.");
                    break;
            }
        }
    }

    @Override
    void run() {
        while (true){
            System.out.println("--------- 자판기 ---------");
            System.out.println("1. 제품구매, 2. 관리자 로그인 3. 종료" );
            System.out.print("메뉴를 선택해주세요 : ");

            int userChoice = -1;

            try {
                userChoice = in.nextInt();
            } catch (java.util.InputMismatchException e){
                in.next();
                continue;
            }
            switch (userChoice){
                case 1 : show();
                if (menu.isEmpty()){
                    continue;
                }else buy(); break;
                case 2 : rootLoging(); return;
                case 3 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("유효하지 않은 메뉴 번호입니다. 1~3 사이의 숫자를 입력해 주세요.");
                    break;
            }
        }
    }

    @Override
    void plus() {
        System.out.print("제품 이름 : ");
        String name = in.next();

        for (CoffeMethods item : menu){
            if (name.equals(item.getName())){
                System.out.println("이미 동일한 제품이 등록되어 있습니다.");
                return;
            }
        }

        int pay = 0;
        int size = 0;

        try {
            System.out.print("제품 가격 : ");
            pay = in.nextInt();
            System.out.print("제품 수량 : ");
            size = in.nextInt();

        }catch (java.util.InputMismatchException e){
            System.out.println("오류: 제품의 가격과 수량은 숫자로만 입력이 가능합니다. 등록을 취소합니다.");
            in.next();
            return;
        }

        // 예외가 발생하지 않았을 때만 상품을 등록합니다.
        getMenu().add(new CoffeMethods(name, pay, size));
        System.out.println("제품 '" + name + "'이(가) 성공적으로 추가되었습니다.");
    }

    @Override
    void show() {
        if (getMenu().isEmpty()){
            System.out.println("현재 판매중인 상품이 존재하지 않습니다.");
            return;
        }
        for (int i = 0; i < getMenu().size(); i++) {
            System.out.println("------------------------");
            System.out.println(getMenu().get(i));
            System.out.println("------------------------");
        }
    }

    @Override
    void Remove() {
        System.out.print("판매를 취소할 제품 이름을 입력해 주세요 : ");
        String name = in.next();
        for (int i = 0; i < getMenu().size(); i++) {
            CoffeMethods a = getMenu().get(i);
            if (name.equals(a.name)){
                getMenu().remove(i);
                System.out.println("해당 제품을 성공적으로 판매 취소 했습니다.");
                return;
            }
        }
        System.out.println("해당 제품이 존재하지 않습니다.");
    }

    @Override
    public String toString() {
        return "제품이름 : " + getName() + "\n" +
                "제품 가격 : " + getPay() + "\n" +
                "제품 수량 : " + getSize();
    }

    @Override
    void buy() {
        System.out.print("구매하려는 제품명을 입력해주세요 : ");
        String name =  in.next();
        System.out.print("구매 수량 : ");
        int count = in.nextInt();
        for (int i = 0; i < getMenu().size(); i++) {
            CoffeMethods a = getMenu().get(i);
            if (name.equals(a.getName())) {
                if (a.getSize() < count) {
                    System.out.println("제품의 수량이 부족하여 구매할 수 없습니다.");
                    System.out.println("현재 제품 수량 : " + a.getSize());
                } else {
                    getMenu().get(i).size -= count;
                    ano += getMenu().get(i).pay * count;
                    System.out.println("해당 제품을 성공적으로 구매 하였습니다.");
                }
                return;
            }
        }
        System.out.println("해당 제품이 존재하지 않습니다.");
    }

    @Override
    void showMoney() {
        System.out.println("현재 수익 : " + getAno());
    }

    @Override
    void addSize() {
        System.out.print("수량을 추가할 제품명을 입력하세요 : ");
        String name = in.next();

        int sizeToAdd = 0;
        try {
            System.out.print("수량을 입력하세요 : ");
            sizeToAdd = in.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("오류: 수량은 숫자로만 입력해야 합니다. 추가를 취소합니다.");
            in.next();
            return;
        }

        for (int i = 0; i < getMenu().size(); i++) {
            CoffeMethods product = menu.get(i);

            if (name.equals(product.getName())){

                product.size += sizeToAdd;

                System.out.println(name + "의 수량 " + sizeToAdd + "개가 추가되었습니다.");
                System.out.println("현재 수량: " + product.getSize());

                return;
            }
        }
        System.out.println("해당 상품이 존재하지 않습니다.");
    }
}