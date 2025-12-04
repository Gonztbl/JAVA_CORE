package ONTAP_Bai5;

import java.util.Arrays;

public class Library {
    private Item[] items;
    private int count;

    public Library(int soluong) {
        this.items = new Item[soluong];
        this.count = 0;
    }

    public void add(Item item) {
        if (count >= items.length) {
            return;
        }
        for (int i = 0; i < count; i++) {
            if (items[i].getTitle().equals(item.getTitle())) {
                System.out.println("Thong tin nay da co ");
            }
        }
        items[count] = item;
        count++;
        System.out.println("Them Item thanh cong");

    }

    public void remove(String name) {
        if (count == 0) {
            System.out.println("Danh sach rong");
            {
                return;
            }
        }
        for (int i = 0; i < count; i++) {
            if (items[i].getTitle().equals(name)) {
                items[i] = items[i + 1];
                count--;
                System.out.println("Xoa thanh cong");
                return;
            }
        }

    }

    public void findtitle(String findtitle) {
        if (count == 0) {
            System.out.println("Danh sach rong");
            {
                return;
            }
        }
        for (int i = 0; i < count; i++) {
            if (items[i].getTitle().equals(findtitle)) {
                System.out.println("Thong tin tim thay theo title");
                items[i].displayInfo();
            }
        }
    }

    public void showall() {
        if (count == 0) {
            System.out.println("Danh sach rong");
            {
                return;
            }
        }
        for (int i = 0; i < count; i++) {
            items[i].displayInfo();
        }
    }
}
