package time.practice.dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WhatDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 날짜를 입력하세요 (예시 : 2025-01-01) : ");
        String input = scanner.nextLine();
        LocalDate date = LocalDate.parse(input); // 문자를 날짜와 시간으로 변경했지만 표시는 같음 (2025-01-01)

        int dayOfYear = date.getDayOfYear();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"); // 날짜와 시간을 원하는 포맷으로 변경

        System.out.println(date.format(formatter)+"는 올해의 "+dayOfYear+"번째 날 이다.");
    }
}
