package application;

import application.menu.AddNewProfileItem;
import application.menu.ConsoleMenu;
import application.menu.Menu;
import application.menu.PrintAllItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import static application.MenuConstans.GET_ALL;
import static application.MenuConstans.ADD_PROFILE;
// Создать меню вызова функционала.
public class Application {
    private static final List<Profile> profiles = init();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsoleMenu mn = new ConsoleMenu();
        mn.addItem(new PrintAllItem());
        mn.addItem(new AddNewProfileItem());
        mn.printAllItems();
//        while (true){
//            System.out.println("1 - print All List\n" +
//                    "2 - Add New Profile\n" +
//                    "3 - Remove profile");
//            ConsoleMenu mn = new ConsoleMenu();
//            mn.addItem(new PrintAllItem());
//            mn.addItem(new AddNewProfileItem());
//            mn.printAllItems();
//
//            quick(sc.nextInt());
//            System.out.println();
//        }
    }

    public static List<Profile> init(){
        Profile Sasha = new Profile();
        Sasha.setName("David");
        Sasha.addMessage(new Message("sms","Hello there!"));

        List<Profile> initProfile = new ArrayList<>();
        initProfile.add(Sasha);
        return initProfile;
    }

    private static void removeProfile(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 1 || a > profiles.size()){
            System.out.println("Green say - poshel naher!");
        }
        profiles.remove(sc.nextInt()-1);


    }
    private static void listRemoveProfile(){
        for (int i = 0; i < profiles.size();i++){
            System.out.println((i + 1) +" "+ profiles.get(i).getName());
        }
    }
    private static Profile readProfiel(){
        Scanner sc = new Scanner(System.in);
        Profile profile = new Profile();
        profile.setName(sc.next());
        return profile;
    }

    private static Message readMessages(){
        Scanner sc = new Scanner(System.in);
        Message message = new Message(sc.next(), sc.next());
        return message;
    }
    public static void addProfile(Profile profile){
        profiles.add(profile);
    }
    public static void printAll(){
        for (Profile pr : profiles) {
            System.out.println("Name " + pr.getName());
            System.out.println("Sms " + pr.getMessages());
        }
    }

    private static void quick(int quick) {
            switch (quick) {
                case GET_ALL:
                    System.out.println("List profile ");
                    printAll();
                    break;
                case ADD_PROFILE:
                    System.out.println("Send your name ");
                    addProfile(readProfiel());
                    break;
                case 3:
                    listRemoveProfile();
                    removeProfile();
                    break;
                case 4:
                    listRemoveProfile();
                    Scanner sc = new Scanner(System.in);
                    int idex = sc.nextInt();
                    Profile pr = profiles.get(idex - 1);
                    pr.addMessage(readMessages());
                    break;
                default:
                    System.out.println("Almaz say - poshel naher");
            }
        }
}
