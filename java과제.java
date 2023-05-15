package com.example.demo1.javasession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class java과제 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== 은행 계좌 프로그램 ======");
        ArrayList<HashMap<String, String>> users = new ArrayList<HashMap<String, String>>();
        boolean register = false;
        int balance = 10000;

        while (!register) {
            System.out.println("1. 계좌개설");
            System.out.println("2. 입금하기");
            System.out.println("3. 출금하기");
            System.out.println("4. 전체조회");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택하세요: ");
            String register_input = scanner.nextLine();

            if (register_input.equalsIgnoreCase("1")) {
                System.out.println("====================");
                System.out.println("계좌개설이 진행됩니다.");
                System.out.println("====================");
                HashMap<String, String> user = new HashMap<String, String>();
                System.out.print("ID: ");
                String username = scanner.nextLine();
                System.out.print("PW: ");
                String password = scanner.nextLine();
                System.out.print("이름: ");
                String name = scanner.nextLine();
                user.put("username", username);
                user.put("password", password);
                user.put("name", name);
                users.add(user);
                System.out.println("계좌 개설이 완료되었습니다.");

            } else if (register_input.equalsIgnoreCase("2")) {
                System.out.println("====================");
                System.out.println("입금하기가 진행됩니다.");
                System.out.println("====================");
                System.out.println("입금하실 계좌번호를 입력해주세요.");
                HashMap<String, String> user = new HashMap<String, String>();
                System.out.print("계좌번호: ");
                String number = scanner.nextLine();
                System.out.print("계좌이름: ");
                String account = scanner.nextLine();
                user.put("number", number);
                user.put("account", account);
                users.add(user);
                System.out.print("입금할 금액: ");
                int deposit = Integer.parseInt(scanner.nextLine());
                balance += deposit;
                System.out.println("입금이 완료되었습니다. 현재 잔액: " + balance + "원");

            } else if (register_input.equalsIgnoreCase("3")) {
                System.out.println("====================");
                System.out.println("출금하기가 진행됩니다.");
                System.out.println("====================");
                System.out.println("출금하실 계좌번호를 입력해주세요.");
                HashMap<String, String> user = new HashMap<String, String>();
                System.out.print("계좌번호: ");
                String number = scanner.nextLine();
                System.out.print("계좌이름: ");
                String account = scanner.nextLine();
                user.put("number", number);
                user.put("account", account);
                users.add(user);
                System.out.print("출금할 금액: ");
                int withdrawAmount = Integer.parseInt(scanner.nextLine());
                if (withdrawAmount > balance) {
                    System.out.println("잔액이 부족합니다. 현재 잔액: " + balance + "원");
                } else {
                    balance -= withdrawAmount;
                    System.out.println("출금이 완료되었습니다. 현재 잔액: " + balance + "원");
                }
            } else if (register_input.equalsIgnoreCase("4")) {
                System.out.println("====================");
                System.out.println("전체 조회가 진행됩니다.");
                System.out.println("====================");

                for (HashMap<String, String> user : users) {
                    System.out.println("계좌번호: " + user.get("number") + ", 계좌이름: " + user.get("account"));
                }

                System.out.println("현재 잔액: " + balance + "원");

            } else if (register_input.equalsIgnoreCase("5")) {
                System.out.println("====================");
                System.out.println("종료하겠습니다.");
                System.out.println("====================");
                System.exit(0);
            } else {
                System.out.println("입력값을 확인해주세요.");


            }
        }}}