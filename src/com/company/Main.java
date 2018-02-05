package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("\nБаллы спортсменнов\n");

        int[] nums = {4, 8, 10, 12, 16,17, 6};
        {
            int result = 0;

            System.out.print("Обязательные баллы: ");

            for (int a : nums) {
                System.out.print(a + "  ");
            }

            for (int i = 0; i < nums.length; i++) {
                result += nums[i];
            }

            result = result / nums.length; // общий результат делим на число элементов в массиве
            System.out.println("\nРабочий балл: " + result);
            if (result >= 10) {
                System.out.println(" \nВы проходите в следующий этап");

            }

        }


        int[] poi = {6, 9, 10, 20, 19,17, 13};{
            int res = 0;

            System.out.print("\n\nКототкие баллы: ");

            for (int v : poi) {
                System.out.print(v + "  ");
            }

            for (int i = 0; i < poi.length; i++) {
                res += poi[i];
            }

            res = res / poi.length; // общий результат делим на число элементов в массиве
            System.out.println("\nРабочий балл: " + res);
            if (res >= 10) {
                System.out.println(" \nВы проходите в следующий этап");

            }

        }

        int[] tyu = {6, 9, 7, 2, 9,7, 1};{
            int r = 0;

            System.out.print("\n\nПроизвольные  баллы: ");

            for (int o : tyu) {
                System.out.print(o + "  ");
            }

            for (int i = 0; i < tyu.length; i++) {
                r += tyu[i];
            }

            r = r / tyu.length; // общий результат делим на число элементов в массиве
            System.out.println("\nРабочий балл: " + r);
            if (r >= 10) {
                System.out.println(" \nВы проходите в следующий этап");

            }


        }



    }


            }

