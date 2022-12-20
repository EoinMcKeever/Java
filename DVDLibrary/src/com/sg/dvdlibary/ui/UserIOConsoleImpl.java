package com.sg.dvdlibary.ui;

import java.util.Scanner;

public class UserIOConsoleImpl implements UserIO {

    final private Scanner userInput = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void print(double message) {
        System.out.println(message);

    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return userInput.next();
    }

    @Override
    public int readInt(String prompt) {
        int readInt = 0;
        while (true) {
            System.out.println(prompt);
            try {
                readInt = userInput.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Enter a valid number");
            }
        }
        return readInt;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println("Integer must be between " + min + " and " + max);
        int readInt = 0;
        while (true) {
            System.out.println(prompt);
            try {
                readInt = userInput.nextInt();
                if (readInt <= max && readInt >= min) {
                    break;
                }
                else{
                    System.out.println("Enter a valid number");
                }
            } catch (Exception e) {
                System.out.println("Enter a valid number");
            }

        }
        return readInt;
    }

    @Override
    public double readDouble(String prompt) {
        double readDouble = 0;
        while (true) {
            System.out.println(prompt);
            try {
                readDouble= userInput.nextDouble();
                break;

            } catch (Exception e) {
                System.out.println("Enter a valid Double");
            }
        }
        return readDouble;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println("Double must be between " + min + " and " + max);
        double readDouble = 0;
        while (true) {
            System.out.println(prompt);
            try {
                readDouble = userInput.nextDouble();
                if (readDouble <= max && readDouble >= min) {
                    break;
                }
                else{
                    System.out.println("Enter a valid Double");
                }
            } catch (Exception e) {
                System.out.println("Enter a valid Double");
            }

        }
        return readDouble;
    }

    @Override
    public float readFloat(String prompt) {
        float readFloat = 0;
        while (true) {
            System.out.println(prompt);
            try {
                readFloat= userInput.nextFloat();
                break;

            } catch (Exception e) {
                System.out.println("Enter a valid Float");
            }
        }
        return readFloat;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        System.out.println("Float must be between " + min + " and " + max);
        float readFloat = 0;
        while (true) {
            System.out.println(prompt);
            try {
                readFloat = userInput.nextFloat();
                if (readFloat <= max && readFloat >= min) {
                    break;
                }
                else{
                    System.out.println("Enter a valid Float");
                }
            } catch (Exception e) {
                System.out.println("Enter a valid Float");
            }

        }
        return readFloat;
    }

    @Override
    public long readLong(String prompt) {
        long readLong = 0;
        while (true) {
            System.out.println(prompt);
            try {
                readLong= userInput.nextLong();
                break;

            } catch (Exception e) {
                System.out.println("Enter a valid Long");
            }
        }
        return readLong;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println("Long must be between " + min + " and " + max);
        long readLong = 0;
        while (true) {
            System.out.println(prompt);
            try {
                readLong = userInput.nextLong();
                if (readLong <= max && readLong >= min) {
                    break;
                }
                else{
                    System.out.println("Enter a valid Long");
                }
            } catch (Exception e) {
                System.out.println("Enter a valid Long");
            }

        }
        return readLong;
    }
}
