package ABSTRACT;

import java.util.List;

public class VietNamePhone extends Phone {

    @Override
    public void insertContact(String name, String phone) {
        // 1. Kiểm tra sự tồn tại của tên bằng vòng lặp for truyền thống
        for (int i = 0; i < contacts.size(); i++) {
            ConTact currentContact = contacts.get(i);
            if (currentContact.getName().equalsIgnoreCase(name)) {
                System.out.println("Error: Contact with name '" + name + "' already exists.");
                return; // Thoát khỏi phương thức nếu đã tồn tại
            }
        }

        // 2. Nếu không tìm thấy, thêm liên lạc mới
        ConTact newContact = new ConTact(name, phone);
        contacts.add(newContact);
        System.out.println("Success: Contact '" + name + "' inserted.");
    }

    @Override
    public void removeContact(String name) {
        // Để xóa một phần tử khi duyệt, cách an toàn là tìm chỉ số (index) trước, sau đó mới xóa
        int indexToRemove = -1; // -1 có nghĩa là không tìm thấy

        // 1. Tìm chỉ số của liên lạc cần xóa
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                indexToRemove = i;
                break; // Tìm thấy rồi, không cần tìm nữa
            }
        }

        // 2. Nếu tìm thấy (index != -1), tiến hành xóa
        if (indexToRemove != -1) {
            contacts.remove(indexToRemove);
            System.out.println("Success: Contact '" + name + "' removed.");
        } else {
            System.out.println("Error: Contact with name '" + name + "' not found.");
        }
    }

    @Override
    public void updateContact(String name, String newPhone) {
        // Dùng vòng lặp for để tìm và cập nhật
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                // Tìm thấy, cập nhật số điện thoại và thoát
                contacts.get(i).setPhone(newPhone);
                System.out.println("Success: Contact '" + name + "' updated.");
                return; // Thoát khỏi phương thức sau khi cập nhật xong
            }
        }

        // Nếu vòng lặp chạy hết mà không return, nghĩa là không tìm thấy
        System.out.println("Error: Contact with name '" + name + "' not found for updating.");
    }

    @Override
    public void searchContact(String name) {
        // Dùng vòng lặp for để tìm và hiển thị
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                // Tìm thấy, in thông tin và thoát
                System.out.println("Found contact: " + contacts.get(i));
                return; // Thoát khỏi phương thức sau khi tìm thấy
            }
        }

        // Nếu vòng lặp chạy hết mà không return, nghĩa là không tìm thấy
        System.out.println("Contact with name '" + name + "' not found.");
    }
}

