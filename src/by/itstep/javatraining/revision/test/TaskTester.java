package by.itstep.javatraining.revision.test;

import by.itstep.javatraining.revision.task.Task01;
import by.itstep.javatraining.revision.task.Task02;

public class TaskTester {
    public static final String RIGHT = "completed successfully. Well DONE!!!";
    public static final String WRONG = "was NOT running successfully. Something was WRONG!";

    public static String testingTask01() {

        boolean result = Task01.task01(1, 1, 1, 2, 2, 2) == 3661
                && Task01.task01(0, 0, 0, 1, 1, 1) == 3661
                && Task01.task01(2, 2, 2, 3, 3, 3) == 3661
                && Task01.task01(3, 3, 3, 4, 4, 4) == 3661
                && Task01.task01(1, 2, 30, 1, 3, 20) == 50
                && Task01.task01(0, 0, 0, 0, 0, 1) == 1
                && Task01.task01(0, 0, 0, 0, 1, 0) == 60
                && Task01.task01(0, 0, 0, 1, 0, 0) == 3600

                && Task01.task01(1, 1, 1, 1, 1, 1) == 0
                && Task01.task01(2, 2, 2, 1, 1, 1) == 3661
                && Task01.task01(4, 4, 4, 3, 3, 3) == 3661
                && Task01.task01(1, 3, 20, 1, 2, 30) == 50
                && Task01.task01(0, 0, 1, 0, 0, 0) == 1
                && Task01.task01(0, 1, 0, 0, 0, 0) == 60
                && Task01.task01(1, 0, 0, 0, 0, 0) == 3600

                && Task01.task01(24, 1, 1, 1, 1, 1) == -1
                && Task01.task01(25, 1, 1, 1, 1, 1) == -1
                && Task01.task01(1, 1, 1, 24, 1, 1) == -1
                && Task01.task01(1, 1, 1, 25, 1, 1) == -1
                && Task01.task01(1, 60, 1, 1, 1, 1) == -1
                && Task01.task01(1, 1, 60, 1, 1, 1) == -1
                && Task01.task01(1, 61, 1, 1, 1, 1) == -1
                && Task01.task01(1, 1, 61, 1, 1, 1) == -1
                && Task01.task01(1, 1, 1, 1, 60, 1) == -1
                && Task01.task01(1, 1, 1, 1, 1, 60) == -1
                && Task01.task01(1, 1, 1, 1, 61, 1) == -1
                && Task01.task01(1, 1, 1, 1, 1, 61) == -1


                && Task01.task01(-1, 1, 1, 1, 1, 1) == -1
                && Task01.task01(1, -1, 1, 1, 1, 1) == -1
                && Task01.task01(1, 1, -1, 1, 1, 1) == -1
                && Task01.task01(1, 1, 1, -1, 1, 1) == -1
                && Task01.task01(1, 1, 1, 1, -1, 1) == -1
                && Task01.task01(1, 1, 1, 1, 1, -1) == -1;

        return "Task 01 " + (result ? RIGHT : WRONG);
    }


    public static String testingTask02() {

        boolean result = Task02.task02(0).trim().equalsIgnoreCase("0:00:00")
                && Task02.task02(3602).trim().equalsIgnoreCase("1:00:02")
                && Task02.task02(86399).trim().equalsIgnoreCase("23:59:59")
                && Task02.task02(129700).trim().equalsIgnoreCase("12:01:40")
                && Task02.task02(1).trim().equalsIgnoreCase("0:00:01")
                && Task02.task02(3600).trim().equalsIgnoreCase("1:00:00")
                && Task02.task02(60).trim().equalsIgnoreCase("0:01:00")
                && Task02.task02(3661).trim().equalsIgnoreCase("1:01:01")

                && Task02.task02(-1).trim().equalsIgnoreCase("error");

        return "Task 02 " + (result ? RIGHT : WRONG);
    }
}
