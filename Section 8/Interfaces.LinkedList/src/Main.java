import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album ("Stormbringer", "Deep purple");
        album.addSong("Stormbringer", 4.1);
        album.addSong("Song 1", 4.2);
        album.addSong("Song 2", 4.23);
        album.addSong("Song 3", 4.4);
        album.addSong("Song 4", 4.5);
        album.addSong("Song 5", 4.61);
        album.addSong("High ball shooter", 4.7);
        album.addSong("The gypsy", 4.68);
        album.addSong("Soldier of fortune", 4.9);
        albums.add(album);
        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For each for those about to rock", 3.32d);
        album.addSong("Song A", 8.32d);
        album.addSong("Song B", 6.31d);
        album.addSong("Song C", 4.33d);
        album.addSong("Song D", 3.34d);
        album.addSong("Song E", 2.35d);
        album.addSong("Song F", 1.36d);
        album.addSong("Song G", 3.37d);
        album.addSong("Song H", 5.38d);
        albums.add(album);

        List<Song> playlist = new ArrayList<>();
        albums.get(0).addToPlaylist("Song 1", playlist);
        albums.get(0).addToPlaylist("Song 2", playlist);
        albums.get(0).addToPlaylist("Song Z", playlist); // Does not exist
        albums.get(0).addToPlaylist(5, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(100, playlist); // Does not exist

        play(playlist);
    }

    private static void play(List<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean isForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in the playlist..");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist completed");
                    quit = true;
                    break;
                case 1:
                    if(!isForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        isForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have now reached the end of the playlist");
                        isForward = false;
                    }
                    break;
                case 2:
                    if(isForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        isForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have now reached the end of the playlist");
                        isForward = true;
                    }
                    break;
                case 3:
                    if(isForward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            isForward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            isForward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - Quit");
        System.out.println("1 - Play next song");
        System.out.println("2 - Play prev song");
        System.out.println("3 - Replay current song");
        System.out.println("4 - List songs in the playlist");
        System.out.println("5 - Print commands");
        System.out.println("6 - Remove current song from playlist");
    }

    private static void printList(List<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator(); // Only iterator because we are not going back / forward
        System.out.println("==============================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==============================");
    }

}