import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Directory root = new Directory("root");

        FileSystemComponent currentDirectory = root;
        boolean running = true;
        System.out.println("Commands: pwd,ls, cd <dir>, mkfile <name>, mkdir <name>, exit");
        while (running) {
            System.out.print("linux@Majd:~" + currentDirectory.getName()+"$");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            switch (parts[0]) {
                case "ls":
                    currentDirectory.open();
                    break;
                case "cd":
                    if (parts.length > 1) {
                        if (parts[1].equals("..")) {
                            FileSystemComponent parentDir = currentDirectory.close();
                            if (parentDir instanceof Directory) {
                                currentDirectory = parentDir;
                            } else {
                                System.out.println("Already at the root directory.");
                            }
                        } else {
                            FileSystemComponent newDir = ((Directory) currentDirectory).move(parts[1]);
                            if (newDir instanceof Directory) {
                                currentDirectory = newDir;
                            } else {
                                System.out.println("Directory not found.");
                            }
                        }
                    } else {
                        System.out.println("Please specify a directory.");
                    }
                    break;
                case "pwd":
                    System.out.println(currentDirectory.getPath());
                    break;
                case "mkfile":
                    if (parts.length > 1) {
                        File newFile = new File(parts[1]);
                        ((Directory) currentDirectory).add(newFile);
                    } else {
                        System.out.println("Please specify a file name.");
                    }
                    break;
                case "mkdir":
                    if (parts.length > 1) {
                        Directory newDir = new Directory(parts[1]);
                        ((Directory) currentDirectory).add(newDir);
                    } else {
                        System.out.println("Please specify a directory name.");
                    }
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }

        scanner.close();


    }

}

////head ->
//        File file1 = new File("file1.txt");
//        File file2 = new File("file2.txt");
//
//        FileSystemComponent directory1 = new Directory("dir1");
//        Directory directory2 = new Directory("dir2");
//
//
//
//
//        ((Directory) directory1).add(file1);
//        directory2.add(file2);
//        ((Directory) directory1).add(directory2);
//        directory1.open();
//        System.out.println("===================================");
//        if (directory1.move("dir2") != null) {
//                directory1 = (Directory) directory1.move("dir2");// ---> d2
//                directory1.open();// --->f2
//                directory1= (File)directory1.move("file2.txt");
//                directory1 = (Directory)directory1.close();
//                directory1 = (Directory)directory1.close();
//        }else {
//            System.out.println("dir2 is not directory");
//        }
//        System.out.println("===================================");
//        directory1.open();
//