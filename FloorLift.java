// 50 store building including 3 floors, deciding which is near to the user...
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class FloorLift {
    public static Scanner sc;
    public static FloorLift finalLift;

    public void floorSelector(int start, int end, int[] lift1, int[] lift2, int[] lift3) {
        if (start == end) {
            System.out.println("---.---You are in the same floor---.---");
        } else {
            int direction = (start > end) ? 0 : 1;
            if (lift1[0] == start || lift2[0] == start || lift3[0] == start) {
                if (lift1[0] == start) {
                    System.out.println("---.---You don't have to wait, the lift1 is in your floor---.---");
                    lift1[0] = end;
                    lift1[1] = direction;
                    if (end == 0) {
                        lift1[1] = 1;
                    }
                    if (end == 50) {
                        lift1[1] = 0;
                    }
                }
                if (lift2[0] == start) {
                    System.out.println("---.---You don't have to wait, the lift2 is in your floor---.---");
                    lift2[0] = end;
                    lift2[1] = direction;
                    if (end == 0) {
                        lift2[1] = 1;
                    }
                    if (end == 50) {
                        lift2[1] = 0;
                    }
                }
                if (lift3[0] == start) {
                    System.out.println("---.---You don't have to wait, the lift3 is in your floor---.---");
                    lift3[0] = end;
                    lift3[1] = direction;
                    if (end == 0) {
                        lift3[1] = 1;
                    }
                    if (end == 50) {
                        lift3[1] = 0;
                    }
                }
            } else {
                int[] finalArray = { start, lift1[0], lift2[0], lift3[0] };
                int[][] comArray = { { 0 }, lift1, lift2, lift3 };
                int[] comLiftArray = { 0, 1, 2, 3 };
                for (int i = 0; i < finalArray.length; i++) {
                    for (int j = i + 1; j < finalArray.length; j++) {
                        if (finalArray[i] > finalArray[j]) {
                            int temp = finalArray[i];
                            finalArray[i] = finalArray[j];
                            finalArray[j] = temp;
                            int[] temp1 = comArray[i];
                            comArray[i] = comArray[j];
                            comArray[j] = temp1;
                            int temp2 = comLiftArray[i];
                            comLiftArray[i] = comLiftArray[j];
                            comLiftArray[j] = temp2;
                        }
                    }
                }
                int position = Arrays.binarySearch(finalArray, start);
                if (position == (finalArray.length - 1)) {
                    System.out.println("---.---wait for " + (start - finalArray[position - 1]) + " seconds,lift"
                            + (comLiftArray[position - 1]) + " will come---.---");
                    if (direction == 0) {
                        comArray[position - 1][1] = direction;
                        comArray[position - 1][0] = end;
                        if (end == 0) {
                            comArray[position - 1][1] = 1;
                        }
                    } else {
                        comArray[position - 1][0] = end;
                        if (end == 50) {
                            comArray[position - 1][1] = 0;
                        }
                    }
                }
                if (position == 0) {
                    System.out.println("---.---wait for " + (finalArray[position + 1] - start) + " seconds,lift"
                            + (comLiftArray[position + 1]) + " will come---.---");
                    if (direction == 1) {
                        comArray[position + 1][1] = direction;
                        comArray[position + 1][0] = end;
                        if (end == 50) {
                            comArray[position + 1][1] = 0;
                        }
                    } else {
                        comArray[position + 1][0] = end;
                        if (end == 0) {
                            comArray[position + 1][1] = 1;
                        }
                    }
                }
                if (position == 1 || position == 2) {
                    if ((start - finalArray[position - 1]) < (finalArray[position + 1] - start)) {
                        System.out.println("---.---wait for " + (start - finalArray[position - 1]) + " seconds,lift"
                                + (comLiftArray[position - 1]) + " will come---.---");
                        if (direction == 0) {
                            comArray[position - 1][1] = direction;
                            comArray[position - 1][0] = end;
                            if (end == 0) {
                                comArray[position - 1][1] = 1;
                            }
                        } else {
                            comArray[position - 1][0] = end;
                            if (end == 50) {
                                comArray[position - 1][1] = 0;
                            }
                        }
                    }
                    if ((start - finalArray[position - 1]) > (finalArray[position + 1] - start)) {
                        System.out.println("---.---wait for " + (finalArray[position + 1] - start) + " seconds,lift"
                                + (comLiftArray[position + 1]) + " will come---.---");
                        if (direction == 0) {
                            comArray[position + 1][0] = end;
                            if (end == 0) {
                                comArray[position + 1][1] = 1;
                            }
                        } else {
                            comArray[position + 1][1] = direction;
                            comArray[position + 1][0] = end;
                            if (end == 50) {
                                comArray[position + 1][1] = 0;
                            }
                        }
                    }
                    if ((start - finalArray[position - 1]) == (finalArray[position + 1] - start)) {
                        if (direction == comArray[position - 1][1]) {
                            System.out.println("---.---wait for " + (start - finalArray[position - 1]) + " seconds,lift"
                                    + (comLiftArray[position - 1]) + " will come---.---");
                            comArray[position - 1][0] = end;
                            if (end == 50) {
                                comArray[position - 1][1] = 0;
                            }
                        }
                        if (direction == comArray[position + 1][1]) {
                            System.out.println("---.---wait for " + (finalArray[position + 1] - start) + " seconds,lift"
                                    + (comLiftArray[position + 1]) + " will come---.---");
                            comArray[position + 1][0] = end;
                            if (end == 0) {
                                comArray[position + 1][1] = 1;
                            }
                        }
                    }
                }
                System.out.println(Arrays.toString(lift1));
                System.out.println(Arrays.toString(lift2));
                System.out.println(Arrays.toString(lift3));
            }
        }
    }

    public void doYouContinue(int k, int[] lift1, int[] lift2, int[] lift3) {
        System.out.println("Do you want to continue(1/0): ");
        int decision = sc.nextInt();
        if (decision == 1) {
            finalLift.Startfunction(k, lift1, lift2, lift3);
        }
        if (decision == 0) {
            System.out.println("---.---Thank you---.---");
        }
    }

    public void Startfunction(int k, int[] lift1, int[] lift2, int[] lift3) {
        k++;
        System.out.println("---.---Welcome user-" + (k) + "---.---");
        System.out.println("---.---Enter Floors in between 0 to 50---.---");
        System.out.println("Enter your Current_floor : ");
        int current = sc.nextInt();
        System.out.println("Enter your Destination_floor : ");
        int destination = sc.nextInt();
        if ((0 < current & current < 50) & (0 < destination & destination < 50)) {
            finalLift.floorSelector(current, destination, lift1, lift2, lift3);
            finalLift.doYouContinue(k, lift1, lift2, lift3);
            // System.out.println("Do you want to continue(1/0): ");
            // int decision = sc.nextInt();
            // if (decision == 1) {
            // finalLift.Startfunction(k, lift1, lift2, lift3);
            // }
            // if (decision == 0) {
            // System.out.println("---.---Thank you---.---");
            // }
        } else {
            System.out.println("---.---Out of floors,enter 0 to 50---.---");
            finalLift.doYouContinue(k, lift1, lift2, lift3);
            // System.out.println("Do you want to continue(1/0): ");
            // int decision = sc.nextInt();
            // if (decision == 1) {
            // finalLift.Startfunction(k, lift1, lift2, lift3);
            // }
            // if (decision == 0) {
            // System.out.println("---.---Thank you---.---");
            // }
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        finalLift = new FloorLift();
        sc = new Scanner(System.in);
        int[] lift1 = { rnd.nextInt(51), rnd.nextInt(2) };
        int[] lift2 = { rnd.nextInt(51), rnd.nextInt(2) };
        int[] lift3 = { rnd.nextInt(51), rnd.nextInt(2) };
        System.out.println(Arrays.toString(lift1));
        System.out.println(Arrays.toString(lift2));
        System.out.println(Arrays.toString(lift3));
        int k = 0;
        finalLift.Startfunction(k, lift1, lift2, lift3);
        sc.close();
    }
}